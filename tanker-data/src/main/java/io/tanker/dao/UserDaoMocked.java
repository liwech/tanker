package io.tanker.dao;

import io.tanker.model.User;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoMocked {

    public static final long USER_ID = 1337L;
    public static final String USER_EMAIL = "user@mail.com";
    private static final User MOCKED_USER;

    static {
        MOCKED_USER = new User();
        MOCKED_USER.setId(USER_ID);
        MOCKED_USER.setEmail(USER_EMAIL);
        StandardPasswordEncoder encoder = new StandardPasswordEncoder();
        String encryptedPassword = encoder.encode("123456");
        MOCKED_USER.setPassword(encryptedPassword);
        MOCKED_USER.setServerUrl("http://overflow.io:4243");
    }

    public User findUserById(long id) {
        User user = null;
        if (USER_ID == id) {
            user = MOCKED_USER;
        }
        return user;
    }

    public User findUserByEmail(String email) {
        User user = null;
        if (USER_EMAIL.equals(email)) {
            user = MOCKED_USER;
        }
        return user;
    }
}
