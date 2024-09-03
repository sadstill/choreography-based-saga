package dto

import event.OrderStatusEnum

data class OrderResponseDto(
    val userId: Int,
    val productId: Int,
    val amount: Int,
    val orderId: Int,
    val orderStatus: OrderStatusEnum
)