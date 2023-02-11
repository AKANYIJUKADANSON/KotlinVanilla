package conditionalStatements

fun main(args: Array<String>) {
    whenExp()
}

fun whenExp() {

    val color = "Green"
    when(color){
        "Red" ->{
            println("STOP")
        }
        "Green" ->{
            println("GO")
        }
    }
}