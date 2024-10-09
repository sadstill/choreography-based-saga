package org.example.orderservice.service.impl

import dto.OrderRequestDto
import dto.OrderResponseDto
import org.example.orderservice.entity.OrderProcess
import org.example.orderservice.mapper.OrderMapper
import org.example.orderservice.repository.OrderRepository
import org.example.orderservice.service.OrderService
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class OrderServiceImpl(
    private val orderRepository: OrderRepository,
    private val orderMapper: OrderMapper
): OrderService {
    override fun createOrder(orderRequestDto: OrderRequestDto): ResponseEntity<OrderResponseDto> {
        val orderProcess: OrderProcess = orderMapper.toOrderProcess(orderRequestDto)
        val savedOrder = orderRepository.save(orderProcess)
        orderRequestDto.orderId = savedOrder.id

        // produce kafka event
    }
}