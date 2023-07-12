package conditionals

fun main() {
    val number: Int
    val check: Boolean = false

    if (check){
        number = 1
    } else {
        number = 2
    }

    println(number)

    val firstNum: Int = 12
    val secondNum: Int = 8
    println(if (secondNum > firstNum) firstNum else secondNum)

    val words = "Hello"

    when (words) {
        "1" -> println("One")
        "Hello" -> println("World")
        else -> println("Unknown")
    }

    val fullName: String = "Aboki"

    when (fullName){
        "Nicholas" -> println("$fullName is your middle name")
        "Shedrack Nicholas Ejeh" -> println("$fullName is your full name")
        else -> println("Error nothing found here")
    }

    val cityName: String = "Latveria"

    val checkCityName = when(cityName) {
        "Vienna" -> "$cityName is a city in austria, wrong info"
        "Dubai UAE" -> "$cityName is a city in UAE, correct Info"
        else -> "Unknown"
    }

    println(checkCityName)

    print("What's the temperature?...")
    val temp = readln().toInt()

    val tempDescription = when {
        temp < 0 -> "Very cold"
        temp < 10 -> "A bit cold"
        temp < 20 -> "Warm"
        else -> "Hot"
    }

    println("Temperature Status -> $tempDescription")
}