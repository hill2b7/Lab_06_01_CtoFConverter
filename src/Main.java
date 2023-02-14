
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double tempInFahrenheit = 0; //variable declaration
        double tempInCelsius = 0; //variable declaration
        double CELSIUS_BOILING_TEMP = 100; //constant declaration
        double CELSIUS_FREEZING_TEMP = 0; //constant declaration
        String trash = ""; //variable declaration

        Scanner in = new Scanner(System.in); //import of scanner

        System.out.println("Enter Celsius temperature: "); //output to ask user for input

        if (in.hasNextDouble())  //input from user
        {
            tempInCelsius = in.nextDouble(); //assigning the input to variable
            tempInFahrenheit = 1.8 * tempInCelsius + 32; //formula for converting celsius to fahrenheit
            System.out.println("Your temperature in Fahrenheit is " + tempInFahrenheit); //output's the converted temperature

            if (tempInCelsius <= CELSIUS_FREEZING_TEMP) // condition to determine if temperature is cold enough to freeze
            {
                System.out.println("The temperature is cold enough to freeze.");
            }
            if (tempInCelsius >= CELSIUS_BOILING_TEMP) // condition to determine if temperature is hot enough to boil
            {
                System.out.println("The temperature is hot enough to boil.");
            }

        }
        else
        {
            trash = in.nextLine();
            System.out.println("Invalid Temperature : " + trash);
        }
    }
}