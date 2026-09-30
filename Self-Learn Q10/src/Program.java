
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Program {

    public static void main(String[] args) {

        IntStream stream1 = IntStream.rangeClosed(1, 10);

        System.out.println("Numbers from 1 to 10:");
        IntStream.rangeClosed(1, 10)
                 .forEach(n -> System.out.print(n + " "));

        int sum = IntStream.rangeClosed(1, 10)
                           .sum();

        System.out.println("\n\nSum = " + sum);

        IntSummaryStatistics statistics =
                IntStream.rangeClosed(1, 10)
                         .summaryStatistics();

        System.out.println("\nSummary Statistics:");
        System.out.println("Count = " + statistics.getCount());
        System.out.println("Sum = " + statistics.getSum());
        System.out.println("Min = " + statistics.getMin());
        System.out.println("Max = " + statistics.getMax());
        System.out.println("Average = " + statistics.getAverage());
    }
}
