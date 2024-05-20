package com.backend.lendmate.loanengine.domain.dao;

import com.backend.lendmate.loanengine.domain.entity.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanApplicationRepo extends JpaRepository<LoanApplication, Long> {
}
