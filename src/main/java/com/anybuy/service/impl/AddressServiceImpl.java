package com.anybuy.service.impl;

import com.anybuy.model.Address;
import com.anybuy.service.AddressService;
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
public class AddressServiceImpl extends BaseService<Address> implements AddressService {

    @Override
    public int saveAddress(Address address) {
        return super.insertSelective(address);
    }

    @Override
    public int updateAddress(Address address) {
        return super.updateByPrimaryKeySelective(address);
    }

    @Override
    public int deleteAddress(Long id) {
        return super.deleteByPrimaryKey(id);
    }

    @Override
    public List<Address> findAllAddresssByPage(int pageNum) {
        Example example = new Example(Address.class);
        example.setOrderByClause("id desc");
        return super.selectByExample4Page(pageNum, example);
    }

    @Override
    public Address getAddress(Long id) {
        return super.selectByPrimaryKey(id);
    }
}
