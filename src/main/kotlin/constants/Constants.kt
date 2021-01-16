package constants

val INTEGER_CONSTANT = 1000
val SOME_STRING_CONSTANT = "Something that I need to share"

fun main() {
    println(Employee().getConstant())
}


class Employee {

    fun getConstant() : String {
        return SOME_STRING_CONSTANT
    }
}