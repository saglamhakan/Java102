package fikstureGenerator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class FixtureGenerator {
    public static List<String> generateFixture(List<String> teams) {
        List<String> fixture = new ArrayList<>();
        int totalTeams = teams.size();

        if (totalTeams % 2 != 0) {
            teams.add("Bay");
            totalTeams++;
        }

        int rounds = totalTeams - 1;
        int halfSize = totalTeams / 2;

        for (int round = 0; round < rounds; round++) {
            fixture.add("Round " + (round + 1));
            for (int match = 0; match < halfSize; match++) {
                int home = (round + match) % (totalTeams - 1);
                int away = (totalTeams - 1 - match + round) % (totalTeams - 1);
                if (match == 0) {
                    away = totalTeams - 1;
                }
                fixture.add(teams.get(home) + " vs " + teams.get(away));
            }
        }
        return fixture;
    }
}
