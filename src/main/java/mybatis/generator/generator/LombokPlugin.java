package mybatis.generator.generator;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.internal.util.StringUtility;

import java.util.*;

/**
 * @author Will.D.Luk
 */
public class LombokPlugin extends PluginAdapter {
	private final Collection<Annotations> annotations;
	
	public LombokPlugin() {
		annotations = new LinkedHashSet<>(Annotations.values().length);
	}

	@Override
	public boolean validate(List<String> warnings) {
		return true;
	}

	@Override
	public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass,
                                                 IntrospectedTable introspectedTable) {
		addDataAnnotation(topLevelClass);

		topLevelClass.addJavaDocLine("/**");

		String remarks = introspectedTable.getRemarks();
		if (StringUtility.stringHasValue(remarks)) {
			String[] remarkLines = remarks.split(System.getProperty("line.separator"));
			for (String remarkLine : remarkLines) {
				topLevelClass.addJavaDocLine(" * " + remarkLine);
			}
		}

		topLevelClass.addJavaDocLine(" * 自动生成");
		topLevelClass.addJavaDocLine(" * ");
		topLevelClass.addJavaDocLine(" * @author " + System.getProperty("user.name"));
		topLevelClass.addJavaDocLine(" */");

		topLevelClass.addImportedType(new FullyQualifiedJavaType("java.io.Serializable"));
		topLevelClass.addSuperInterface(new FullyQualifiedJavaType("Serializable"));

		return true;
	}

	@Override
	public boolean modelFieldGenerated(Field field, TopLevelClass topLevelClass,
                                       IntrospectedColumn introspectedColumn,
                                       IntrospectedTable introspectedTable, ModelClassType modelClassType) {
		field.addJavaDocLine("/**");

		String remarks = introspectedColumn.getRemarks();
		if (StringUtility.stringHasValue(remarks)) {
			String[] remarkLines = remarks.split(System.getProperty("line.separator"));
			for (String remarkLine : remarkLines) {
				field.addJavaDocLine(" * " + remarkLine);
			}
		}

		field.addJavaDocLine(" */");
		return true;
	}

	@Override
	public boolean modelGetterMethodGenerated(Method method,
                                              TopLevelClass topLevelClass,
                                              IntrospectedColumn introspectedColumn,
                                              IntrospectedTable introspectedTable,
                                              ModelClassType modelClassType) {
		return false;
	}

	@Override
	public boolean modelSetterMethodGenerated(Method method,
                                              TopLevelClass topLevelClass,
                                              IntrospectedColumn introspectedColumn,
                                              IntrospectedTable introspectedTable,
                                              ModelClassType modelClassType) {
		return false;
	}



	@Override
	public boolean clientInsertMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
		method.addJavaDocLine("/**");
		method.addJavaDocLine(" * 插入记录，只赋值关键参数。创建、更新时间等数据库默认赋值。");
		method.addJavaDocLine(" * ");
		method.addJavaDocLine(" * @param record 新纪录");
		method.addJavaDocLine(" * @return 影响行数");
		method.addJavaDocLine(" */");
		return true;
	}

	@Override
	public boolean clientSelectByPrimaryKeyMethodGenerated(Method method,
                                                           Interface interfaze, IntrospectedTable introspectedTable) {
		method.addJavaDocLine("/**");
		method.addJavaDocLine(" * 根据主键Id查询一条记录。水平库需加上分区键字段。");
		method.addJavaDocLine(" * ");
		method.addJavaDocLine(" * @param id 主键");
		method.addJavaDocLine(" * @return 影响行数");
		method.addJavaDocLine(" */");
		return true;
	}

	@Override
	public boolean clientInsertSelectiveMethodGenerated(Method method, Interface interfaze,
                                                        IntrospectedTable introspectedTable) {
		return false;
	}


	@Override
	public boolean sqlMapInsertSelectiveElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
		return false;
	}

	@Override
	public boolean providerInsertSelectiveMethodGenerated(Method method, TopLevelClass topLevelClass,
                                                          IntrospectedTable introspectedTable) {
		return false;
	}
	
	private void addDataAnnotation(TopLevelClass topLevelClass) {
		for (Annotations annotation : annotations) {
			topLevelClass.addImportedType(annotation.javaType);
			topLevelClass.addAnnotation(annotation.name);
		}
	}

	@Override
	public void setProperties(Properties properties) {
		super.setProperties(properties);

		//@Data is default annotation
		annotations.add(Annotations.DATA);

		for (Map.Entry<Object, Object> entry : properties.entrySet()) {
			boolean isEnable = Boolean.parseBoolean(entry.getValue().toString());

			if (isEnable) {
				String paramName = entry.getKey().toString().trim();
				Annotations annotation = Annotations.getValueOf(paramName);
				if (annotation != null) {
					annotations.add(annotation);
					annotations.addAll(Annotations.getDependencies(annotation));
				}
			}
		}
	}

	private enum Annotations {
		/**
		 * Data
		 */
		DATA("data", "@Data", "lombok.Data"),
		/**
		 * Builder
		 */
		BUILDER("builder", "@Builder", "lombok.Builder"),
		/**
		 * AllArgsConstructor
		 */
		ALL_ARGS_CONSTRUCTOR("allArgsConstructor", "@AllArgsConstructor", "lombok.AllArgsConstructor"),
		/**
		 * NoArgsConstructor
		 */
		NO_ARGS_CONSTRUCTOR("noArgsConstructor", "@NoArgsConstructor", "lombok.NoArgsConstructor"),
		/**
		 * ToString
		 */
		TO_STRING("toString", "@ToString", "lombok.ToString");


		private final String paramName;
		private final String name;
		private final FullyQualifiedJavaType javaType;


		Annotations(String paramName, String name, String className) {
			this.paramName = paramName;
			this.name = name;
			this.javaType = new FullyQualifiedJavaType(className);
		}

		private static Annotations getValueOf(String paramName) {
			for (Annotations annotation : Annotations.values()) {
				if (String.CASE_INSENSITIVE_ORDER.compare(paramName, annotation.paramName) == 0) {
					return annotation;
				}
			}

			return null;
		}

		private static Collection<Annotations> getDependencies(Annotations annotation) {
			if (annotation == ALL_ARGS_CONSTRUCTOR) {
				return Collections.singleton(NO_ARGS_CONSTRUCTOR);
			} else {
				return Collections.emptyList();
			}
		}
	}
}
