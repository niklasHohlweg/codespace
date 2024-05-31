package Sem01_Bob.Teilbar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int number = myScanner.nextInt();
        int erg = 0;

        if(number >= 0){

            for(int i = 1; i < number; i++){

                if(i % 3 == 0 ||i % 7 == 0){

                    erg += i;

                }

            }

        }

        System.out.println(erg);

    }

}
