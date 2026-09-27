import java.util.Scanner;

class Employee {
	
    private int id;
    
    private String name;
    
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
     }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}

interface Stack {
	
    int STACK_SIZE = 5;

    void push(Employee emp);

    Employee pop();
}

class FixedStack implements Stack {

    private Employee[] arr;
    private int top;

    public FixedStack() {
        arr = new Employee[STACK_SIZE];
        top = -1;
    }

    @Override
    public void push(Employee emp) {

        if (top == STACK_SIZE - 1) {
            System.out.println("Stack is full !!!");
        } else {
            top++;
            arr[top] = emp;
            System.out.println("Employee pushed successfully.");
        }
    }

    @Override
    public Employee pop() {

        if (top == -1) {
            System.out.println("Stack is empty !!!");
            return null;
        }

        Employee emp = arr[top];
        top--;

        return emp;
    }
}

class GrowableStack implements Stack {

    private Employee[] arr;
    private int top;

    public GrowableStack() {
        arr = new Employee[STACK_SIZE];
        top = -1;
    }

    @Override
    public void push(Employee emp) {

        if (top == arr.length - 1) {

            Employee[] temp = new Employee[arr.length * 2];

            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }

            arr = temp;

            System.out.println("Stack size increased.");
        }

        top++;
        arr[top] = emp;

        System.out.println("Employee pushed successfully.");
    }

    @Override
    public Employee pop() {

        if (top == -1) {
            System.out.println("Stack is empty !!!");
            return null;
        }

        Employee emp = arr[top];
        top--;

        return emp;
    }
}

public class Tester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack stack = null;

        int choice;

        do {
            System.out.println("\n-----------------------------");
            System.out.println("1 -- Choose Fixed Stack");
            System.out.println("2 -- Choose Growable Stack");
            System.out.println("3 -- Push data");
            System.out.println("4 -- Pop data");
            System.out.println("5 -- Exit");
            System.out.println("-----------------------------");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:
                if (stack == null) {
                    stack = new FixedStack();
                    System.out.println("Fixed Stack selected.");
                } else {
                    System.out.println("Stack already selected !!!");
                }
                break;

            case 2:
                if (stack == null) {
                    stack = new GrowableStack();
                    System.out.println("Growable Stack selected.");
                } else {
                    System.out.println("Stack already selected !!!");
                }
                break;

            case 3:
                if (stack == null) {
                    System.out.println("NO stack chosen !!!");
                } else {

                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.next();

                    System.out.print("Enter Employee Salary: ");
                    double salary = sc.nextDouble();

                    Employee emp = new Employee(id, name, salary);

                    stack.push(emp);
                }
                break;

            case 4:
                if (stack == null) {
                    System.out.println("NO stack chosen !!!");
                } else {

                    Employee emp = stack.pop();

                    if (emp != null) {
                        System.out.println("Popped Employee: " + emp);
                    }
                }
                break;

            case 5:
                System.out.println("Thank you !!!");
                break;

            default:
                System.out.println("Invalid choice !!!");
            }

        } while (choice != 5);

        sc.close();
    }
}

