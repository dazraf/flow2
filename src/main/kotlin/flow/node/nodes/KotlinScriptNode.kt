package flow.node.nodes

import flow.addressing.ID
import flow.node.FlowNode
import flow.node.FlowNodePin
import javax.script.ScriptEngineManager

object KotlinScriptNode: FlowNode(
 id = ID("394fea2c-f55b-490e-89a5-4dd5a0e6b729"),
 name = "KotlinScript",
 description = "Runs a Kotlin script",
 inputs = listOf(FlowNodePin("data", Any::class)),
 outputs = listOf(FlowNodePin("result", Any::class)),
 execution = {
  val engine = ScriptEngineManager().getEngineByExtension("kts")!!
  engine.eval("val x = 3")
  println(engine.eval("x + 2"))  // Prints out 5
 }
)
