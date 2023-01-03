package flow.graph

import flow.addressing.ID
import flow.node.FlowNode

data class FlowGraph(val id: ID, val nodes: Map<ID, FlowNode> = emptyMap()) {
    fun addNodes(nodes: List<FlowNode>): FlowGraph {
        return copy(nodes = this.nodes.toMutableMap().apply { putAll(nodes.map { it.id to it }) })
    }
}
