package collections

fun main() {
    val readOnlyShapes = listOf<String>("Triangle", "Square", "Circle")
    for (shapes in readOnlyShapes){
        println("Read Only Shapes -> $shapes")
    }

    val cities: MutableList<String> = mutableListOf(
        "Dubai",
        "Halifax",
        "Vienna",
        "Copenhagen",
        "Oslo",
        "Beirut",
        "Budapest",
    )

    for (city in cities){
        println("Cities -> $city")
    }

    val lockedCities: List<String> = cities
    for (myCities in lockedCities){
        println("Locked Cities -> $myCities")
    }

    println("The first city is -> ${cities[0]}")
    println("First City -> ${lockedCities.first()}")
    println("Last City -> ${lockedCities.last()}")

    println("Cities Length -> ${lockedCities.count()}")

    val result = readOnlySets(setOf("Apple", "Banana", "Cherry", "Cherry"))
    println(result)

    val setAnswers = myMutableSets(mutableSetOf(
        "Tesla",
        "GM",
        "Ford",
        "Lucid",
        "QuantumScape",
        "Lucid",
        "Tesla",
        "GM"
    ))

    println(setAnswers)

    val myContact = myContactBook(mutableMapOf(
        "Shedrack" to 100238,
        "Jake" to 234009,
        "Madison" to 456009,
        "Miles" to 19078845,
    ))

    println(myContact)

    val countries = mapOf<String, String>(
        "USA" to "Washington DC",
        "Saudi Arabia" to "Riyadh",
        "Brazil" to "Rio De Janario",
        "China" to "Beijing",
        "Denmark" to "CopenHagen",
    )


    for (country in countries){
        println("Country ${country.key} -> Capital ${country.value}")
    }

    val cars: MutableMap<String, Int> = mutableMapOf(
        "Mercedes Benz" to 1200,
        "Tesla Model S Plaid" to 34500,
        "Ford Lightning" to 43000,
        "Toyota Prius" to 56000,
    )

    cars.put("Chevrolet Tahoe", 24000)
    cars.put("Ford Mustang", 19500)
    cars.put("Koenisegg Gemera", 1923400000)

    for (car in cars){
        println("Cars: ${car.key} - Price: $${car.value}")
    }

    println(cars.containsKey("Chevrolet Tahoe"))
}

fun readOnlySets(readOnlySets: Set<String>) : Unit {
    for (sets in readOnlySets){
        println("Sets -> $sets")
    }
}

fun myMutableSets(companies: MutableSet<String>) {
    for (companyIndexes in companies){
        println("Company Index -> ${companyIndexes[0]}")
    }
}

fun myContactBook(contactBook: MutableMap<String, Int>) {
    for (contacts in contactBook) {
        println("Contact Books -> ${contacts.key} ${contacts.value}")
    }
}