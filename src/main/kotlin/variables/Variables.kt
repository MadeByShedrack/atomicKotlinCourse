package variables

fun main() {
    val popcorn = 5
    println(popcorn)

    val hotdog = 7
    println(hotdog)

    var customers = 12
    println(customers)

    customers = 120
    println(customers)

    println("Kindness Status -> $isKind")

    val myCustomer = 10
    println("There are $myCustomer customers")

    println("There are ${myCustomer + 1} customers")
}

val isKind: Boolean = true