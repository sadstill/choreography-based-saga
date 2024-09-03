package event

import java.util.*

interface Event {
    val eventId: UUID
    val date: Date
}