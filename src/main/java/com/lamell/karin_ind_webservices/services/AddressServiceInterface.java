package com.lamell.karin_ind_webservices.services;

import com.lamell.karin_ind_webservices.model.Address;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressServiceInterface  {
    Address saveAddress(Address address);
    List<Address> getAllAddresses();
    Address updateAddress(Address address, int addressId);
    void deleteAddress(int id);
}
