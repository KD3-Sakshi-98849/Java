class Course {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return courseName;
    }
}

class Student {
    private int rollNo;
    private String name;
    private Course course;

    // Constructor 1 - default constructor
    public Student() {
        rollNo = 0;
        name = "Unknown";
        course = new Course("Not Assigned");
    }

    // Constructor 2 - two parameters
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = new Course("Not Assigned");
    }

    // Constructor 3 - three parameters
    public Student(int rollNo, String name, Course course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    // Shallow Copy Constructor
    public Student(Student s) {
        this.rollNo = s.rollNo;
        this.name = s.name;
        this.course = s.course;       // same Course object
    }

    // Deep Copy Constructor
    public Student deepCopy() {
        Student temp = new Student();

        temp.rollNo = this.rollNo;
        temp.name = this.name;
        temp.course = new Course(this.course.getCourseName());

        return temp;
    }

    public void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Course  : " + course);
    }

    public Course getCourse() {
        return course;
    }
}

public class Program {

    public static void main(String[] args) {

        // Multiple constructors
        Student s1 = new Student();
        Student s2 = new Student(101, "Sakshi");

        Course c1 = new Course("Java");
        Student s3 = new Student(102, "Rahul", c1);

        System.out.println("Original Student:");
        s3.display();

        // ---------------- SHALLOW COPY ----------------

        Student shallow = new Student(s3);

        // Changing course using shallow copy
        shallow.getCourse().setCourseName("Python");

        System.out.println("\nAfter Shallow Copy:");
        System.out.println("Original Student:");
        s3.display();

        System.out.println("Shallow Copy:");
        shallow.display();

        // ---------------- DEEP COPY ----------------

        // First change original course back
        s3.getCourse().setCourseName("Java");

        Student deep = s3.deepCopy();

        // Change course of deep copy
        deep.getCourse().setCourseName("C++");

        System.out.println("\nAfter Deep Copy:");

        System.out.println("Original Student:");
        s3.display();

        System.out.println("Deep Copy:");
        deep.display();
    }
}