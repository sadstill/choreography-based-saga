package dto

import event.OrderStatus

data class OrderResponseDto(
    val userId: Int,
    val productId: Int,
    val amount: Int,
    val orderId: Int,
    val orderStatus: OrderStatus
)