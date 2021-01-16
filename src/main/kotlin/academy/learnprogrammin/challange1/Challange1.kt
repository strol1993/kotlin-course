package academy.learnprogrammin.challange1

fun main(args : Array<String>) {

    val hello1 = "Hello"
    val hello2 = "Hello"

    println("Hello1 is referentially equal to hello2 ${hello1 === hello2}")
    println("Hello1 is structurally equal to hello2 ${hello1 == hello2}")

    var num = 2988

    val text : Any = "The ANy type is the root of the Kotlin class hierarchy"
    if (text is String) {
        println(text.toUpperCase())
    }

    println("""1       1
        1      11
        1     111
        1    1111""".trimMargin("1"))


}