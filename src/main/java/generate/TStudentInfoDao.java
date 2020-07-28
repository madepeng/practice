package generate;

public interface TStudentInfoDao {
    int deleteByPrimaryKey(Integer stuId);

    int insert(TStudentInfo record);

    int insertSelective(TStudentInfo record);

    TStudentInfo selectByPrimaryKey(Integer stuId);

    int updateByPrimaryKeySelective(TStudentInfo record);

    int updateByPrimaryKey(TStudentInfo record);
}