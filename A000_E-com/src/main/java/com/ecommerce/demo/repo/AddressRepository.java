package com.ecommerce.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.demo.model.*;
import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {
	 List<Address> findByUser(User user);;
}