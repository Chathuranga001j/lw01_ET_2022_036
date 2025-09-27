package LW_03;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();

        Temperature t = new Temperature(c);
        System.out.printf("Temperature in Fahrenheit: %.2f°F%n", t.toFahrenheit());

        sc.close();
    }
}
