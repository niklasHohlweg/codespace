package DCF77;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        String signal = myScanner.nextLine();

        String timezone = (signal.charAt(17) == 0 && signal.charAt(18) == 1) ? "MEZ" : "MESZ";
        String min = fixNull(calc(signal.charAt(21), signal.charAt(22), signal.charAt(23), signal.charAt(24), signal.charAt(25), signal.charAt(26), signal.charAt(27), '0'));
        String hour = fixNull(calc(signal.charAt(29), signal.charAt(30), signal.charAt(31), signal.charAt(32), signal.charAt(33), signal.charAt(34), '0', '0'));
        String day = fixNull(calc(signal.charAt(36), signal.charAt(37), signal.charAt(38), signal.charAt(39), signal.charAt(40), signal.charAt(41), '0', '0'));
        String weekday = switch (calc(signal.charAt(42), signal.charAt(43), signal.charAt(44), '0', '0', '0', '0', '0')) {
            case 1 -> "Montag";
            case 2 -> "Dienstag";
            case 3 -> "Mittwoch";
            case 4 -> "Donnerstag";
            case 5 -> "Freitag";
            case 6 -> "Samstag";
            case 7 -> "Sonntag";
            default -> "";
        };
        String month = switch (calc(signal.charAt(45), signal.charAt(46), signal.charAt(47), signal.charAt(48), '0', '0', '0', '0')) {
            case 1 -> "Januar";
            case 2 -> "Februar";
            case 3 -> "März";
            case 4 -> "April";
            case 5 -> "Mai";
            case 6 -> "Juni";
            case 7 -> "Juli";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "Oktober";
            case 11 -> "November";
            case 12 -> "Dezember";
            default -> "";
        };
        int year = 2000 + calc(signal.charAt(50), signal.charAt(51), signal.charAt(52), signal.charAt(53), signal.charAt(54), signal.charAt(55), signal.charAt(56), signal.charAt(57));

        System.out.println(weekday + ", " + day + ". " + month + " " + year + " " + hour + ":" + min + ":00 " + timezone);

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