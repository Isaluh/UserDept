package com.isaluh.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.isaluh.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
