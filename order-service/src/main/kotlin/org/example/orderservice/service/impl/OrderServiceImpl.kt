package org.example.orderservice.service.impl

import dto.CreateOrderRequest
import dto.CreateOrderResponse
import dto.OrderResponse
import event.OrderStatus
import org.example.orderservice.entity.Order
import org.example.orderservice.mapper.OrderMapper
import org.example.orderservice.repository.OrderRepository
import org.example.orderservice.service.OrderService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class OrderServiceImpl(
    private val orderRepository: OrderRepository,
    private val orderEventPublisher: OrderEventPublisher,
    private val orderMapper: OrderMapper
): OrderService {
    @Transactional
    override fun createOrder(createOrderRequest: CreateOrderRequest): CreateOrderResponse {
        val order: Order = orderMapper.createOrderRequestToOrder(createOrderRequest)
        val savedOrder = orderRepository.save(order)

        createOrderRequest.orderId = savedOrder.id
        orderEventPublisher.publishOrderEvent(createOrderRequest, OrderStatus.ORDER_CREATED)

        return CreateOrderResponse(savedOrder.userId,
            savedOrder.productId,
            savedOrder.price,
            savedOrder.id,
            savedOrder.orderStatus)
    }

    override fun getAllOrders(): List<OrderResponse> {
        val orders = orderRepository.findAll()
        return orders.map { orderMapper.orderToOrderResponse(it) }
    }
}