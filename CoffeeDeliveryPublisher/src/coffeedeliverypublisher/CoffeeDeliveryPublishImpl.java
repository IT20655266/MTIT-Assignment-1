package coffeedeliverypublisher;

import java.util.Random;
import java.util.Scanner;

public class CoffeeDeliveryPublishImpl implements DeliveryCoffee {
	
	
	@Override
	public void  DeliveryCoffee(){
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("* * * * * * * *  Thank you for visiting our online Coffee store* * * * * * * *");
		System.out.println("");
		System.out.println("* * * * * * * *  Welcome to Coffee Delivery Service  * * * * * * * * ");
		System.out.println("");
		System.out.print("Please Give Your Name : ");
		String Yname = scanner.next();

		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  * * * ");
		System.out.println(" ");
		System.out.println(" WELCOME !! " + Yname);
		System.out.println("");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		int choice = 1;
		
		while (choice == 1) {
			
			System.out.println("");
			System.out.println("**** *** ** *  COFFEE DELIVERY SERVICE *  ** *** ****");
			System.out.println("");
			

			System.out.print("Do you have a copy of your order number? [1 = Yes || 2 = No]: ");
			int ord = scanner.nextInt();
			System.out.println("");
			

			double totCoffeePrice = 0;
			double totPrice = 0;
			

			Random random = new Random();
			int delivery_Number = random.nextInt(1000);
			int order_Number = random.nextInt(1000);

			
			if (ord == 1) {

				int choice1 = 1;

				while (choice1 == 1) {

					System.out.print("Please Enter the order Number :  ");
					String orderNumber = scanner.next();

					
					System.out.print("Please Enter the  Distance in Kilometers :  ");
					double dist = scanner.nextDouble();
					System.out.println("");
					
					
					System.out.print("Please Enter Your Address: ");
					String address = scanner.next();
					
					
					if (dist >= 1 && dist <= 20) {
						
						double delivery_charges = 100;
						delivery_charges = delivery_charges + ((dist-1) * delivery_charges);
						totPrice = delivery_charges;
						
						System.out.println("Order Number \t: " + orderNumber);
						System.out.println("Delivery Number\t: " + delivery_Number);
						System.out.println("Address \t: " + address);
						System.out.println("Distance in Kilometers \t: " + dist + " KM ");
						System.out.println("Delivery Price \t: " + totPrice);
						
						System.out.println("");
						System.out.println("Do you want to keep going ? [Type 1 = Yes | Type 2 = No] : ");
						choice= scanner.nextInt();

						if (choice == 2) {
							
							System.out.println("");
							System.out.println("* ! * ! * ! * ! * ! * ! * ! Thank You * ! * ! * ! * ! * ! * ! * ! *");
							System.out.println();
						}
						
						break;

					} else {
						
						System.out.println("Oops .... We are really Sorry !!! our coverage is only for  1km to 20km..");
						System.out.println(" ");
						
						System.out.println("Do you want to keep going ? [type 1 = Yes || Type 2 = No] : ");
						choice1 = scanner.nextInt();

						if (choice1 == 2) {
							
							System.out.println("");
							System.out.println("===================================== Thank You====================================");
							System.out.println();
							return;
						}
					}
				}

			} else if (ord == 2) {
				

				int choice2 = 1;
				
				while (choice2 == 1) {
					

					System.out.println("");
					System.out.println("*    * *    * *    * *    * * ONLINE COFFEE  DELIVERY SERVICE * *    * *    * *    * *    *");
					System.out.println("");

			
					System.out.println("Please Enter Your Distance in Kilometers[KM]: ");
					double dist = scanner.nextDouble();
					System.out.println(""); 
					
					System.out.println("Please Enter Your Address: ");
					System.out.println(" ");
					String address = scanner.next();
					
					
					if (dist > 1 && dist <= 20) {
						
						

						System.out.println("//////////////////////   List of Coffee(s)  ////////////////////");
						System.out.println("");
						System.out.println("	Name Of the Coffee 		" + "price per 1 ");
						
						System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
						
						System.out.println("1. Espresso	\t\t\t" + "2000");
						System.out.println("2. Latte	\t\t	" + "1500");
						System.out.println("3. Cappuccino \t\t\t" + "600");
						System.out.println("4. Flat White \t\t\t\t"+ "800");
						System.out.println("0. Exit");
						System.out.println("");

						System.out.println("Please Enter Name of the Coffee [1|2|3|4|0]:  ");
						
						int alt = scanner.nextInt();

						if (alt == 1 || alt == 2 || alt == 3||alt==4) {

							System.out.println("Please Enter the Serving Amount You Needed ?  ");
							double count = scanner.nextDouble();
							System.out.println("");

							if (alt == 1) {
								
								totCoffeePrice = ( 2000 * count );
								System.out.println("Delivery Number \t: " + delivery_Number);
								System.out.println("Order Number \t: " + order_Number);
								System.out.println("Name of the Coffee \t: " + "Espresso");
								System.out.println("Amount \t: " + count);
								System.out.println("Address \t: " + address);
								System.out.println("Distance in Kilometers \t: " + dist + " KM");
								System.out.println("Total Price\t: " + totCoffeePrice);

							} else if (alt == 2) {
								
								totCoffeePrice = (1500 * count);
								System.out.println("Delivery Number \t: " + delivery_Number);
								System.out.println("Order Number \t: " + order_Number);
								System.out.println("Name Of the Coffee \t: " + "Latte");
								System.out.println("Amount \t: " + count);
								System.out.println("Address \t: " + address);
								System.out.println("Distance in Kilometers \t: " + dist + " KM");
								System.out.println("Total Price\t: " + totCoffeePrice);
								
							}else if (alt== 3) {
								
								totCoffeePrice = (600 * count);
								System.out.println("Delivery Number \t: " + delivery_Number);
								System.out.println("Order Number \t: " + order_Number);
								System.out.println("Name Of the Coffee \t: " + "Cappuccino");
								System.out.println("Amount \t: " + count);
								System.out.println("Address \t: " + address);
								System.out.println("Distance in Kilometers \t: " + dist + " KM");
								System.out.println("Total Price\t: " + totCoffeePrice);
								
								

							} else {
								
								totCoffeePrice = (800 * count);
								System.out.println("Delivery Number \t: " + delivery_Number);
								System.out.println("Order Number \t: " + order_Number);
								System.out.println("Name of the Coffee \t: " + "  Flat White");
								System.out.println("Amount \t: " + count);
								System.out.println("Address \t: " + address);
								System.out.println("Distance in Kilometers \t: " + dist + " KM");
								System.out.println("Total Price\t: " + totCoffeePrice);

							}

							if (dist >= 1) {
								
								double delivery_charges = 100;
								delivery_charges = delivery_charges + ((dist - 1) * delivery_charges);
								totPrice = totCoffeePrice + delivery_charges;
								System.out.println("Delivery Amount [Rs]: " + delivery_charges);
							}
							

							System.out.println("Total Amount [Rs] \t: " + totPrice);
							System.out.println("");

							System.out.println("Do you want to keep going ? [Type 1 = Yes | Type 2 = No] : ");
							choice = scanner.nextInt();
							

							if (choice == 2) {
								
								System.out.println("");
								System.out.println("* * * * * * * * * * * * * * * * * * Thank You * * * * * * * * * * * * * * * * * * * * * *");
								System.out.println();
							}
							
							break;
							
						} else if (alt == 0) {
							
							System.out.println("");
							System.out.println("* * * * * * * * * * * * * * * * * * Thank You * * * * * * * * * * * * * * * * * * * * * *");
							System.out.println();
							return;

						} else {
							
							System.out.println("");
							System.out.println("Invalid Input.! .! !  | Do you want to keep going ? [Type 1 = Yes | Type 2 = No] : ");
							choice2 = scanner.nextInt();

							if (choice2 == 2) {
								System.out.println("");
								System.out.println("* * * * * * * * * * * * * * * * * * Thank You * * * * * * * * * * * * * * * * * * * * * *");
								System.out.println();
							}
						}

					} else {
						
						System.out.println(" Oops..Sorry!! Our coverage is only for  1km to 20km ");
						System.out.println(" ");
						System.out.println("Do you want to keep going ? [Type 1 = Yes || Type 2 = No] : ");
						choice2 = scanner.nextInt();

						if (choice2 == 2) {
							
							System.out.println("");
							System.out.println("* * * * * * * * * * * * * * * * * * Thank You * * * * * * * * * * * * * * * * * * * * * *");
							System.out.println("");
							return;
						}
					}

				}

			} else {
				
				System.out.println("");
				System.out.println("Invalid Input!! | Do you want to keep going  ? [Type 1 = Yes || Type 2 = No] : ");
				choice = scanner.nextInt();

				if (choice == 2) {
					
					System.out.println("");
					System.out.println("* * * * * * * * * * * * * * * * * * Thank You * * * * * * * * * * * * * * * * * * * * * *");
					System.out.println("");
				}

			}

			while (choice != 1 && choice != 2) {
				
				System.out.println("");
				System.out.println("Invalid Input!");
				choice = scanner.nextInt();

				if (choice == 2) {
					
					System.out.println("");
					System.out.println("* * * * * * * * * * * * * * * * * Thank You * * * * * * * * * * * * * * * * * * * * * *");
					System.out.println("");
				}
			}
		}
	}

	
	

}
