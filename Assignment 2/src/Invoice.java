
public class Invoice {
	   private String number;
	    private String description;
	    private int qty;
	    private double price;
	    public Invoice(String number, String description, int qty, double price) {
	    	this.number=number;
	    	this.description=description;
	    	if(qty>0) {
	    		this.qty=qty;
	    	}else {
	    		this.qty=0;
	    	}
	    	if(price>0) {
	    		this.price=price;
	    	}else {
	    		this.price=0.0;
	    	}
	    }

	public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public int getQty() {
			return qty;
		}

		public void setQty(int qty) {
//			this.qty = qty;
			  if (qty > 0)
		            this.qty = qty;
		        else
		            this.qty = 0;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
//			this.price = price;
			 if (price > 0)
		            this.price = price;
		        else
		            this.price = 0.0;
		}
		public double getprice() {
			return price;
		}

	public double getInvoiceAmount() {
		return qty*price;
	}

}
