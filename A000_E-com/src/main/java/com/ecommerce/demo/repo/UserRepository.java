package com.ecommerce.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.demo.dto.UserDto;
import com.ecommerce.demo.model.*;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    
    List<User> findByRoleId(Long id);
}