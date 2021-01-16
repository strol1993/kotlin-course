package nullReferences

fun main(args: Array<String>) {

    val arrayOfPersons : Array<Person?> = arrayOfNulls<Person>(5)
    arrayOfPersons[0] = Person("Joaquim", "Calvo")
    arrayOfPersons[4] = Person("Rosa", "Suarez")

    for (person in arrayOfPersons) {
        println(person?.let { it.name })
    }
}