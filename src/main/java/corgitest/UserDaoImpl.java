package corgitest;

import corgitest.models.User;

import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Named
public class UserDaoImpl implements UserDao {

    @PersistenceContext(unitName = "NewPersistenceUnit")
    EntityManager em;


    public void add(User user) {

    }

    public List<User> get() {
        return em.createNamedQuery("User.getUsers", User.class).getResultList();
    }

    public User get(String username) {
        return null;
    }
}
