import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System .out.println("Enter number");
        int n=sc.nextInt();
        
        System.out.println("Given number:"+n);
        System.out.println("Binary Equivalent:"+Integer.toBinaryString(n));
        System.out.println("Octal euivalent:"+Integer.toOctalString(n));
        System.out.println("Hexadecinamal equivalent:"+Integer.toHexString(n));
        
	}

}
