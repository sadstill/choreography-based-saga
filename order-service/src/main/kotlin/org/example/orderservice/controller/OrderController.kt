package org.example.orderservice.controller

import dto.CreateOrderRequest
import dto.CreateOrderResponse
import dto.OrderResponse
import org.example.orderservice.service.OrderService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/order")
class OrderController(private val orderService: OrderService) {
    @GetMapping
    fun getAllOrders(): ResponseEntity<List<OrderResponse>> {
        return ResponseEntity.ok(orderService.getAllOrders())
    }

    @PostMapping
    fun createOrder(@RequestBody createOrderRequest: CreateOrderRequest): ResponseEntity<CreateOrderResponse> {
        return ResponseEntity.ok(null)
    }
}