package com.rodrigo134.myproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo134.myproject.entities.Order;


//JPa ja é registrado, nao precisa anotação @Repository
public interface OrderRepository extends JpaRepository<Order , Long>{

}
