package mybatis.generator.generator;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

import java.sql.Types;

/**
 * 强制Mysql TINYINT/SMALLINT映射为Java Integer类型
 *
 * @author Will.D.Luk
 */
public class JavaTypeResolverForceIntegerImpl extends JavaTypeResolverDefaultImpl {
	public JavaTypeResolverForceIntegerImpl() {
		super();
		typeMap.put(Types.SMALLINT, new JdbcTypeInformation("SMALLINT",
			new FullyQualifiedJavaType(Integer.class.getName())));
		typeMap.put(Types.TINYINT, new JdbcTypeInformation("TINYINT",
			new FullyQualifiedJavaType(Integer.class.getName())));
	}
}
