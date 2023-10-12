package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basketSize;
        System.out.println("Enter the size of the fruit basket:");
        basketSize = sc.nextInt();
        Fruit[] basket = new Fruit[basketSize];
        int counter = 0;

        int choice;
        do {
            System.out.println("Select an option:");
            System.out.println("0. Exit");
            System.out.println("1. Add Mango");
            System.out.println("2. Add Orange");
            System.out.println("3. Add Apple");
            System.out.println("4. Display names of all fruits in the basket");
            System.out.println("5. Display name, color, weight, and taste of all fresh fruits");
            System.out.println("6. Display taste of all stale fruits");
            System.out.println("7. Mark a fruit as stale");
            System.out.println("8. Mark all sour fruits as stale (optional)");

            choice = sc.nextInt();

            switch(choice) {
                case 0:
                    System.out.println("Exiting...");
                    break;
                case 1:
                    System.out.println("Enter the details of the Mango:");
                    System.out.println("Name: ");
                    String mangoName = sc.next();
                    System.out.println("Weight: ");
                    double mangoWeight = sc.nextDouble();
                    System.out.println("Color: ");
                    String mangoColor = sc.next();
                    basket[counter] = new Mango();
                    counter++;
                    break;
                case 2:
                    System.out.println("Enter the details of the Orange:");
                    System.out.println("Name: ");
                    String orangeName = sc.next();
                    System.out.println("Weight: ");
                    double orangeWeight = sc.nextDouble();
                    System.out.println("Color: ");
                    String orangeColor = sc.next();
                    basket[counter] = new Orange();
                    counter++;
                    break;
                case 3:
                    System.out.println("Enter the details of the Apple:");
                    System.out.println("Name: ");
                    String appleName = sc.next();
                    System.out.println("Weight: ");
                    double appleWeight = sc.nextDouble();
                    System.out.println("Color: ");
                    String appleColor = sc.next();
                    basket[counter] = new Apple();
                    counter++;
                    break;
                case 4:
                    System.out.println("Names of all fruits in the basket:");
                    for(Fruit fruit : basket) {
                        if(fruit != null) {
                            System.out.println(fruit.getName());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Details of all fresh fruits:");
                    for(Fruit fruit : basket) {
                        if(fruit != null && fruit.isFresh()) {
                            System.out.println(fruit.toString());
                            System.out.println("Taste: " + fruit.taste());
                        }
                    }
                    break;
                case 6:
                    System.out.println("Taste of all stale fruits:");
                    for(Fruit fruit : basket) {
                        if(fruit != null && !fruit.isFresh()) {
                            System.out.println(fruit.taste());
                        }
                    }
                    break;
                case 7:
                    System.out.println("Enter the index of the fruit to mark as stale:");
                    int index = sc.nextInt();
                    if(index < 0 || index >= basket.length) {
                        System.out.println("Invalid index!");
                    } else {
                        basket[index].setFresh(false);
                        System.out.println("Fruit marked as stale.");
                    }
                    break;
                case 8:
                    System.out.println("Marking all sour fruits as stale.");
                    for(Fruit fruit : basket) {
                        if(fruit != null && fruit.taste().equals("sour")) {
                            fruit.setFresh(false);
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

        } while(choice != 0);

        sc.close();
    }
}

			
			
		

//package com.app.tester;
//
//import java.util.Scanner;
//
//import com.app.fruits.*;
//
//public class FruitBasket {
//
//	public static void main(String[] args) 
//	{
//		
//		int choice=0;
//		int counter=0;
//		
//		Scanner scanner=new Scanner(System.in);
//		int basket_size;
//		System.out.println("Enter basket size");
//		basket_size= scanner.nextInt();
//		Fruit basket[] = new Fruit[basket_size];
//		do
//		{
//		
//	System.out.println("0.Exit");
//	System.out.println("1.Add Mango");
//	System.out.println("2.Add Orange");
//	System.out.println("3.Add Apple");
//	System.out.println("4.Display names of all fruits in the basket.");
//	System.out.println("5.Display name,color,weight , taste of all fresh fruits , in the basket.");
//	System.out.println("6.Display tastes of all stale(not fresh) fruits in the basket.");
//	System.out.println("7.Mark a fruit as stale");
//	System.out.println("8.Mark all sour fruits stale (optional)");
//	System.out.println("Enter choice");
//	choice=scanner.nextInt();
//	
//	
//		switch(choice)
//		{
//			case 0: System.out.println("Thank you");
//			break;
//			
//			case 1: if(counter<basket_size)
//			{ 
//				basket[counter]=new Mango();
//				basket[counter].acceptData();
//                counter++; 
//			}
//			break;
//			case 2: if(counter<basket_size)
//			{
//				basket[counter]=new Orange();
//				basket[counter].acceptData();
//                counter++;
//			}
//			break;
//			case 3: if(counter<basket_size)
//			{
//				basket[counter]=new Apple();
//				basket[counter].acceptData();
//                counter++;
//			}
//			break;
//			
//			case 4:
//				 System.out.println("Names of fruits=");
//			for(int i=0;i<basket_size;i++)
//			{
//				System.out.println(basket[i].getName());
//			}
//			break;
//			
//			case 5:
//                System.out.println("Details of all fresh fruits:");
//                for(Fruit fruit : basket) {
//                    if(fruit != null && fruit.isFresh()) {
//                        System.out.println(fruit.toString());
//                        System.out.println("Taste: " + fruit.taste());
//                    }
//                }
//                break;
//            case 6:
//                System.out.println("Taste of all stale fruits:");
//                for(Fruit fruit : basket) {
//                    if(fruit != null && !fruit.isFresh()) {
//                        System.out.println(fruit.taste());
//                    }
//                }
//                break;
//            case 7:
//                System.out.println("Enter the index of the fruit to mark as stale:");
//                int index = scanner.nextInt();
//                if(index < 0 || index >= basket.length) {
//                    System.out.println("Invalid index!");
//                } else {
//                    basket[index].setFresh(false);
//                    System.out.println("Fruit marked as stale.");
//                }
//                break;
//            case 8:
//                System.out.println("Marking all sour fruits as stale.");
//                for(Fruit fruit : basket) {
//                    if(fruit != null && fruit.taste().equals("sour")) {
//                        fruit.setFresh(false);
//                    }
//                }
//                break;
//            default:
//                System.out.println("Invalid choice!");
//                break;
//        }
//
//    } while(choice != 0);
//
//    scanner.close();
//}
//}

