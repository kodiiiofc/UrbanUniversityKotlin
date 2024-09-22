package unnamedtasks

fun main() {

    val baseCatalog: MutableList<Product> = mutableListOf(
        Product("iPhone 16 128GB", 114_990),
        Product("iPhone 16 Pro 256GB", 169_990),
        Product("iPhone 16 Pro 512GB", 199_990),
        Product("Samsung Galaxy Z Fold 6 12/256GB", 189_990),
        Product("Xiaomi 14 Ultra 16/512GB", 134_990),
        Product("Xiaomi 14 12/512GB", 94_990)
    )

    val orenburg = Catalog("Orenburg",baseCatalog, 1.2)

    println(orenburg)

    baseCatalog.add(Product("Nothing Phone 2", 70_000))
    orenburg.updateCatalog()

    println(orenburg)

}

class Catalog(val city: String,
              val baseProductList: List<Product>,
              var multiplyingFactor: Double = 1.0) {

    var products: List<Product> = listOf()

    init {
        updateCatalog()
    }

    fun updateCatalog() {
        val mutableList : MutableList<Product> = mutableListOf()
        baseProductList.forEach {
            val product = it.copy()
            product.price = (it.price * multiplyingFactor).toInt()
            mutableList += product
        }
        products = mutableList
    }

    override fun toString(): String {
        return "City: $city." +
                "\nProducts: $products"
    }

}

data class Product(val name: String, var price: Int, var selled: Int = 0)