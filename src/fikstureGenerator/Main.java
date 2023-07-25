package fikstureGenerator;

import java.util.ArrayList;
import java.util.List;

import static fikstureGenerator.FixtureGenerator.generateFixture;

public class Main {
    public static void main(String[] args) {
        List<String> teams1 = new ArrayList<>();
        teams1.add("Galatasaray");
        teams1.add("Bursaspor");
        teams1.add("Fenerbahçe");
        teams1.add("Beşiktaş");
        teams1.add("Başakşehir");
        teams1.add("Trabzonspor");

        List<String> fixture1 = generateFixture(teams1);
        for (String match : fixture1) {
            System.out.println(match);
        }
        System.out.println("------------------------------------");

        List<String> teams2 = new ArrayList<>();
        teams2.add("Galatasaray");
        teams2.add("Bursaspor");
        teams2.add("Fenerbahçe");
        teams2.add("Beşiktaş");
        teams2.add("Başakşehir");
        teams2.add("Boluspor");

        List<String> fixture2 = generateFixture(teams2);
        for (String match : fixture2) {
            System.out.println(match);
        }
    }
}

