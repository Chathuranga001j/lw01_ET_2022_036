package lw01;

import java.util. *;
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName;
        System.out.print("Enter your first name: ");
        firstName = scanner.next( );
        String middleName;
        System.out.print("Enter your middle name: ");
        middleName = scanner.next( );
        String lastName;
        System.out.print("Enter your last name: ");
        lastName = scanner.next( );
        System.out.println(lastName+","+ firstName+" "+middleName.substring(0,1)+".");


    }

}
