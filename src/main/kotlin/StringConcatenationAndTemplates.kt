
fun main(args: Array<String>) {
    stringConcatenationAndTemplates()
}

fun stringConcatenationAndTemplates() {
    /**
     * String concatenation is the combination of two or more strings
     */

    val firstName = "Andy"
    val secondName = "Kaburwa"

//    println(firstName + secondName)


    /**
     * String templates enable one to add a variable inside a strings
     */

    println("My name is $firstName $secondName")
}