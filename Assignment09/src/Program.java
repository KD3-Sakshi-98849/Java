import java.util.*;
class SortByRollno implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return Integer.compare(s1.getRollno(), s2.getRollno());
	}
}

class SortByName implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return s1.getName().compareTo(s2.getName());
	}
}
class SortByMarks implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return Integer.compare(s1.getMarks(), s2.getMarks());
	}
}

class Student{
	private String name;
	private int marks;
	private int rollno;
	
	public Student() {
		
	}
	public Student(String name,int marks,int rollno) {
		this.name=name;
		this.marks=marks;
		this.rollno=rollno;
				
	}
	//	@Override
//	public int hashCode() {
//		return Objects.hash(marks, name, rollno);
//	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return marks == other.marks && Objects.equals(name, other.name) && rollno == other.rollno;
	}
	public int getMarks() {
		return marks;
	}
	public String getName() {
		return name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
@Override
	public String toString() {
		return "[name:"+name+",marks:"+marks+",rollno="+rollno+"]";
	}	
}

public class Program  {
	public static Scanner sc=new Scanner(System.in);
	public static List<Student>list=new ArrayList<>();
	
//	public static Student[] getInstances() {
//		Student []arr=new Student[2];
//		
//		arr[0]=new Student("sakshi",90,1);
//		arr[1]=new Student("sanika",100,2);
////		arr[2]=new Student("sanvi",90,3);
//		return arr;
//	}
//	
	public static void addStudent() {
//		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=sc.next();
		
		System.out.println("Enter marks:");
		int marks=sc.nextInt();
		
		System.out.println("Enter rollno:");
		int rollno=sc.nextInt();
		
		Student s2=new Student(name,marks,rollno);
		
        list.add(s2);
		
	}
	public static void displayStudent() {

		Iterator<Student>itr=list.iterator();
		while(itr.hasNext()) {
			Student s=itr.next();
			System.out.println(s);
		}
	}
	
	public static void searchStudent() {
		System.out.println("Enter Rollno:");
		int rollno=sc.nextInt();
		boolean found=false;
		for(Student s:list) {
			if(s.getRollno()==rollno) {
				System.out.println("Found:");
				System.out.println(s);
				found =true;
				break;
			}
		}
		if(!found) {
			System.out.println("Student not found");
		}
		
	}
	
	public static void sortByRollno() {
		Collections.sort(list,new SortByRollno());
		System.out.println("Student sorted by rollno:");
		displayStudent() ;
		
	}
	public static void SortByName() {
		Collections.sort(list,new SortByName());
		System.out.println("Student sorted Name:");
		displayStudent();
	}
	public static void SortByMarks() {
		Collections.sort(list,new SortByMarks());
		System.out.println("Student sorte By Marks:");
		displayStudent();
	}
	
	public static int menulist() {
		System.out.println("1.Add student");
		System.out.println("2.Display Student student");
		System.out.println("3.Search Student on RollNo student");
		System.out.println("4.sort student on rollno");
		System.out.println("5.sort student on name");
		System.out.println("6.sort student on marks");
		
		System.out.println("Enter choice:");
		return sc.nextInt();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		do {
			choice=menulist();
			switch(choice) {
			case 1:
				addStudent();
				break;
			case 2:
				displayStudent();
				break;
			case 3:
				searchStudent();
				break;
			case 4:
				sortByRollno();
				break;
			case 5:
				SortByName();
				break;
			case 6:
				SortByMarks();
				break;
				
			}
				
				
			
		}
			while(choice!=0);
		sc.close();

	
	}

}

