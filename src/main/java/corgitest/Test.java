package corgitest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/sup")
public class Test {

    @Inject
    UserDaoImpl userDao;

@GET
@Produces
    public String index() {
    System.out.println(userDao.get().size());
    return "hi";
    }
}
