package corgitest; /** Copyright Payara Services Limited **/

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * This class activates JAX-RS and sets the base path to "/rest".
 *
 * @author Arjan Tijms
 *
 */
@ApplicationPath("/idk")
public class JaxRsActivator extends Application {

}