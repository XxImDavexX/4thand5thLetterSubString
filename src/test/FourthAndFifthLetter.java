package test;

import java.util.Scanner;

public class FourthAndFifthLetter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String word;
        System.out.println("Insert a word here:");
        word = keyboard.nextLine();
        System.out.println("The 4th and 5th letters of the word are: " + "'" + word.substring(3,4) + "'" 
                            + " and " + "'" + word.substring(4,5) + "'");
        
        
    }
}
