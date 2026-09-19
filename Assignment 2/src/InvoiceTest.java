public class InvoiceTest{
	 public static void main(String[] args) {
		 Invoice i=new Invoice("101","laptop",2,5000);
		 System.out.println("Number:"+i.getNumber());
		 System.out.println("Description:"+i.getDescription());
		 System.out.println("Quantity:"+i.getQty());
		 System.out.println("Price:"+i. getPrice());
		 System.out.println("total Amount:"+i.getInvoiceAmount());
		 
		 i.setNumber("900");
		 i.setDescription("mobile");
		 i.setQty(9);
		 i.setPrice(1000);
		 
		 System.out.println("Number:"+i.getNumber());
		 System.out.println("Description:"+i.getDescription());
		 System.out.println("Quantity:"+i.getQty());
		 System.out.println("Price:"+i. getPrice());
		 System.out.println("total Amount:"+i.getInvoiceAmount());
		 
		 
	 }
}