package flow.node.nodes

import flow.addressing.ID
import flow.node.FlowNode
import flow.node.FlowNodePin
import org.slf4j.event.Level

object LogNode : FlowNode(
    id = ID("2878470b-ebab-4d1c-9b5e-eca94c602689"),
    name = "Log",
    description = "writes its input to the log",
    inputs = listOf(
        FlowNodePin(name ="message", type = Any::class),
        FlowNodePin(name ="level", type = Level::class, default = Level.INFO)
    ),
    execution = {
        val level = it.getInputValue("level", Level.INFO)
        val message = it.getInputValue<String>("message")
        it.logger.makeLoggingEventBuilder(level).log(message)
    }
)