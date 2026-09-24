package com.app.fruits;
import java.util.*;
public class FruitBasket {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		int counter=0;
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Basket Size");
		size=sc.nextInt();
		
		
		
		Fruit basket[]=new Fruit[size];
		
		do {
			
			System.out.println("0.Exit");
			System.out.println("1.Add Mango");
			System.out.println("2.Add Orange");
			System.out.println("3.Add Apple");
			System.out.println("4.Display Names");
			System.out.println("5.Display fresh Fruits");
			System.out.println("6.Display stale fruits");
			System.out.println("7.Mark fruit stale");
			System.out.println("8.Mark all sour fruits stale");
		
			System.out.println("Enter Choice:");
		    choice=sc.nextInt();
		    
		    switch(choice) {
		    case 1:
		    	if(counter<basket.length) {
		    	 String name;
		    	    Double weight;
		    	    String color;
		    	    
		    	    System.out.println("Enter Mango Name:");
		    	    name=sc.next();
		    	    
		    	    System.out.println("Enter Mango Weight:");
		    	    weight=sc.nextDouble();
		    	    
		    	    System.out.println("Enter Mango color:");
		    	    color=sc.next();
		    	    
		    	    basket[counter++]=new Mango(color,weight,name);//polymorphism त्यात आपण वेगवेगळे child objects ठेवतो:
		    	    
		     	
		    	}else {
		    		System.out.println("Basket is Full");
		    	}
		     	break;
		    case 2:
		    	if(counter<basket.length) {
		    		 System.out.println("Enter Orange Name:");
			    	    String name=sc.next();
			    	    
			    	    System.out.println("Enter Orange Weight:");
			    	   Double weight=sc.nextDouble();
			    	    
			    	    System.out.println("Enter Orange color:");
			    	   String color=sc.next();
			    	    
			    	    basket[counter++]=new Orange(color,weight,name);
		    		
		    	}else {

					System.out.println("Basket is full.");
				}
		    	break;
		    case 3:

				if (counter < basket.length) {

					System.out.print("Enter Apple name: ");
					String name = sc.next();

					System.out.print("Enter Apple weight: ");
					 Double weight=sc.nextDouble();

					System.out.print("Enter Apple color: ");
					String color = sc.next();

					basket[counter++] = new Apple(color, weight, name);

					System.out.println("Apple added successfully.");

				} else {

					System.out.println("Basket is full.");
				}

				break;
				
				
		    case 4:
		    	System.out.println("\nFruit Name:");
		    	for(Fruit fruit:basket) {
		    		if(fruit!=null) {
		    			System.out.println(fruit.getName());
		    			
		    		}
		    	}
		    	break;
		    	
		    case 5:
		    	System.out.println("Fresh Fruits");
		    	for(Fruit fruit:basket) {
		    	if(fruit!=null  && fruit.isFresh()) {
		    		System.out.println(fruit);
		    		System.out.println("taste:"+fruit.taste());
		    	}
		    	}
		    	break;

		    case 6:
		    	System.out.println("\n stale fruits");
		    	for(Fruit fruit:basket) {
		    		if (fruit != null && !fruit.isFresh()) {

						System.out.println(
								"Name: " + fruit.getName()
								+ ", Taste: " + fruit.taste()); 
						//fruit .taste=runtime polymorphismहा Fruit type चा आहे.
//पण actual object कोणता आहे त्यावर taste() ठरतो.
					}
		    	}
		    	break;
		    case 7:
		    	System.out.print("Enter fruit index: ");
				int index = sc.nextInt();

				if (index >= 0 && index < basket.length
						&& basket[index] != null) {

					basket[index].setFresh(false);

					System.out.println("Fruit marked as stale.");

				} else {

					System.out.println("Invalid index.");
				}

				break;
		    case 8:
				for (Fruit fruit : basket) {

					if (fruit != null
							&& fruit.taste().equals("sour")) {

						fruit.setFresh(false);
					}
				}

				System.out.println("All sour fruits marked as stale.");

				break;
				
		    case 0:
		    	System.out.println("Exiting...");

				break;

			default:

				System.out.println("Invalid choice.");
		 
		    }
		  
		   
		   		
		    
		}
		
		while(choice!=0) ;
	}

}
