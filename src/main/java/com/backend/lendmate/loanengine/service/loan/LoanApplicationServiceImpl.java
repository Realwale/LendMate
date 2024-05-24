package com.backend.lendmate.loanengine.service.loan;

import com.backend.lendmate.loanengine.domain.dao.AppUserRepository;
import com.backend.lendmate.loanengine.domain.dao.LoanApplicationRepo;
import com.backend.lendmate.loanengine.domain.entity.AppUser;
import com.backend.lendmate.loanengine.domain.entity.LoanApplication;
import com.backend.lendmate.loanengine.domain.request.LoanRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class LoanApplicationServiceImpl implements LoanApplicationService{

    private final AppUserRepository userRepository;
    private final LoanApplicationRepo loanApplicationRepo;


    @Override
    public String applyLoan(LoanRequest request) {
        Optional<AppUser> user = userRepository.findById(request.getBorrowerId());

        if (user.isPresent()){
            LoanApplication application = LoanApplication.builder()
                    .loanAmount(request.getLoanAmount())
                    .interestRate(request.getInterestRate())
                    .repaymentTerm(Duration.ofDays(request.getRepaymentTerm()))
                    .borrower(user.get())
                    .build();
            loanApplicationRepo.save(application);
            return "Loan request submitted successfully.";
        }else {
            throw new IllegalArgumentException("User not found");
        }
    }
}
