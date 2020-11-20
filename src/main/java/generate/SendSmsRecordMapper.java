package generate;

public interface SendSmsRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SendSmsRecord record);

    int insertSelective(SendSmsRecord record);

    SendSmsRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SendSmsRecord record);

    int updateByPrimaryKey(SendSmsRecord record);
}