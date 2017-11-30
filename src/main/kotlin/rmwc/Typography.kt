package rmwc

import react.RBuilder
import react.RHandler

enum class TypographyType {
    DISPLAY1, DISPLAY2, DISPLAY3, DISPLAY4,
    HEADLINE, TITLE,
    SUBHEADING1, SUBHEADING2,
    BODY1, BODY2,
    CAPTION, BUTTON
}

fun RBuilder.typography(
        use: TypographyType,
        adjustMargin: Boolean = false,
        handler: RHandler<TypographyProps>) = child(TypographyComponent::class) {
    attrs {
        this.use = use.name.toLowerCase()
        this.adjustMargin = adjustMargin
    }
    handler()
}
