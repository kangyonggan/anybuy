package com.anybuy.service.impl;

import com.anybuy.model.Bank;
import com.anybuy.service.BankService;
import tk.mybatis.mapper.entity.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author houbinbin
 * @since 2016/09/17
 */
@Service
@Transactional
public class BankServiceImpl extends BaseService<Bank> implements BankService {

    @Override
    public int saveBank(Bank bank) {
        return super.insertSelective(bank);
    }

    @Override
    public int updateBank(Bank bank) {
        return super.updateByPrimaryKeySelective(bank);
    }

    @Override
    public int deleteBank(Long id) {
        return super.deleteByPrimaryKey(id);
    }

    @Override
    public List<Bank> findAllBanksByPage(int pageNum) {
        Example example = new Example(Bank.class);
        example.setOrderByClause("id desc");
        return super.selectByExample4Page(pageNum, example);
    }

    @Override
    public Bank getBank(Long id) {
        return super.selectByPrimaryKey(id);
    }
}
