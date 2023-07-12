package ranges

fun main() {
    for (index in 1..4) {
        println("Hello world $index")
    }

    for (number in 1 until 120) {
        println("Numbers -> $number")
    }

    for (downTo in 20 downTo 1) {
        println("Down To -> $downTo")
    }

    for (steps in 1..5 step 3) {
        println("Steps -> $steps")
    }

    val cakes = listOf<String>("Carrot", "Cheese", "Chocolate")

    for (cake in cakes){
        println("Yummy, it's a cake")
    }

    var cakesEaten = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }

    var firstCake = 0
    var cakeBaked = 0

    while (firstCake < 3) {
        println("Eat a cake")
        firstCake++
    }

    do {
        println("Bake a cake")
        cakeBaked++
    } while (cakeBaked < firstCake)

    var num = 0
    var sum = 0

    while (num <= 250) {
        sum += num
        num++
    }

    println("Total Sum -> $sum")

    var myIndex = 0
    var mySum = 0

    do {
        mySum += myIndex
        myIndex++
    } while (myIndex < 40)

    println("My Total Sum -> ${mySum}")
}