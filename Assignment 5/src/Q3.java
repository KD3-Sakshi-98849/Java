import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		
		str=str.trim();
		String []words=str.split(" ");
		System.out.println("Number of words:"+words.length);
		sc.close();
		
	}

}
