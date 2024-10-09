package dto

data class CreateOrderRequest(
    var userId: Int,
    var productId: Int,
    var amount: Int,
    var orderId: Long
)