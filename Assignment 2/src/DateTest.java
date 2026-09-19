
public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date(9,14,2026);
		System.out.println("Date is");
		d.displayDate();
		
		System.out.println("Month:"+d.getMonth());
		System.out.println("Day:"+d.getDay());
		System.out.println("Year:"+d.getYear());
		
		System.out.println("After chnaging values using setters");
		d.setDay(10);
		d.setMonth(5);
		d.setYear(2026);
		d.displayDate();
	}

}
