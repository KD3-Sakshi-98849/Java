import java.util.ArrayList;
//import java.util.List;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>List=new ArrayList<>();
		List.add("pink");
		List.add("white");
		List.add("Gray");
		List.add("Yellow");
	
		System.out.println("Before replacing:"+List);
		List.set(1,"Black");
		System.out.println("After replacing:"+List);
		

		
	}

}
