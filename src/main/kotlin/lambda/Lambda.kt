package lambda

fun main() {
    val result = upperCaseString("hello world kotlin")
    println(result)

    val upperFullName = ({ userName: String -> userName.uppercase()}("shedrack"))
    println("Lambda Result -> $upperFullName")
    //First Line
    println({cityIndex: String -> cityIndex[0]}("Frankurt"))
    //Second Line
    val cityIndex = ({cityIndex: String -> cityIndex[0]}("CopenHagen"))
    println(cityIndex)

    val containsWord = { dbORM: String -> dbORM.contains("O")}
    println(containsWord("GORM"))

    val numbers = listOf<Int>(1, -2, 3, -4, 5, -6)
    val positive = numbers.filter { myNumber -> myNumber > 0 }
    val negatives = numbers.filter { myNumber -> myNumber < 0 }
    println(positive)
    println(negatives)


    val positiveNumbers = listOf<Int>(12, 13, 14, 20, 30, 56)
    val doubled = positiveNumbers.map { number -> number * 2 }
    var trippled = positiveNumbers.map { number -> number * 3 }
    println("Doubled -> $doubled")
    println("Trippled -> $trippled")

    println(users(mutableListOf("Hendo", "Mary", "Jaime", "Damian")))

    val timesInMinute = listOf<Int>(2, 10, 15, 1)
    val min2Sec = toSeconds("minutes")
    val totalTimeInSeconds = timesInMinute.map(min2Sec).sum()
    println("Total time is $totalTimeInSeconds")
}

fun upperCaseString(myWord: String) : String {
    return myWord.uppercase()
}

val users: (MutableList<String>) -> String = { user -> user.first()}

fun toSeconds(time: String) : (Int) -> Int = when(time) {
    "hour" -> { myTime -> myTime * 60 * 60 }
    "minutes" -> { myTime -> myTime * 60}
    "seconds" -> { myTime -> myTime}
    else -> { myTime -> myTime}
}