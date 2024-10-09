package org.example.orderservice.mapper

import dto.OrderRequestDto
import org.example.orderservice.entity.OrderProcess
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper
interface OrderMapper {
    @Mapping(target = "orderStatus", expression = "java(OrderStatus.ORDER_CREATED)")
    fun toOrderProcess(orderRequestDto: OrderRequestDto): OrderProcess
}