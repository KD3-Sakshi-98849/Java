public class Program {

    public static <T extends Number & Comparable<T>> T findMinimum(T[] arr) {

        T min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i].compareTo(min) < 0) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {

        Integer[] arr1 = {10, 5, 20, 3, 15};

        Double[] arr2 = {10.5, 2.5, 8.5, 1.5};

        System.out.println("Minimum Integer = " + findMinimum(arr1));
        System.out.println("Minimum Double = " + findMinimum(arr2));
    }
}