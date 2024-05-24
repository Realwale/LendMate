package com.backend.lendmate.loanengine.domain.request;

import lombok.*;

import java.math.BigDecimal;
import java.time.Duration;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoanRequest {

    private BigDecimal loanAmount;
    private int repaymentTerm;
    private long borrowerId;
    private BigDecimal interestRate;
}
