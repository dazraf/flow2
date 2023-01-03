package flow.node.nodes

import flow.node.FlowNodeExecutionContext
import org.mockito.Mockito.mock
import kotlin.test.Test

class KotlinScriptNodeTest {
    @Test
    fun `test script`() {
        val context = mock(FlowNodeExecutionContext::class.java)
        KotlinScriptNode.execution.invoke(context)
    }
}