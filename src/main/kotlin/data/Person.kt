package data

class Person {

    //contoh cara penggunaan star symbol data parameter atau star generic
    fun getHobby(hobby: Array<*>): Unit {
        println("I have hobby: ${hobby.size}")
    }
}

fun main() {
    val person: Person = Person()
    person.getHobby(arrayOf("play football", "watch football league", "eating"))
}

