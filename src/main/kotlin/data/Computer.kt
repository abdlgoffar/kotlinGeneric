package data


//contoh cara pembuatan class generic
class Computer<T, T2>(private val brand: T, private val buildIn: T2) {
    fun printData() {
        println("brand name: ${this.brand}  build in: ${this.buildIn}")
    }

    fun getBrand(): T {
        return this.brand
    }

    fun getBuildIn(): T2 {
        return this.buildIn
    }
}


fun main() {
    //contoh cara pembuatan object generic
    val computer: Computer<String, Int> = Computer("Lenovo", 1986)


}