package SplittingTheLoot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Bitte gib die Gruppengröße & Werte ein: ");
        String values = myScanner.nextLine();
        String[] numbers = values.split(" ");

        int groupSize = Integer.parseInt(numbers[0]);
        int ges = 0;
        ArrayList<Integer> loot = new ArrayList<>();
        ArrayList<ArrayList<Integer>> groups = new ArrayList<>();
        int[] groupValues = new int[groupSize];

        for(int i = 0; i < groupSize; i++){

            groups.add(new ArrayList<>());

        }


        for(int i = 1; i < numbers.length; i++){

            loot.add(Integer.parseInt(numbers[i].trim()));
            ges += Integer.parseInt(numbers[i].trim());

        }

        Collections.sort(loot);
        Collections.reverse(loot);

        //Gesamtsumme ist durch Anzahl der Gruppen teilbar
        if(ges % groupSize == 0){

            int x = 0;
            int max = ges / groupSize;
            System.out.println("Max: " + max);

            first: for(int i = 0; i < loot.size(); i++){

                if(groupValues[x] + loot.get(i) <= max){

                    groupValues[x] += loot.get(i);

                    ArrayList<Integer> myArrayList = groups.get(x);
                    myArrayList.add(loot.get(i));
                    groups.set(x, myArrayList);

                }
                if((x + 1) < groups.size()){
                    x++;
                }
                else{
                    x = 0;
                }

            }

            //Check Values
            for(int i = 1; i < groupValues.length; i++){

                if (!(groupValues[i - 1] == groupValues[i])) {

                    System.out.println("Error! FOR");
                    //return;

                }

            }

            //Print in Console
            for(int i = 0; i < groups.size(); i++){

                ArrayList<Integer> list = groups.get(i);
                System.out.print((i + 1) + ". ");

                for(int z = 0; z < list.size(); z++){

                    System.out.print(list.get(z));
                    System.out.print(" ");

                }

                System.out.println("       -> " + groupValues[i]);

                System.out.println("");

            }

        }
        else {
            System.out.println("Error! END");
        }


    }

}