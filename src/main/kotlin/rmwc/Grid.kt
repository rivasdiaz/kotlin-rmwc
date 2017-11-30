package rmwc

import react.RBuilder
import react.RHandler
import react.RProps

fun RBuilder.grid(handler: RHandler<RProps>) = child(GridComponent::class, handler)

fun RBuilder.gridCell(handler: RHandler<GridCellProps>) = child(GridCellComponent::class, handler)

fun RBuilder.gridCell(
        span: Int,
        handler: RHandler<GridCellProps>) = child(GridCellComponent::class) {
    attrs {
        this.span = span
    }
    handler()
}

fun RBuilder.gridCell(
        phone: Int,
        tablet: Int,
        desktop: Int,
        handler: RHandler<GridCellProps>) = child(GridCellComponent::class) {
    attrs {
        this.phone = phone
        this.tablet = tablet
        this.desktop = desktop
    }
    handler()
}
