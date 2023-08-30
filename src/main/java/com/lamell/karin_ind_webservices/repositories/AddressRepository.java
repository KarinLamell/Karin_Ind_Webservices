package com.lamell.karin_ind_webservices.repositories;

import com.lamell.karin_ind_webservices.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
