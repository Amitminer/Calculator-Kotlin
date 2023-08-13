fun main() {
    while (true) {
        println("[1] Addition")
        println("[2] Subtraction")
        println("[3] Multiplication")
        println("[4] Division")
        println("[5] Average")
        println("[6] Raise To Power")
        println("[7] Quit")
        
        print("Enter your choice: ")
        val choice = readLine()?.toIntOrNull() ?: continue

        when (choice) {
            1 -> performOperation(::addition)
            2 -> performOperation(::subtraction)
            3 -> performOperation(::multiplication)
            4 -> performOperation(::division)
            5 -> performAverage()
            6 -> performPower()
            7 -> {
                println("Exiting the calculator. Goodbye!")
                break
            }
            else -> println("Invalid choice. Please select a valid option.")
        }
    }
}

fun performOperation(operation: (Double, Double) -> Double) {
    print("Enter the first number: ")
    val num1 = readLine()?.toDoubleOrNull() ?: return

    print("Enter the second number: ")
    val num2 = readLine()?.toDoubleOrNull() ?: return

    val result = operation(num1, num2)
    println("Result: $result")
}

fun addition(a: Double, b: Double): Double = a + b
fun subtraction(a: Double, b: Double): Double = a - b
fun multiplication(a: Double, b: Double): Double = a * b
fun division(a: Double, b: Double): Double = if (b != 0.0) a / b else Double.NaN

fun performAverage() {
    print("Enter the count of numbers: ")
    val count = readLine()?.toIntOrNull() ?: return

    var sum = 0.0
    for (i in 1..count) {
        print("Enter number $i: ")
        val num = readLine()?.toDoubleOrNull() ?: return
        sum += num
    }

    val average = sum / count
    println("Average: $average")
}

fun performPower() {
    print("Enter the base: ")
    val base = readLine()?.toDoubleOrNull() ?: return

    print("Enter the exponent: ")
    val exponent = readLine()?.toIntOrNull() ?: return

    val result = Math.pow(base, exponent.toDouble())
    println("Result: $result")
}