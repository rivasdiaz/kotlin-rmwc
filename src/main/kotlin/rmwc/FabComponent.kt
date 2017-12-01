@file:JsModule("rmwc/Fab")
package rmwc

import react.RState
import react.React
import react.ReactElement

external interface FabRootProps: SimpleTagProps, WithRippleProps {

    /** Make the Fab smaller. */
    var mini: Boolean?
}

external interface FabProps: FabRootProps

@JsName("Fab")
external class FabComponent: React.Component<FabProps, RState> {
    override fun render(): ReactElement
}
