package academy.learnprogramming.challange2

fun main() {

    val firsFloat = -3847.384f as Float?
    val secondFloat : Float? = -3847.384f

    val arrayOfShort = Array<Short>(5) { i -> (i + 1).toShort() }
    val arrayOfNullableShort = Array<Int?>(40) {i -> ((i+1)*5)}

    val charArray = charArrayOf('a', 'b', 'c')

    val x: String? = "I AM IN UPPERCASE"
    val y = x?.toLowerCase() ?: "I give up!"
    val z = x?.let { it.toLowerCase().replace("am", "am not") }


}