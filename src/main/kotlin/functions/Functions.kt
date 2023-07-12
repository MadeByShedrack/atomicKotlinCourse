package functions

fun main() {
    hello()
    hello()
    val result = sum(120, 45)
    println("The result is $result")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Welcome To Teranova")
    printMessage("Hello world new user")
}

fun hello() {
    return println("Hello this is a function")
}

fun sum(x: Int, y: Int): Int {
    val addNumbers = x + y
    return addNumbers
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun printMessage(message: String) {
    println("Message -> $message")
}