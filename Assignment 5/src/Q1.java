import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			char ch=name.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
		sc.close();
	}

}
