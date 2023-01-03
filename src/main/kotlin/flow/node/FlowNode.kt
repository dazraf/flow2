package flow.node

import flow.addressing.ID

abstract class FlowNode(
    val id: ID,
    val name: String,
    val description: String = "",
    val inputs: List<FlowNodePin> = emptyList(),
    val outputs: List<FlowNodePin> = emptyList(),
    val execution: FlowNodeExecution
)
