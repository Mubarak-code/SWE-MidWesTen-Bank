package com.example.MidWestTenBank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MidWestTenBank.model.AccountType;

@Repository
public interface AccountTypeRepository extends JpaRepository<AccountType, Integer> {

}
