package corgitest;

import corgitest.models.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> get();

    User get(String username);
}
