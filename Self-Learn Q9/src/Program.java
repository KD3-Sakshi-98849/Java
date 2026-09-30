
import java.util.Scanner;
import java.util.stream.IntStream;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter numbers:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = IntStream.of(arr)
                           .sum();

        System.out.println("Sum = " + sum);

        sc.close();
    }
}