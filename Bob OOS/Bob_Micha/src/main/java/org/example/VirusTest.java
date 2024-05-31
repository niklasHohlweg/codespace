package org.example;

import java.util.ArrayList;
import java.util.regex.*;

public class VirusTest {

    public static void main(String[] args) {
        InfectionTime[] virus = new InfectionTime[20];
        ArrayList<InfectionTime> correctVirus = new ArrayList<InfectionTime>();


        for (int i = 0; i < 20; i++) {

            String[] virus1 = Virusgenerator.generateVirus(true).split(" ");
            String[] zeit = virus1[4].split(":");


            try {
                virus[i] = new InfectionTime(virus1, zeit);

            } catch (Exception e) {

                continue;
            }


            Pattern namePattern = Pattern.compile("(Divoc91|Influenza)");
            Matcher nameMatcher = namePattern.matcher(virus1[0]);
            Pattern dotwPattern = Pattern.compile("(Mon|Tue|Wed|Thu|Fri|Sat|Sun)");
            Matcher dotwMatcher = dotwPattern.matcher(virus1[1]);
            Pattern monthPattern = Pattern.compile("(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)");
            Matcher monthMatcher = monthPattern.matcher(virus1[2]);
            Pattern datePattern = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])");
            Matcher dateMatcher = datePattern.matcher(virus1[3]);
            Pattern hourPattern = Pattern.compile("(0?[0-9]|[1][0-9]|2[0-4])");
            Matcher hourMatcher = hourPattern.matcher(zeit[0]);
            Pattern minutePattern = Pattern.compile("(0?[0-9]|[1-5][0-9])");
            Matcher minuteMatcher = minutePattern.matcher(zeit[1]);
            Pattern secondPattern = Pattern.compile("(0?[0-9]|[1-5][0-9])");
            Matcher secondMatcher = secondPattern.matcher(zeit[2]);
            Pattern yearPattern = Pattern.compile("(2023|2024)");
            Matcher yearMatcher = yearPattern.matcher(virus1[6]);
            Pattern timezonePattern = Pattern.compile("(CEST|CET)");
            Matcher timezoneMatcher = timezonePattern.matcher(virus1[5]);


            if (nameMatcher.matches() && dotwMatcher.matches() && monthMatcher.matches() && dateMatcher.matches() && hourMatcher.matches() && minuteMatcher.matches() && secondMatcher.matches() && yearMatcher.matches() && timezoneMatcher.matches()) {
                correctVirus.add(virus[i]);

            }


        }
        System.out.print(correctVirus);
    }

}


