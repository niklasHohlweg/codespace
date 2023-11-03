package Ausrufezeichen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        while (myScanner.hasNextInt()){

            System.out.println(myScanner.hasNext());

            int number = myScanner.nextInt();
            System.out.println(number + "!");

        }

    }

}
