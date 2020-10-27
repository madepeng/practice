package generate;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * send_sms
 * @author 
 */
@Data
public class SendSms implements Serializable {
    /**
     * 自增主键
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 修改时间
     */
    private Date modified;

    /**
     * 账务日期
     */
    private Date accountDate;

    /**
     * 客户号
     */
    private Long customerId;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 借款金额
     */
    private String loanAmount;

    /**
     * 外部流水号
     */
    private String outerTransactionId;

    /**
     * 产品
     */
    private String productId;

    /**
     * 发送参数
     */
    private String params;

    /**
     * 发送短信流水号
     */
    private String transactionId;

    /**
     * 0新建,1成功,2失败
     */
    private Byte status;

    private static final long serialVersionUID = 1L;
}