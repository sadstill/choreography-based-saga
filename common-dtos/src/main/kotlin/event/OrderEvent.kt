package event

import dto.OrderRequestDto
import java.util.*

data class OrderEvent(
    val orderRequestDto: OrderRequestDto,
    val orderStatus: OrderStatus,
    override val eventId: UUID = UUID.randomUUID(),
    override val date: Date = Date()
) : Event() {
    constructor(orderRequestDto: OrderRequestDto, orderStatus: OrderStatus) :
            this(orderRequestDto, orderStatus, UUID.randomUUID(), Date())
}