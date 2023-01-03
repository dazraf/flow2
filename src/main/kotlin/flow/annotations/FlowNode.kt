package flow.annotations

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class FlowNode(val id: String, val name: String, val description: String = "")