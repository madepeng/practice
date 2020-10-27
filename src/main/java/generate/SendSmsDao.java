package generate;

public interface SendSmsDao {
    int deleteByPrimaryKey(Long id);

    int insert(SendSms record);

    int insertSelective(SendSms record);

    SendSms selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SendSms record);

    int updateByPrimaryKey(SendSms record);
}