package dto

import event.OrderStatus
import event.PaymentStatus

data class OrderResponse(
    val id: Long,
    val userId: Int,
    val productId: Int,
    val price: Int,
    val orderStatus: OrderStatus,
    val paymentStatus: PaymentStatus
)