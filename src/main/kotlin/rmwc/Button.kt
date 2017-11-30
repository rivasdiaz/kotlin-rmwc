package rmwc

import react.RBuilder
import react.RHandler

fun RBuilder.button(
        dense: Boolean = false,
        raised: Boolean = false,
        compact: Boolean = false,
        unelevated: Boolean = false,
        stroked: Boolean = false,
        handler: RHandler<ButtonProps>) = child(ButtonComponent::class) {
    attrs {
        this.dense = dense
        this.raised = raised
        this.compact = compact
        this.unelevated = unelevated
        this.stroked = stroked
    }
    handler()
}
