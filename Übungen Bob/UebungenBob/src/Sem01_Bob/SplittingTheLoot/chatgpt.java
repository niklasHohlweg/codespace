package Sem01_Bob.SplittingTheLoot;

import java.util.Scanner;

public class chatgpt {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Geben Sie die Gruppengröße ein: ");
        int gruppenGroesse = input.nextInt();

        int[] beute = new int[gruppenGroesse];
        int summe = 0;

        for (int i = 0; i < gruppenGroesse; i++) {
            System.out.print("Geben Sie den Wert des Beutestücks " + (i+1) + " ein: ");
            beute[i] = input.nextInt();
            summe += beute[i];
        }

        if (summe % gruppenGroesse != 0) {
            System.out.println("Keine gerechte Verteilung möglich.");
        } else {
            int anteil = summe / gruppenGroesse;
            int[] verteilung = new int[gruppenGroesse];

            for (int i = 0; i < gruppenGroesse; i++) {
                verteilung[i] = anteil - beute[i];
            }

            System.out.println("Die Verteilung der Beute lautet:");
            for (int i = 0; i < gruppenGroesse; i++) {
                System.out.print((i+1) + ": ");
                for (int j = 0; j < gruppenGroesse; j++) {
                    if (verteilung[j] == 0) {
                        System.out.print(beute[j] + " ");
                    } else {
                        System.out.print("- ");
                        verteilung[j] += beute[j];
                    }
                }
                System.out.println();
            }
        }

    }

}