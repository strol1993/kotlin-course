package dataClasses

data class Car (val color: String, val model: String, val year: Int){

}

class Something(val name: String) {

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }
}

fun main() {
    val fordCar = Car("Ford focus", "red", 2010)
    println(fordCar)
    val otherFordCar = Car("Ford focus", "red", 2010)
    println("Cars are equals? ${fordCar == otherFordCar}. But are the same reference? ${fordCar === otherFordCar}")
    var copyOfFordCard = fordCar.copy()
    println("Cars are equals? ${fordCar == copyOfFordCard}. But are the same reference? ${fordCar === copyOfFordCard}")
    var blueFordCar = fordCar.copy(color = "Blue")
    println("Cars are equals? ${fordCar == blueFordCar}. But are the same reference? ${fordCar === blueFordCar}")

}