package com.glsid.ebanking_backend.repositories;

import java.util.stream.Stream;

import com.glsid.ebanking_backend.entities.BankAccount;
import com.glsid.ebanking_backend.entities.CurrentAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {


}
