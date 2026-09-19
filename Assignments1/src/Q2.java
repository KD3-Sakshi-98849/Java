import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1:");
        Double v1=sc.nextDouble();
        System.out.println("Enter Number 2:");
        Double v2=sc.nextDouble();
        if(v1!=v2) {
        	System.out.println();
        }
        Double sum=v1+v2;
        double avg=sum/2;
        System.out.println("avg:"+avg);
        
        
	}

}
