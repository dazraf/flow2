package flow.node

import flow.addressing.ID

fun interface FlowNodeExecution {
    fun invoke(context: FlowNodeExecutionContext)

}
