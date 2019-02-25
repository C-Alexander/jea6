package corgitest.models;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name="User.getUsers",
                query="SELECT u FROM User u")
})
public class User {
    @Id
    private String username;
    private String password;

    public User(String username, String password) {

        this.username = username;
        this.password = password;
    }

    public User() {
    }
}
