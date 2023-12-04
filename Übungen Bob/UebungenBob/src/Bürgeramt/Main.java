package Bürgeramt;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        boolean visitors = true;
        int schalterAnzahl = 5;
        ArrayList<Bürger> warteschlange = new ArrayList<Bürger>();
        Bürger[] schalter = new Bürger[schalterAnzahl];

        do{

            String aktion = myScanner.nextLine();
            String befehl = aktion.split(" ")[0];

            //add
            if(befehl.equals("add")){

                boolean gotSchalter = false;

                Bürger myBürger = new Bürger();
                String params = aktion.split(" ")[1];
                String name = params.split(";")[0];
                String anliegen = params.split(";")[1];

                System.out.println(name + " betritt das Bürgeramt. Grund: " + anliegen);

                myBürger.setName(name);
                myBürger.setAnliegen(anliegen);

                for(int i = 0; i < schalter.length; i++){

                    if(schalter[i] == null){

                        schalter[i] = myBürger;
                        gotSchalter = true;
                        System.out.println(name + " geht an Schalter " + i);
                        break;

                    }

                }

                if(!gotSchalter){

                    warteschlange.add(myBürger);
                    System.out.println(name + " stellt sich in die Warteschlage");

                }

            }

            //process
            if(befehl.equals("process")){

                String param = aktion.split(" ")[1];
                String name = schalter[Integer.parseInt(param)].getName();
                String anliegen = schalter[Integer.parseInt(param)].getAnliegen();

                System.out.println("Das Anliegen " + anliegen + " von " + name + " wurde bearbeitet, Er/Sie verässt das Bürgeramt.");

                if(!warteschlange.isEmpty()){
                    schalter[Integer.parseInt(param)] = warteschlange.getFirst();
                    System.out.println(warteschlange.getFirst().getName() + " geht an Schalter " + param);
                    warteschlange.remove(warteschlange.getFirst());
                }
                else{
                    schalter[Integer.parseInt(param)] = null;
                }

                //Ausgabe
                System.out.println();

            }

            //exit
            if(befehl.equals("exit")){

                warteschlange.clear();

            }


            //Check for Visitors
            for(int i = 0; i < schalter.length; i++){

                if(schalter[i] != null){

                    break;

                }
                if(i == schalterAnzahl - 1){
                    
                    visitors = false;

                }

            }

        }
        while(visitors);

    }

}
