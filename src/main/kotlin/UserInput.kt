fun main(args: Array<String>) {
    userInput()
}

fun userInput(){
    // Anything a user inputs is captured using the readLine() function

//    print("Enter your name: ")
//    val myName = readLine()
//    print("Name: $myName ")


    //~~~~~~~~~USER REGISTRATION SYSTEM~~~~~~~~~~~~~~~
    println("|~~~~~~~~~~~USER REGISTRATION SYSTEM~~~~~~~~~~~~|")

    print("Enter your first name: ")
    val firstName = readLine()

    print("Enter your second name: ")
    val secondName = readLine()

    print("Enter your phone number: ")
    val phone = readLine()

    print("Enter your Place of residence: ")
    val residence = readLine()

    print("Enter your Email ID: ")
    val email = readLine()

    println("|~~~~~~~~~~~YOUR REGISTRATION DETAILS~~~~~~~~~~~~|")
    println("First Name: $firstName")
    println("Second Name: $secondName")
    println("Tel. : $phone")
    println("Residence: $residence")
    println("Email: $email")

}