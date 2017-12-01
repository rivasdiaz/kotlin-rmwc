package rmwc

import react.RBuilder
import react.RHandler

fun RBuilder.snackbar(
        show: Boolean = false,
        message: String? = null,
        timeout: Int? = null,
        actionText: String? = null,
        multiline: Boolean = false,
        actionOnBottom: Boolean = false,
        dismissesOnAction: Boolean = true,
        alignStart: Boolean = false,
        handler: RHandler<SnackbarProps>) = child(SnackbarComponent::class) {
    attrs {
        this.show = show
        this.message = message
        this.timeout = timeout
        this.actionText = actionText
        this.multiline = multiline
        this.actionOnBottom = actionOnBottom
        this.dismissesOnAction = dismissesOnAction
        this.alignStart = alignStart
    }
    handler()
}
