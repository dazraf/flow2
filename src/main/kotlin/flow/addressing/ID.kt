package flow.addressing

import java.util.*

data class ID(val value: UUID = UUID.randomUUID()) {
    constructor(value: String): this(UUID.fromString(value))
}
