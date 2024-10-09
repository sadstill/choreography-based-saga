package event

import java.util.*

data class OrderEvent(
    var userId: Int,
    var productId: Int,
    var amount: Int,
    var orderId: Long,
    val orderStatus: OrderStatus,
    override val eventId: UUID = UUID.randomUUID(),
    override val date: Date = Date()
) : Event()