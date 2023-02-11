
fun main(args: Array<String>) {
    Errors_and_bugs()
}

fun Errors_and_bugs() {
    println("ERRORS AND BUGS!")

    println( "Eg: C:\\Users\\Andz\\IdeaProjects\\KotlinVanilla\\src\\main\\kotlin\\Main.kt:2:27\n" +
            "Kotlin: Expecting ')' ")

    /**
     * ~~~~~~~~~~~~~~~~~~~~~~~~~~~EXPLANATION~~~~~~~~~~~~~~~~~~~~~~~~
     *
     * The location "C:\Users\Andz\IdeaProjects\KotlinVanilla\src\main\kotlin\Main.kt:2:27" is the location
     *              in which the file with the error is located
     * The digit "2" after "Main.kt" show the line on which the error is located
     * The digit "27" shows the character number in which the error is located
     * The " Expecting ')' " describes what the error is and how to resolve it
     *
     */
}