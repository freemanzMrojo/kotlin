// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM

var result = "FAIL"

fun box(): String {
    val r = Runnable { result = "OK" }
    r.run()
    return result
}