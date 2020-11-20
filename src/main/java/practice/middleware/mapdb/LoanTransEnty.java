package practice.middleware.mapdb;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanTransEnty {

    /**
     * 外部流水
     */
    private String outerTransactionId;

    /**
     * 借据号
     */
    private String loanId;

    /**
     * 借款金额
     */
    private Long loanAmt;

    /**
     * 借款期数
     */
    private Integer installmentCount;

    /**
     * 账务日期
     */
    private String accountDate;

    /**
     * 交易状态
     */
    private Integer loanStatus;
}
