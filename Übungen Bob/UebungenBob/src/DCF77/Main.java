package DCF77;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        String signal = myScanner.nextLine();

        String timezone = (signal.charAt(17) == '0' && signal.charAt(18) == '1') ? "MEZ" : "MESZ";
        String min = fixNull(calc(signal.charAt(21), signal.charAt(22), signal.charAt(23), signal.charAt(24), signal.charAt(25), signal.charAt(26), signal.charAt(27), '0'));
        String hour = fixNull(calc(signal.charAt(29), signal.charAt(30), signal.charAt(31), signal.charAt(32), signal.charAt(33), signal.charAt(34), '0', '0'));
        int day = calc(signal.charAt(36), signal.charAt(37), signal.charAt(38), signal.charAt(39), signal.charAt(40), signal.charAt(41), '0', '0');
        int intTag = calc(signal.charAt(36), signal.charAt(37), signal.charAt(38), signal.charAt(39), signal.charAt(40), signal.charAt(41), '0', '0');
        int intMonat = calc(signal.charAt(45), signal.charAt(46), signal.charAt(47), signal.charAt(48), '0', '0', '0', '0');
        int intJahr = calc(signal.charAt(50), signal.charAt(51), signal.charAt(52), signal.charAt(53), signal.charAt(54), signal.charAt(55), signal.charAt(56), signal.charAt(57));
        String weekday = "";
        switch (calc(signal.charAt(42), signal.charAt(43), signal.charAt(44), '0', '0', '0', '0', '0')){
            case 1: weekday = "Montag"; break;
            case 2: weekday = "Dienstag"; break;
            case 3: weekday = "Mittwoch"; break;
            case 4: weekday = "Donnerstag"; break;
            case 5: weekday = "Freitag"; break;
            case 6: weekday = "Samstag"; break;
            case 7: weekday = "Sonntag"; break;
        }
        String month = "";
        switch (calc(signal.charAt(45), signal.charAt(46), signal.charAt(47), signal.charAt(48), '0', '0', '0', '0')) {
            case 1: month = "Januar"; break;
            case 2: month = "Februar"; break;
            case 3: month = "März"; break;
            case 4: month = "April"; break;
            case 5: month = "Mai"; break;
            case 6: month = "Juni"; break;
            case 7: month = "Juli"; break;
            case 8: month = "August"; break;
            case 9: month = "September"; break;
            case 10: month = "Oktober"; break;
            case 11: month = "November"; break;
            case 12: month = "Dezember"; break;
        }

        boolean foundDate = false;
        int year = calc(signal.charAt(50), signal.charAt(51), signal.charAt(52), signal.charAt(53), signal.charAt(54), signal.charAt(55), signal.charAt(56), signal.charAt(57));

        for(int i = 0; i < 300; i += 100){

            Date myDate = new Date(i + intJahr, intMonat - 1, intTag);

            if(myDate.getDay() == calc(signal.charAt(42), signal.charAt(43), signal.charAt(44), '0', '0', '0', '0', '0') || (myDate.getDay() == 0 && calc(signal.charAt(42), signal.charAt(43), signal.charAt(44), '0', '0', '0', '0', '0') == 7)){

                System.out.println(weekday + ", " + day + ". " + month + " " + (i + 1900 + year) + " " + hour + ":" + min + ":00 " + timezone);
                foundDate = true;
                break;

            }

        }

        if(!foundDate){

            System.out.println(weekday + ", " + day + ". " + month + " " + (1800 + year) + " " + hour + ":" + min + ":00 " + timezone);

        }

    }

    public static int calc (char char1, char char2, char char4, char char8, char char10, char char20, char char40, char char80){

        int sum = 0;

        if(char1  == '1'){

            sum += 1;

        }
        if(char2 == '1'){

            sum += 2;

        }
        if(char4 == '1'){

            sum += 4;

        }
        if(char8 == '1'){

            sum += 8;

        }
        if(char10 == '1'){

            sum += 10;

        }
        if(char20 == '1'){

            sum += 20;

        }
        if(char40 == '1'){

            sum += 40;

        }
        if(char80 == '1'){

            sum += 80;

        }

        return sum;

    }

    public static String fixNull (int number) {

        if(number < 10) {

            return "0" + number;

        }
        else{

            return Integer.toString(number);

        }

    }

}