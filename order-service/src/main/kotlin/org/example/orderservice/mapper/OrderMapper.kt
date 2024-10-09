package org.example.orderservice.mapper

import dto.CreateOrderRequest
import dto.OrderResponse
import org.example.orderservice.entity.Order
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper
interface OrderMapper {
    @Mapping(target = "orderStatus", expression = "java(OrderStatus.ORDER_CREATED)")
    fun createOrderRequestToOrder(createOrderRequest: CreateOrderRequest): Order

    fun orderToOrderResponse(order: Order): OrderResponse
}