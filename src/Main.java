import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {

	public static final String BINDING_NAME = "HelloServiceImpl";

	public static void main(String[] args) throws Exception {
		//Returns a reference to the remote object Registry on the specified host and port. If host is null, the local host is used.
		final Registry registry = LocateRegistry.getRegistry("localhost", 2099);
		final RemoteHelloService service = (RemoteHelloService) registry.lookup(BINDING_NAME);
		//Returns the remote reference bound to the specified name in this registry.

		System.out.println(service.sayHello("My Mother"));

	}

}
