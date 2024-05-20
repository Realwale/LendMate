package com.backend.lendmate.loanengine.domain.dao;

import com.backend.lendmate.loanengine.domain.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
}
