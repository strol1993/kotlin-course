package extensionClasses

fun main() {

    val someString = "this is a random string"
    println(someString.removeFirstCharacter())

}


fun String.removeFirstCharacter() : String {
    return this.removeRange(0, 1)

}