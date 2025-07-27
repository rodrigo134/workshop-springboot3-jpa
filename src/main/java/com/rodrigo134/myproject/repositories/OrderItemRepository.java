package com.rodrigo134.myproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo134.myproject.entities.OrderItem;


//JPa ja é registrado, nao precisa anotação @Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{

}
