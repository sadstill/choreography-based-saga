package dto

data class OrderRequestDto(
    var userId: Int,
    var productId: Int,
    var amount: Int,
    var orderId: Long
)