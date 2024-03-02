package coffeestoresubscriber;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import coffeestorepublisher.CoffeeStorePublish;


public class Activator implements BundleActivator {

	ServiceReference Order;

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Welcome to Online Coffee Store!!!...");
		

		Order = context.getServiceReference(CoffeeStorePublish.class.getName());
		CoffeeStorePublish CoffeeStorePublish = (CoffeeStorePublish) context.getService(Order);

		Scanner sc = new Scanner(System.in);

		int opt = 1;
		while (opt == 1) {

			System.out.println("");
			System.out.println("* * * * * * * *  Thank you for visiting our online Coffee store* * * * * * * *");
			System.out.println("");

			System.out.println("\t\t                    Service                 ");
			System.out.println("\t\t    ----------------------------------------");
			System.out.println("");
			System.out.println("\t\t\t    1. Coffee Order Service");
			System.out.println("\t\t\t    2. Equipment Order Service");
			System.out.println("\t\t\t    3. Delivery Service");
			System.out.println("\t\t\t    4. Feedback Services");
			System.out.println("\t\t\t    0. Exit");
			System.out.println("");
			System.out.println("\t\t    ----------------------------------------");
			System.out.println("");

			System.out.print("Please Enter Your Prefer Service(1/2/3/4/0) :");
			int option = sc.nextInt();

			if (option == 2) {
				System.out.println("");
				CoffeeStorePublish.publishService();
				System.out.println("");

				System.out.println("Do you want to get another service ? [Type 1 = Yes | Type 2 = No] : ");
				opt = sc.nextInt();

				if (opt == 2) {
					System.out.println("");
					System.out.println("* * * * * * * * * * * * * * * * * THANK YOU * * * * * * * * * * * * * * * * * * * * *");
					System.out.println("");
				
				}
			}else {
				System.out.println("");
				System.out.println("Unavailable Service!!!...Do you want to continue.? [Type 1 = Yes | Type 2 = No] : ");
				opt = sc.nextInt();

				if (opt == 2) {
					System.out.println("");
					System.out.println("                            THANK YOU                               ");
					System.out.println("");
				}
			}

			while (opt != 1 && opt != 2) {
				System.out.println("");
				System.out.println("Unavailable Service!!!...");
				System.out.println("Type 1 = Continue Services | Type 2 = Exit ");
				opt = sc.nextInt();

				if (opt == 2) {
					System.out.println();
					System.out.println("**********************************THANK YOU********************************************");
					System.out.println("");
				}
			}

		}

	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Stop Dashboard!!!...");
		context.ungetService(Order);
		
	}
}
