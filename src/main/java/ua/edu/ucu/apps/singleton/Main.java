package ua.edu.ucu.apps.singleton;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        User user = new User(
                "Andrew",
                "ayaroshlvua@gmail.com",
                18
        );
        user.save();
    }
}
