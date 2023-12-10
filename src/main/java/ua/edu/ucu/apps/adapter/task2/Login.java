package ua.edu.ucu.apps.adapter.task2;

import java.time.LocalDate;

public class Login {
    public Client login(String loginMethod) {
        if (loginMethod.equals("twitter")) {
            return new TwitterClient(new TwitterUser(
                    "dobosevych@gmail.com",
                    Country.UKRAINE,
                    LocalDate.of(1999, 12, 12)
            ));
        }

        if (loginMethod.equals("facebook")) {
            return new FacebookClient(new FacebookUser(
                    "dobosevych@gmail.com",
                    Country.UKRAINE,
                    LocalDate.of(2021, 1, 17)
            ));
        }
        throw new IllegalArgumentException("Unsupported login method");
    }
}
