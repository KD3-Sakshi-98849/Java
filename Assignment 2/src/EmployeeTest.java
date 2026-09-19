
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee e1=new Employee("sakshi","patil",30000);
    Employee e2=new Employee("Sanika","bhosale",5000);
	System.out.println("Before 10% raise:");
	System.out.println(e1.getFirstName()+""+e1.getFirstName());
	System.out.println("yearly salary="+(e1.getSalary()*12));
	System.out.println();
	System.out.println(e2.getFirstName()+""+e2.getFirstName());
	System.out.println("Yearly Salary="+(e2.getSalary()*12));
	e1.setSalary(e1.getSalary() + e1.getSalary() * 0.10);
	e2.setSalary(e2.getSalary() + e2.getSalary() * 0.10);
	System.out.println("\nAfter 10% raise:");
	
	System.out.println(e1.getFirstName()+" "+e1.getLastName());
	System.out.println("yearly Salary="+(e1.getSalary()*12));
	System.out.println();

	System.out.println(e2.getFirstName() + " " + e2.getLastName());
	System.out.println("Yearly Salary = " + (e2.getSalary() * 12));
	
	}

}
