package dto

import event.OrderStatus

data class CreateOrderResponse(
    val userId: Int,
    val productId: Int,
    val amount: Int,
    val orderId: Long,
    val orderStatus: OrderStatus
)