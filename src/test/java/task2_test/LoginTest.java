package task2_test;

import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.adapter.task2.Client;
import ua.edu.ucu.apps.adapter.task2.Login;


import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LoginTest {
    @Test
    public void testLoginFacebook() {
        Login login = new Login();
        Client user = login.login("facebook");

        assertEquals(user.getEmail(), "dobosevych@gmail.com");
        assertEquals(user.getCountry(), "UKRAINE");
        assertEquals(user.getLastActiveTime(), LocalDate.of(2021, 1, 17));
    }

    @Test
    public void testLoginTwitter() {
        Login login = new Login();
        Client user = login.login("twitter");

        assertEquals(user.getEmail(), "dobosevych@gmail.com");
        assertEquals(user.getCountry(), "UKRAINE");
        assertEquals(user.getLastActiveTime(), LocalDate.of(1999, 12, 12));
    }

    @Test
    public void testLoginException() {
        Login login = new Login();
        try {
            login.login("google");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Unsupported login method");
        }
    }
}
