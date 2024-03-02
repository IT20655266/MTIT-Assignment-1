package coffeestorepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import coffeestorepublisher.CoffeeStorePublish;

public class CoffeeStoreActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;
	
	public void start(BundleContext context) throws Exception {
		CoffeeStorePublish publishService = new CoffeeStorePublishImpl();
		publishServiceRegistration = context.registerService(CoffeeStorePublish.class.getName(), publishService,null);
		System.out.println("Start Coffee Store Service");
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Publisher Stop");
		publishServiceRegistration.unregister();
		System.out.println("Stop Coffee Store Service");
	}

}
