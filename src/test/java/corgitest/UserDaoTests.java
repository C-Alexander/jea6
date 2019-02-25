package corgitest;

import corgitest.models.User;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTests {

    private UserDao userDao;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        userDao = new UserDaoTestImpl();
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Create user")
    void createUser() {
        User user = new User("mockthis", "mockpass");

        userDao.add(user);

        assert(userDao.get("mockthis") != null);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Some other bs test")
    void idk() {
        Test test = new Test();


        assert(test.index().length() < 1);
    }
}