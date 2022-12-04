import java.util.Scanner;

public class temptofaren {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit:");
        float f = sc.nextFloat();
        float c = fahrenheitToCelsius(f);
        System.out.println("The temperature in Celsius: " + c);
        System.out.println("The temperature in Kelvin: " + celsiusToKelvin(c));
    }
    public static float fahrenheitToCelsius(float f) {
        return (float)((f-32)*5/9);
    }
    public static float celsiusToKelvin(float c) {
        return (float)(c+273.15);
    }

}