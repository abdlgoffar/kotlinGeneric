package data


//contoh para penggunaan interface comparable
class Product(name: String, price: Int): Comparable<Product> {

    val name: String = name;
    val price: Int = price

    override fun compareTo(other: Product): Int {
        return this.price.compareTo(other.price)
    }
}

fun main() {

    val product1: Product = Product("mie sedaap goreng", 3500)
    val product2: Product = Product("mie sedaap kuah soto", 3000)

    println(product1 > product2)
    println(product1 < product2)
    println(product1 >= product2)
    println(product1 <= product2)
    
}