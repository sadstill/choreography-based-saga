package org.example.orderservice.controller

import dto.OrderRequestDto
import dto.OrderResponseDto
import org.example.orderservice.service.OrderService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/order")
class OrderController(private val orderService: OrderService) {
    @PostMapping
    fun createOrder(@RequestBody orderRequestDto: OrderRequestDto): ResponseEntity<OrderResponseDto> {

    }
}