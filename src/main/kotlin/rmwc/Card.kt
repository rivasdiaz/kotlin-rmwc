package rmwc

import react.RBuilder
import react.RHandler

fun RBuilder.cardPrimary(handler: RHandler<SimpleTagProps>) = child(CardPrimaryComponent::class, handler)

fun RBuilder.cardTitle(
        large: Boolean = false,
        handler: RHandler<CardTitleProps>) = child(CardTitleComponent::class) {
    attrs {
        this.large = large
    }
    handler()
}

fun RBuilder.cardSubtitle(handler: RHandler<SimpleTagProps>) = child(CardSubtitleComponent::class, handler)

fun RBuilder.cardSupportingText(handler: RHandler<SimpleTagProps>) = child(CardSupportingTextComponent::class, handler)

fun RBuilder.cardActions(handler: RHandler<SimpleTagProps>) = child(CardActionsComponent::class, handler)

fun RBuilder.cardMedia(handler: RHandler<SimpleTagProps>) = child(CardMediaComponent::class, handler)

fun RBuilder.cardHorizontalBlock(handler: RHandler<SimpleTagProps>) = child(CardHorizontalBlockComponent::class, handler)

fun RBuilder.cardAction(handler: RHandler<SimpleTagProps>) = child(CardActionComponent::class, handler)

fun RBuilder.card(
        themeDark: Boolean = false,
        handler: RHandler<CardProps>) = child(CardComponent::class) {
    attrs {
        this.themeDark = themeDark
    }
    handler()
}
