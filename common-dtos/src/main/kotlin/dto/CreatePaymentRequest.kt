package dto

data class CreatePaymentRequest(
    val orderId: Int,
    val userId: Int,
    val amount: Int
)
