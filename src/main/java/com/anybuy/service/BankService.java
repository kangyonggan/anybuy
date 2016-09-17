package com.anybuy.service;

import com.anybuy.model.Bank;

import java.util.List;

/**
 * @author houbinbin
 * @since 2016/09/17
 */
public interface BankService {

    List<Bank> findAllBanksByPage(int pageNum);

    Bank getBank(Long id);

    int saveBank(Bank bank);

    int updateBank(Bank bank);

    int deleteBank(Long id);

}