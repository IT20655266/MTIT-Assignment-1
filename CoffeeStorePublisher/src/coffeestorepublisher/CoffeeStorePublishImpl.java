package coffeestorepublisher;

import java.util.Random;
import java.util.Scanner;

public class CoffeeStorePublishImpl implements CoffeeStorePublish{
	
	public  void publishService() {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please Enter Your Name : ");
		String name = scanner.nextLine();

		System.out.println("");
		System.out.println("Hello!.." + name);
		System.out.println("");

		int equipment = 2;
		while (equipment == 2) {

			System.out.println("\t\t    *****************Caffe Espresso******************");
			System.out.println("");
			System.out.println("\t\t    *************************************************");
			System.out.println("\t\t    	Coffee Equipments				" + "Price");
			System.out.println("\t\t    =================================================");
			System.out.println("\t\t    1. Knock Boxes			" +  "450.00");
			System.out.println("\t\t    2. Measuring Cups and Spoons " +  "200.00");
			System.out.println("\t\t    3. Espresso Tampers			" + "1000.00");
			System.out.println("\t\t    4. Frothing Pitchers		" + "20.00");
			System.out.println("\t\t    0. Exit");
			System.out.println("");

			System.out.print("Please Select Equipment:  ");
			int op = scanner.nextInt();

			if (op == 1 || op == 2 || op == 3 || op == 4) {

				System.out.print("Enter Requesting Quantity: ");
				double quantity = scanner.nextInt();
				System.out.println();

				Random rd = new Random();
				int No = rd.nextInt(1000);

				if (quantity > 0 && quantity <= 10) {

					if (op == 1) {
						double amount = (450.00 * quantity);
						System.out.println("Order No \t: " + No);
						System.out.println("Equipment \t: " + "Knock Boxes");
						System.out.println("Quantity \t: " + quantity);
						System.out.println("Amount\t: " + amount);
						System.out.println("");

					} else if (op == 2) {
						double amount = (200.00 * quantity);
						System.out.println("Order No \t: " + No);
						System.out.println("Equipment \t: " + "Measuring Cups and Spoons");
						System.out.println("Quantity \t: " + quantity);
						System.out.println("Amount\t: " + amount);
						System.out.println("");

					} else if(op == 3){
						double amount = (1000.00 * quantity);
						System.out.println("Order No \t: " + No);
						System.out.println("Equipment \t: " + "Espresso Tampers");
						System.out.println("Quantity \t: " + quantity);
						System.out.println("Amount\t: " + amount);
						System.out.println("");

					} else if(op == 4){
						double amount = (20.00 * quantity);
						System.out.println("Order No \t: " + No);
						System.out.println("Equipment \t: " + "Frothing Pitchers");
						System.out.println("Quantity \t: " + quantity);
						System.out.println("Amount\t: " + amount);
						System.out.println("");

					} else {
						System.out.println("Unavailable Equipment");
					
					}					

					System.out.println("Do you want to continue ? (1/2) : ");
					equipment = scanner.nextInt();

					if (equipment == 2) {
						System.out.println("");
						System.out.println("Thank You!!!...");
						System.out.println();
					}

				} else {

					System.out.println("Do you want to continue ? (1/2) : ");
					equipment = scanner.nextInt();

					if (equipment == 2) {
						System.out.println("");
						System.out.println("Thank You!!!...");
						System.out.println();
						return;
					}

				}

			} else if (op == 0) {

				System.out.println("");
				System.out.println("Thank You!!!...");
				System.out.println();
				return;

			} else {

				System.out.println("");
				System.out.println("Sorry, Invalid Operation No. Do you want to continue.? (1/2) : ");
				equipment = scanner.nextInt();

				if (equipment == 2) {
					System.out.println("");
					System.out.println("Thank You!!!...");
					System.out.println();
				}

			}

			while (equipment != 1 && equipment != 2) {
				System.out.println("");
				System.out.println("Sorry, Invalid Operation No.");
				System.out.println("Type 1 = Continue Ordering / Type 2 = Exit  ");
				equipment = scanner.nextInt();

				if (equipment == 2) {
					System.out.println();
					System.out.println("Thank You!!!...");
					System.out.println();
				}
			}

		}
		
	}

}