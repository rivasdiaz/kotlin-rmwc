package rmwc

import react.RBuilder
import react.RHandler

fun RBuilder.fab(
        mini: Boolean = false,
        handler: RHandler<FabProps>) = child(FabComponent::class) {
    attrs {
        this.mini = mini
    }
    handler()
}
