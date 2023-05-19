package com.atif.bankingWebapp.repositories;

import com.atif.bankingWebapp.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
