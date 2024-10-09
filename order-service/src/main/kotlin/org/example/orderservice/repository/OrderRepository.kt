package org.example.orderservice.repository

import org.example.orderservice.entity.OrderProcess
import org.springframework.data.jpa.repository.JpaRepository

interface OrderRepository : JpaRepository<OrderProcess, Long>