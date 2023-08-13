# Kotlin Calculator

This is a simple command-line calculator program written in Kotlin that supports various arithmetic operations and additional features.

## Features

- Addition
- Subtraction
- Multiplication
- Division
- Average of numbers
- Raise to Power
- Quit

## How to Install

1. Make sure you have Kotlin installed on your system. You can download and install it from the [official Kotlin website](https://kotlinlang.org/).

2. Clone this repository to your local machine:

   ```sh
   git clone https://github.com/Amitminer/Calculator-Kotlin.git
   ```

3. Change your current directory to the project folder:

   ```sh
   cd Calculator-Kotlin
   ```

## How to Execute

1. Open a terminal and navigate to the project folder.

2. Compile the Kotlin source code using the following command:

   ```sh
   kotlinc Calculator.kt -include-runtime -d Calculator.jar
   ```

3. Run the compiled JAR file:

   ```sh
   java -jar Calculator.jar
   ```

4. The calculator will display a menu of options. Enter the corresponding number to choose an operation.

5. Follow the prompts to provide input numbers for the chosen operation.

6. To exit the calculator, choose option 7 or simply close the terminal.

## Notes

- Make sure you have Java installed on your system, as the program is executed using the Java Virtual Machine (JVM).
- The program uses the `readLine()` function for user input. Make sure to provide valid numeric inputs to avoid errors.

Feel free to explore and modify the code according to your needs!

## License

This project is licensed under the [MIT License](LICENSE).

---
