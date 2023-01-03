package flow.node

import kotlin.reflect.KClass
import kotlin.reflect.KType
import kotlin.reflect.full.starProjectedType

data class FlowNodePin(
    val name: String,
    val type: KType,
    val required: Boolean = true,
    val default: Any? = null
) {
    constructor(
        name: String,
        type: KClass<*>,
        required: Boolean = true,
        default: Any? = null
    ) : this(
        name,
        type.starProjectedType,
        required,
        default
    )
}
