@file:JsModule("rmwc/Button")
package rmwc

import react.RState
import react.React
import react.ReactElement

external interface ButtonProps: SimpleTagProps, WithRippleProps {

    /** Make the Button dense. */
    var dense: Boolean?

    /** Make the Button raised. */
    var raised: Boolean?

    /** Reduce the Button's padding. */
    var compact: Boolean?

    /** Make the button unelevated. */
    var unelevated: Boolean?

    /** Make the button stroked. */
    var stroked: Boolean?
}

@JsName("Button")
external class ButtonComponent: React.Component<ButtonProps, RState> {
    override fun render(): ReactElement
}
