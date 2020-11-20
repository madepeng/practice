package generate;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * send_sms_record
 * @author 
 */
@Data
public class SendSmsRecord implements Serializable {
    /**
     * 自增主键
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 更新时间
     */
    private Date modified;

    /**
     * 发送日期
     */
    private Integer sendDate;

    /**
     * 客户号
     */
    private Long customerId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 交易状态
     */
    private Byte loanStatus;

    /**
     * 借款金额字符串
     */
    private String loanAmountStr;

    /**
     * 外部流水号字符串
     */
    private String outerTransactionIdStr;

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
     * 0新建,1发送短信成功,2发送短信失败,3发送短信前失败
     */
    private Byte status;

    /**
     * 发送失败原因
     */
    private String sendFailReason;

    /**
     * 重试发送次数
     */
    private Integer retryTimes;

    private static final long serialVersionUID = 1L;
}