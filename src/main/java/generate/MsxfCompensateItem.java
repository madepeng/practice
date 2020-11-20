package generate;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * msxf_compensate_item
 * @author 
 */
@Data
public class MsxfCompensateItem implements Serializable {
    /**
     * 还款明细流水号
     */
    private String plSerialNo;

    /**
     * 还款计划流水号
     */
    private String psSerialNo;

    /**
     * 贷款账号(借据号)
     */
    private String loanNo;

    /**
     * 应还日期
     */
    private String payDate;

    private String actualPayDate;

    /**
     * 01 人民币
     */
    private String currency;

    /**
     * 应还本金
     */
    private BigDecimal payPrincipalAmt;

    /**
     * 实还本金
     */
    private BigDecimal actualPayPrincipalAmt;

    /**
     * 剩余本金余额
     */
    private BigDecimal principalBalance;

    /**
     * 应还利息
     */
    private BigDecimal payInterestAmt;

    /**
     * 实还利息
     */
    private BigDecimal actualPayinterestAmt;

    /**
     * 应还本金罚息
     */
    private BigDecimal payPrincipalPenaltyAmt;

    /**
     * 实还本金罚息
     */
    private BigDecimal actualPayPrincipalPenaltyAmt;

    private BigDecimal payInterestPenaltyAmt;

    private BigDecimal actualPayInterestPenaltyAmt;

    /**
     * 状态 1正常  2 失效
     */
    private String status;

    /**
     * 实还期次
     */
    private Integer periodNo;

    /**
     * 入账账号
     */
    private String inAccountNo;

    private static final long serialVersionUID = 1L;
}