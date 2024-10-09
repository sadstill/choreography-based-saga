package event

import dto.CreatePaymentRequest
import java.util.*

data class PaymentEvent(
    val createPaymentRequest: CreatePaymentRequest,
    val paymentStatus: PaymentStatus,
    override val eventId: UUID = UUID.randomUUID(),
    override val date: Date = Date()
) : Event() {

}