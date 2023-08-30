package com.lamell.karin_ind_webservices.services;

import com.lamell.karin_ind_webservices.exceptions.ResourceNotFoundException;
import com.lamell.karin_ind_webservices.model.Address;
import com.lamell.karin_ind_webservices.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService implements AddressServiceInterface{

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    @Override
    public Address updateAddress(Address address, int addressId) {
        Address a = addressRepository.findById(addressId).orElseThrow(() -> new ResourceNotFoundException("Member", "Id", addressId));
        a.setStreet(address.getStreet());
        a.setPostalCode(address.getPostalCode());
        a.setCity(address.getCity());
        a.setCountry(address.getCountry());

        addressRepository.save(a);
        return a;

    }

    @Override
    public void deleteAddress(int addressId) {
        addressRepository.findById(addressId).orElseThrow(() -> new ResourceNotFoundException("Address", "Id", addressId));
        addressRepository.deleteById(addressId);

    }
}
