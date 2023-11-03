package Schneidebrett;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Bitte gib die breite der Schublade ein: ");
        int breite = myScanner.nextInt();
        System.out.println("Bitte gib die tiefe der Schublade ein: ");
        int tiefe = myScanner.nextInt();
        boolean brettPasst = false;

        System.out.println("Schubladenbreite: " + breite);
        System.out.println("Schubladentiefe: " + tiefe);

        do{

            System.out.println("Bitte gib die breite des Schneidebrettes an: ");
            int breiteBrett = myScanner.nextInt();
            System.out.println("Bitte gib die tiefe des Schneidebrettes an: ");
            int tiefeBrett = myScanner.nextInt();

            System.out.println("Schneidebrettbreite: " + breiteBrett);
            System.out.println("Schneidebretttiefe: " + tiefeBrett);


            if ((tiefeBrett <= tiefe && breiteBrett <= breite) || (tiefeBrett <= breite && breiteBrett <= tiefe)){

                System.out.println("Das Brett " + breiteBrett + "x" + tiefeBrett + " passt");
                brettPasst = true;

            }
            else {

                System.out.println("Das Brett passt nicht!");

            };

        }
        while (!brettPasst);

    }

}