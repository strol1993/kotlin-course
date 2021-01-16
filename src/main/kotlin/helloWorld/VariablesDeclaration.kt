package helloWorld

fun main(args: Array<String>) {
    val number : Int
    val numberPreInitialized = 25
    val employee = Employee("Quim", 500)
    employee.name = "Rosa Suarez"
}

class Employee(var name: String, val id: Int) {

}