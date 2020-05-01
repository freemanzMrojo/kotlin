// WITH_RUNTIME

fun box(): String {
    try {
        "a b c".trimMargin(" ")
        return "Fail trimMargin"
    } catch (e: IllegalArgumentException) {
        return "OK"
    }
}
