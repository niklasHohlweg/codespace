package ZinsesZins;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DecimalFormat f = new DecimalFormat("#0.00");

        Scanner myScanner = new Scanner(System.in);

        double startkapital= myScanner.nextDouble();
        double zins = myScanner.nextDouble();
        double jahre = myScanner.nextDouble();

        for(int i = 0; i < jahre; i++){

            //Math.round(a * 100.0) / 100.0
            double kapital = (startkapital + (zins + 0.01)) + startkapital;
            System.out.println((i + 1) + ". "+ f.format(Math.round(kapital * 100.0) / 100.0));
            System.out.println((i + 1) + ". "+ (Math.round(kapital * 100.0) / 100.0));
            startkapital = kapital;

        }

    }

}
