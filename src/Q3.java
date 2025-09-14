package lw01;

import java.util. *;
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double centi;
        System.out.print("Enter length in centimeters: ");
        centi = scanner.nextDouble( );
        double inches = centi/2.54;
        System.out.println(centi+" cm = "+inches+" inches");
    }
}
