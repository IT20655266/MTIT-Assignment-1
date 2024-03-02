package coffeedeliverypublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;



public class CoffeeDeliveryActivator implements BundleActivator {
	
	ServiceRegistration CoffeeDeliveryRegistration;



	public void start(BundleContext context) throws Exception {
		
		System.out.println("Start Coffee Delivery Publisher!");
		DeliveryCoffee  CoffeeDeliveryPublisherService = new CoffeeDeliveryPublishImpl();
		CoffeeDeliveryRegistration = context.registerService(DeliveryCoffee.class.getName(), CoffeeDeliveryPublisherService, null);
		//CoffeeDeliveryActivator.context = bundleContext;
	}

	public void stop(BundleContext bundleContext) throws Exception {
		
		System.out.println("Stop  Coffee  Delivery Publisher!");
		CoffeeDeliveryRegistration.unregister();
		
		
		
		//CoffeeDeliveryActivator.context = null;
	}

}
