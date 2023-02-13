
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double tempInFahrenheit = 0;
        double tempInCelsius = 0;
        double CELSIUS_BOILING_TEMP = 100;
        double CELSIUS_FREEZING_TEMP = 0;
        String trash = "";

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Celsius temperature: ");

        if (in.hasNextDouble())
        {
            tempInCelsius = in.nextDouble();
            tempInFahrenheit = 1.8 * tempInCelsius + 32;
            System.out.println("Your temperature in Fahrenheit is " + tempInFahrenheit);

            if (tempInCelsius <= CELSIUS_FREEZING_TEMP)
            {
                System.out.println("The temperature is cold enough to freeze.");
            }
            if (tempInCelsius >= CELSIUS_BOILING_TEMP)
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