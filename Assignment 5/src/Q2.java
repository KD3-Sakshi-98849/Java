import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		if(rev==s) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("Not palindrome");
		}
		sc.close();

	}

}
