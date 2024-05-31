package org.example;

import java.io.*;
import java.util.ArrayList;


public class InfectionTimeStorage2 {
    public static void writeInfectionTime(ArrayList<InfectionTime> ITList) {
        try {
            FileOutputStream file = new FileOutputStream("file.txt");
            ObjectOutputStream output = new ObjectOutputStream(file);
            output.writeObject(ITList);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    public static ArrayList<InfectionTime> readInfectionTime() {
        ArrayList<InfectionTime> correctVirus1 = new ArrayList<InfectionTime>();
        try {
            FileInputStream fileStream = new FileInputStream("file.txt");
            ObjectInputStream objStream = new ObjectInputStream(fileStream);

           correctVirus1 = (ArrayList<InfectionTime>) objStream.readObject();

        }
        catch (Exception e) {
            e.getStackTrace();
        }
        return correctVirus1;
    }
}