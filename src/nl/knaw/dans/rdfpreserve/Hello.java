package nl.knaw.dans.rdfpreserve;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

/**
 * Resource which has only one representation.
 */
public class Hello extends ServerResource {

	@Get
	public String represent() {
		return "hello, world";
	}

}