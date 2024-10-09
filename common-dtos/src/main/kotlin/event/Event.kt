package event

import java.util.*

abstract class Event {
    abstract val eventId: UUID
    abstract val date: Date
}