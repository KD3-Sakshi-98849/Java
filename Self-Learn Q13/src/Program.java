
import java.util.Arrays;
import java.util.Comparator;

class Student {
    private int roll;
    private String name;
    private String city;
    private double marks;

    public Student(int roll, String name, String city, double marks) {
        this.roll = roll;
        this.name = name;
        this.city = city;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return roll + " " + name + " " + city + " " + marks;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public double getMarks() {
        return marks;
    }
}

public class Program {

    public static void main(String[] args) {

        Student[] arr = {
            new Student(1, "Rahul", "Pune", 75.5),
            new Student(2, "Amit", "Mumbai", 85.0),
            new Student(3, "Sneha", "Pune", 85.0),
            new Student(4, "Priya", "Mumbai", 90.0),
            new Student(5, "Akash", "Pune", 85.0),
            new Student(6, "Neha", "Mumbai", 90.0)
        };

        Comparator<Student> c = Comparator
                .comparing(Student::getCity, Comparator.reverseOrder())
                .thenComparing(Student::getMarks, Comparator.reverseOrder())
                .thenComparing(Student::getName);

        Arrays.sort(arr, c);

        System.out.println("Students after sorting:");

        for (Student s : arr) {
            System.out.println(s);
        }
    }
}