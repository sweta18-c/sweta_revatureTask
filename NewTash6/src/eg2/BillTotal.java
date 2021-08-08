package eg2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BillTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Bill> Billtotal =new ArrayList<>();
		Billtotal.add(new Bill("apple",6 ,3));
		Billtotal.add(new Bill("mango",12 ,5));
		Billtotal.add(new Bill("banana",5 ,6));
		Billtotal.add(new Bill("strawberry", 12,3));
		Billtotal.add(new Bill("guava",6 ,3));
	System.out.println("        Item name     Price  Quantity   totalprice");
	for (Bill br : Billtotal) {
		br.printStream();
	}
	
	Integer total = Billtotal.stream().map(e->e.getPrice()).reduce(0,(sum,element)-> sum+element);
	
   }

}
