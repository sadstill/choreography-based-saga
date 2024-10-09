package org.example.orderservice.service.impl

import dto.CreateOrderRequest
import event.Event
import event.OrderEvent
import event.OrderStatus
import org.springframework.stereotype.Service
import reactor.core.publisher.Sinks

@Service
class OrderEventPublisher(
    private val orderSinks: Sinks.Many<Event>
) {
//    fun publishOrderEvent(createOrderRequest: CreateOrderRequest, orderStatus: OrderStatus) {
//        val orderEvent: Event = OrderEvent(createOrderRequest, orderStatus)
//        orderSinks.tryEmitNext(orderEvent)
//    }
}