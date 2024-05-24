package com.backend.lendmate.loanengine.service.loan;

import com.backend.lendmate.loanengine.domain.request.LoanRequest;

public interface LoanApplicationService {

    String applyLoan(LoanRequest request);
}
