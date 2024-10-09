package org.example.orderservice.service

import dto.CreateOrderRequest
import dto.CreateOrderResponse
import dto.OrderResponse

interface OrderService {
    fun createOrder(createOrderRequest: CreateOrderRequest): CreateOrderResponse
    fun getAllOrders(): List<OrderResponse>
}