package flow.node.nodes

import flow.addressing.ID
import flow.node.FlowNode

object NullNode : FlowNode(
    id = ID("2f5eab47-bc93-4825-9e42-7b7f5dc180d0"),
    name = "Null",
    description = "A node that does nothing",
    execution = {
        it.logger.info("null node executed")
    },
)
