package accessModifiers

import java.awt.datatransfer.StringSelection


/**
 * TODO: this is an example of a class which contains a primary constructor which is defined
 * at the class definition level. This constructor it's not going to have body or code associated
 * at the first instance but we can use init block in order to give him some behaviour like in
 * this example
 */
class Employee constructor(firstName: String, secondName: String) {

    val firstName : String
    val secondName : String = secondName

    init {
        this.firstName = firstName
    }
}


/**
 * TODO: there is another way in order to create class constructor with less code.
 * In this case the constructor it's only perform the parameters assignation to the
 * instance fields. Which is quite often.
 *
 * This new methodology it's going to create the constructor and the define the variables for us.
 * You can see it in the following example
 *
 * That's all, whith only the constructor definition the compiler it's going to create the variable
 * and a custom constructor which it's going to expect an input from that variable and it's going
 * to perform the assignation of the value.
 */
class AnotherEmployee constructor(val firstName: String) {

}


/**
 * TODO: here we had defined a default constructor which defines and initializes the firstName variable and the companyName
 * If we want to had more fields which must be setted using separated constructors then we need to define them and
 * define the new fields in the class istelf.
 */
class ExternalEmployee(val firstName: String, val externalCompany: Boolean) {

    var secondName : String = ""

    constructor(firstName : String, secondName : String) : this(firstName, true) {
        this.secondName = secondName
    }
}

fun someFunction(employee: Employee) {

}