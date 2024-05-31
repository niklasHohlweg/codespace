package Sem01_Bob.Differenzieren;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        String input = myScanner.nextLine();
        String[] values = input.split(",");
        int exponent = values.length - 1;

        for(int i = 0; i < values.length; i++){

            int erg = Integer.parseInt(values[i]) * exponent;
            exponent--;

            System.out.print(erg);

            if(i != values.length - 1){
                System.out.print(",");
            }

        }


    }

}
