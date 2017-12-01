@file:JsModule("rmwc/Card")
package rmwc

import react.RState
import react.React
import react.ReactElement

@JsName("CardPrimary")
external class CardPrimaryComponent: React.Component<SimpleTagProps, RState> {
    override fun render(): ReactElement
}

external interface CardTitleProps: SimpleTagProps {
    /** Make the title large. */
    var large: Boolean
}

@JsName("CardTitle")
external class CardTitleComponent: React.Component<CardTitleProps, RState> {
    override fun render(): ReactElement
}

@JsName("CardSubtitle")
external class CardSubtitleComponent: React.Component<SimpleTagProps, RState> {
    override fun render(): ReactElement
}

@JsName("CardSupportingText")
external class CardSupportingTextComponent: React.Component<SimpleTagProps, RState> {
    override fun render(): ReactElement
}

@JsName("CardActions")
external class CardActionsComponent: React.Component<SimpleTagProps, RState> {
    override fun render(): ReactElement
}

@JsName("CardMedia")
external class CardMediaComponent: React.Component<SimpleTagProps, RState> {
    override fun render(): ReactElement
}

@JsName("CardHorizontalBlock")
external class CardHorizontalBlockComponent: React.Component<SimpleTagProps, RState> {
    override fun render(): ReactElement
}

@JsName("CardAction")
external class CardActionComponent: React.Component<ButtonProps, RState> {
    override fun render(): ReactElement
}

external interface CardProps: SimpleTagProps {
    /** Use the cards dark theme. */
    var themeDark: Boolean
}

@JsName("Card")
external class CardComponent: React.Component<CardProps, RState> {
    override fun render(): ReactElement
}
