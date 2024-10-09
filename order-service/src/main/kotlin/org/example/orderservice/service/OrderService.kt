package org.example.orderservice.service

import dto.OrderRequestDto
import dto.OrderResponseDto
import org.springframework.http.ResponseEntity

interface OrderService {
    fun createOrder(orderRequestDto: OrderRequestDto): ResponseEntity<OrderResponseDto>
}