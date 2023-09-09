package data

open class Animal {

}
class Horse : Animal() {

}
class Lyon : Animal() {

}
class Apple {

}


//contoh cara pembuatan generic constraint
class Zoo<T : Animal>(data: T) {

}

fun main() {
    val zoo1 = Zoo(Animal())

    val zoo2 = Zoo(Horse())

    val zoo3 = Zoo(Lyon())

//    val zoo4 = Zoo(Apple()) //error

}