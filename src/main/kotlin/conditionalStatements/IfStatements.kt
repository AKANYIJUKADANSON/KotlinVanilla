package conditionalStatements

fun main(args: Array<String>) {
    ifStatements()
}

fun ifStatements() {
    // if without else part
    val x = 21
//    val y = x / 2
    if (  x % 2 == 0 ){
        println("X is an even number")
    }else{
        println("X is an odd number")
    }
}