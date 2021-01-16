package objectKeywords


fun main() {

    /**
     * TODO: simple usage of a singleton instance of an object
     */
    SingletonClass.someMethodOfSingletonObject()


    /**
     * TODO: usage of content of a companion object
     */
    SomeClass.AIXO_ES_UNA_CONSTANT_COMPANION
    SomeClass.companionObjectMethod()

    /**
     * TODO: usage of a content of an inner object of a class
     */
    SomeClass.ObjecteSingleton.AIXO_ES_UNA_CONSTANT
    SomeClass.ObjecteSingleton.objectMethod()


}

object SingletonClass {

    fun someMethodOfSingletonObject() {
        println("We are calling a method from a singleton instance of an object")
    }
}


class SomeClass {

    companion object AcompanyadorEstatic {
        const val AIXO_ES_UNA_CONSTANT_COMPANION = "Constant d'un objecte companion de la class"
        fun companionObjectMethod() {
            println("Aixo es una funcio d un object companion d una classe")
        }
    }

    object ObjecteSingleton {
        const val AIXO_ES_UNA_CONSTANT = "Aixo es una constant d un objecte dins d una classe"
        fun objectMethod() {
            println("Aixo es una funcion d un objecte d una class")
        }
    }
}