package eg2;

public class Bill implements Comparable<Bill> {
	private String ItemName ;
	private int Price ;
	private int Quantity;
	

	
	public Bill(String ItemName ,int Price ,int Quantity ) {
		super();
		this.ItemName =ItemName;
		this.Price = Price;
		this.Quantity = Quantity;
	}


	public String getItemName() {
		return ItemName;
	}


	public void setItemName(String itemName) {
		ItemName = itemName;
	}


	public int getPrice() {
		return Price;
	}


	public void setPrice(int price) {
		Price = price;
	}


	public int getQuantity() {
		return Quantity;
	}


	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	@Override
	public String toString() {
		return "Bus [itemname=" + ItemName + ", Price" + Price + ", amount=" + Quantity + ", linetotal=" + Price*Quantity + "]";
	}

	@Override
	public int compareTo(Bill o) {
		String i1=this.ItemName;
		String i2=o.ItemName;
		return i1.compareTo(i2);
	}
	public void printStream() {
		System.out.printf( "%18s %6d %5d %10d\n",ItemName, Price , Quantity ,  Price*Quantity);
	}
	

}
