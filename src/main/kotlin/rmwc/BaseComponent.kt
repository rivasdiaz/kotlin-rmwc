package rmwc

import org.w3c.dom.events.Event
import react.RProps

external interface SimpleTagProps: RProps {

    /** The HTML tag to render in the DOM */
    var tag: String?


    var className: String?

    /** "collapse" an element onto its children */
    var wrap: Boolean?

    /** A theme option as a string, a space separated string for multiple values, or an array of valid theme options */
    var theme: Array<String>?

    /** TODO generic events must be removed from this interface */
    var onClick: (Event) -> Unit
}

var RProps.elementRef: (dynamic) -> Unit
    get() = error("elementRef cannot be read from props")
    set(value) {
        asDynamic().elementRef = value
    }

external interface WithRippleProps: RProps {

    /* Adds a ripple effect to the component */
    var ripple: Boolean?
}
