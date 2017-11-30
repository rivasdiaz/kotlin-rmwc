@file:JsModule("rmwc/Snackbar")
package rmwc

import react.RProps
import react.RState
import react.React
import react.ReactElement

external interface SnackbarProps: RProps {

    /** Show the Snackbar. */
    var show: Boolean?

    /** A callback thats fired when the Snackbar closes. */
    var onClose: () -> Unit

    /** A string or other renderable JSX to be used as the message body. */
    var message: String?

    /** Milliseconds to show the Snackbar for. */
    var timeout: Int?

    /** Callback that fires when action is pressed. The actionText property must be set to use this. */
    var actionHandler: () -> Unit

    /** Label for the action button. */
    var actionText: String?

    /** Lets the Snackbar text overflow onto multiple lines. */
    var multiline: Boolean?

    /** Places the action underneath the message text. */
    var actionOnBottom: Boolean?

    /** Whether or not the Snackbar dismisses on the action press. */
    var dismissesOnAction: Boolean?
}

@JsName("Snackbar")
external class SnackbarComponent : React.Component<SnackbarProps, RState> {
    override fun render(): ReactElement
}
