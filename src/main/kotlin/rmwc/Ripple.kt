package rmwc

import react.RBuilder
import react.RHandler

fun RBuilder.ripple(
        primary: Boolean = false,
        accent: Boolean = false,
        unbounded: Boolean = false,
        handler: RHandler<RippleProps>) = child(RippleComponent::class) {
    attrs {
        this.primary = primary
        this.accent = accent
        this.unbounded = unbounded
    }
    handler()
}
