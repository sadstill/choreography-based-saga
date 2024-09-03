package event

import dto.PaymentRequestDto
import java.util.*

class PaymentEventImpl {
    data class PaymentEvent(
        override val eventId: UUID = UUID.randomUUID(),
        override val date: Date = Date(),
        val paymentRequestDto: PaymentRequestDto,
        val paymentStatus: PaymentStatusEnum
    ) : Event
}