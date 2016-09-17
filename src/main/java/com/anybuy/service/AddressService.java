package com.anybuy.service;

import com.anybuy.model.Address;

import java.util.List;

/**
 * @author houbinbin
 * @since 2016/09/17
 */
public interface AddressService {

    List<Address> findAllAddresssByPage(int pageNum);

    Address getAddress(Long id);

    int saveAddress(Address address);

    int updateAddress(Address address);

    int deleteAddress(Long id);

}