import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        double tempInFahrenheit = 0; //variable declaration
        double tempInCelsius = 0; //variable declaration
        double CELSIUS_BOILING_TEMP = 100; //constant declaration
        double CELSIUS_FREEZING_TEMP = 0; //constant declaration
        String trash = ""; //variable declaration
        String QuitProgram = ""; // String declaration
        boolean done = false; //boolean declaration
        boolean end = false; //boolean declaration

        Scanner in = new Scanner(System.in); //import of scanner
        do {
            end = false; // resets sentinel value at the start of the loop so nothing is stored
            done = false; // resets sentinel value at the start of the loop so nothing is stored
            {
                //beginning of do while loop. Will continue to loop until while condition is met
                do {
                    System.out.println("Enter the temperature in Celsius to convert to Fahrenheit"); //output asking for a temp input
                    if (in.hasNextDouble()) // if statement that will run code block below if the condition is met
                    {
                        tempInCelsius = in.nextDouble(); // sets input received to the tempInCelsius variable
                        tempInFahrenheit = 1.8 * tempInCelsius + 32; // formula for conversion
                        System.out.println("Your temperature in fahrenheit is " + tempInFahrenheit); //output that shows what your converted temperature is
                        if (tempInCelsius <= CELSIUS_FREEZING_TEMP) // condition to determine if temperature is cold enough to freeze
                        {
                            System.out.println("The temperature is cold enough to freeze.");//output that tells the user that the temperature is cold enough to freeze
                            done = true; // sets boolean to true so it will break out of the loop
                        }
                        if (tempInCelsius >= CELSIUS_BOILING_TEMP) // condition to determine if temperature is hot enough to boil
                        {
                            System.out.println("The temperature is hot enough to boil."); //output that tells the user that the temperature is hot enough to boil
                            done = true; // sets boolean to true so it will break out of the loop
                        }
                        done = true; // sets boolean to true so it will break out of the loop
                    }
                    else //code block will run below if the if condition is not met
                    {
                        trash = in.nextLine(); // set's invalid input received to trash so the user knows that it is bad input
                        System.out.println("You have entered an unexpected value " + trash + " Try again!"); //output that tells the user that the input is incorrect
                    }
                }
                while (!done); // Loop will run while the received input is not done or true

                System.out.println("Do you want to enter another temperature Y/N :"); //output asking user if they want to play again
                in.nextLine(); // input box for user
                QuitProgram = in.nextLine(); //setting ContinueGame string to whatever input is received by the end user
                if (QuitProgram.equalsIgnoreCase("N")) //if statement that will run if the condition is met

                {
                    end = true; //sets the endGame String to true if the if statement is met causing the program to end
                }

            }
        } while (!end); // Loop will run while the received input is not endGame or true
    }
}
