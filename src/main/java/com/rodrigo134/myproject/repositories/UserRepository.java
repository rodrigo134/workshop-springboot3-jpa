package com.rodrigo134.myproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo134.myproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
