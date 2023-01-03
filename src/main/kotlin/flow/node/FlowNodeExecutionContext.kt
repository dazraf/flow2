package flow.node

import org.slf4j.Logger

interface FlowNodeExecutionContext {
    val logger: Logger
    fun <T> getInputValue(pinName: String, default: T? = null): T
    fun <T> setOutputValue(pinName: String, value: T)
    // TODO: logging
    // TODO: raising exceptions
    // TODO: execution id and provenance - OpenTrace styles identifiers?
}
