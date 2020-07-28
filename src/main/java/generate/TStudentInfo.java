package generate;

import lombok.Data;

import java.io.Serializable;

/**
 * t_student_info
 * @author 
 */
@Data
public class TStudentInfo implements Serializable {
    /**
     * 编号
     */
    private Integer stuId;

    /**
     * 学号
     */
    private Integer stuNumber;

    /**
     * 姓名
     */
    private String stuName;

    /**
     * 性别
     */
    private String stuGender;

    /**
     * 年龄
     */
    private Integer stuAge;

    /**
     * 成绩
     */
    private Integer stuScore;

    private static final long serialVersionUID = 1L;
}