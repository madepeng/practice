package generate;

public interface MsxfCompensateItemDao {
    int deleteByPrimaryKey(String plSerialNo);

    int insert(MsxfCompensateItem record);

    int insertSelective(MsxfCompensateItem record);

    MsxfCompensateItem selectByPrimaryKey(String plSerialNo);

    int updateByPrimaryKeySelective(MsxfCompensateItem record);

    int updateByPrimaryKey(MsxfCompensateItem record);
}