import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int op;
		int qty;
	    int total=0;
	
		do {
			System.out.println("Food Menu");
			System.out.println("Dosa");
			System.out.println("endli");
			System.out.println("Samosa");
			System.out.println("vada_sambahr");
			System.out.println("generating bill:");
			
			
			System.out.println("Enter choice:");
			op=sc.nextInt();
			
			switch(op) {
			case 1:
				System.out.println("Enter quantity:");
				qty=sc.nextInt();
				total=total+(50*qty);
				break;
			case 2:
				System.out.println("Enter quantity:");
				qty=sc.nextInt();
				total=total+(100*qty);
				break;
			case 3:
				System.out.println("Enter Quantity:");
				qty=sc.nextInt();
				total=total+(80*qty);
				break;
			case 4:
				System.out.print("enter Quantity:");
				qty=sc.nextInt();
				total=total+(90*qty);
				break;
			case 5:
				System.out.println("Generating bill:");
				break;
			default:
				System.out.println("Invalid Choice!");
				
			}
			}
		while(op!=5);
		
				System.out.println("Total bill="+total);

		

	}

}
