package functions

fun main() {
    hello()
    hello()
    val result = sum(120, 45)
    println("The result is $result")
}

fun hello() {
    return println("Hello this is a function")
}

fun sum(x: Int, y: Int): Int {
    val addNumbers = x + y
    return addNumbers
}