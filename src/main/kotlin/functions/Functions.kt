package functions

fun main(args : Array<String>) {
    println(returnFormatted(3, "Some example text"))
    println(returnFormatted(3))
    println(returnFormatted(someText = "This is an unordered parameters input", someNumber = 10))
}

fun returnFormatted(someNumber: Int, someText : String = "this is the default text") : String {
    return "$someNumber $someText"
}



