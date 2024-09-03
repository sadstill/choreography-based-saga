package event

import dto.OrderRequestDto
import java.util.*

data class OrderEventImpl(
    override val eventId: UUID = UUID.randomUUID(),
    override val date: Date = Date(),
    val orderRequestDto: OrderRequestDto,
    val orderStatus: OrderStatusEnum
) : Event