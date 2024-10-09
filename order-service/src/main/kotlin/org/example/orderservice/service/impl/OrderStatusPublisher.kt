package org.example.orderservice.service.impl

import dto.OrderRequestDto
import event.Event
import event.OrderEvent
import event.OrderStatus
import org.springframework.stereotype.Service
import reactor.core.publisher.Sinks

@Service
class OrderStatusPublisher(
    private val orderSinks: Sinks.Many<Event>
) {
    fun publishOrderEvent(orderRequestDto: OrderRequestDto, orderStatus: OrderStatus) {
        val event: Event = OrderEvent(orderRequestDto, orderStatus)
    }
}