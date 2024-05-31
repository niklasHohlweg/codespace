package Sem01_Bob.CalcStats;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] input = args[0].split(",");
        int[] inputInt = new int[input.length];
        for (int i = 0; i < input.length; i++){
            inputInt[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(inputInt);

        int sum = 0;
        for (int j : inputInt) {
            sum += j;
        }

        System.out.println("Minimum: " + inputInt[0]);
        System.out.println("Maximum: " + inputInt[inputInt.length - 1]);
        System.out.println("Anzahl: " + inputInt.length);
        System.out.println("Summe: " + sum);
        System.out.println("Durchschitt: " + (double) sum / inputInt.length);

    }

}
