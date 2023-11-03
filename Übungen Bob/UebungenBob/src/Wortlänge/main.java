package Wortlänge;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        System.out.println("Bitte gib ein Wort ein:");
        Scanner myScanner = new Scanner(System.in);

        String word = myScanner.nextLine();

        int wordLenght = word.length();

        System.out.println("Wort: " + word);
        System.out.println("- - -");

        for(int i = 0; i < wordLenght; i++){

            System.out.println(word);

        }

        System.out.println("- - -");

    }

}
