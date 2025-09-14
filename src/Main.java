package lw01;

import java.util. *;
public class Main {
    public static void main(String[] args){
        Scanner scanner;
        scanner = new Scanner(System.in);
        String yourWord;
        System.out.print("Enter your odd length word: ");
        yourWord = scanner.next();
        int length = yourWord.length();
        System.out.println(yourWord.substring(length/2,(length/2)+1));
        //System.out.println(yourWord.charAt(length/2));

    }
}
