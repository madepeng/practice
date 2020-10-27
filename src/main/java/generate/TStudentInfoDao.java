package generate;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TStudentInfoDao {
    long countByExample(TStudentInfoExample example);

    int deleteByExample(TStudentInfoExample example);

    int deleteByPrimaryKey(Integer stuId);

    int insert(TStudentInfo record);

    int insertSelective(TStudentInfo record);

    List<TStudentInfo> selectByExample(TStudentInfoExample example);

    TStudentInfo selectByPrimaryKey(Integer stuId);

    int updateByExampleSelective(@Param("record") TStudentInfo record, @Param("example") TStudentInfoExample example);

    int updateByExample(@Param("record") TStudentInfo record, @Param("example") TStudentInfoExample example);

    int updateByPrimaryKeySelective(TStudentInfo record);

    int updateByPrimaryKey(TStudentInfo record);
}