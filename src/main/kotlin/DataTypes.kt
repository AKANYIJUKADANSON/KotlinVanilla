
fun main(args: Array<String>) {
    dataTypes()
}

fun  dataTypes(){
    /** Correct way to declare a variable is as below
             var variableName: Type = value

        Strings, Int, Boolean, Double, Float .......
    */

    /** ~~~~~~~~~~~~Mutable datatyepes
            Here we use the var key word and this means that these variables can be changed
    */
    var myName1:String = "DanTechx"

    /** ~~~~~~~~~~~~immutable datatyepes
    Here we use the val key word and this means that these variables cannot be changed

     */
    val myName:String = "DanTechx"
    println(myName)
}