package event

import dto.PaymentRequestDto
import java.util.*

data class PaymentEvent(
    val paymentRequestDto: PaymentRequestDto,
    val paymentStatus: PaymentStatus,
    override val eventId: UUID = UUID.randomUUID(),
    override val date: Date = Date()
) : Event() {

}