package org.example.orderservice.repository

import org.example.orderservice.entity.Order
import org.springframework.data.jpa.repository.JpaRepository

interface OrderRepository : JpaRepository<Order, Long>