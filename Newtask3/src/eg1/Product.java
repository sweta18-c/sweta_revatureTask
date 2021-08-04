package eg1;
import java.util.Collections;
import java.util.ArrayList;
class Product implements Comparable<Product> {
	int id;
	String name;
	int cost ;
	int rating ;
	int quantity;
	Product(int id,String name,int cost ,int rating ,int quantity){
		this.id=id;
		this.name=name;
		this.cost =cost;
		this.rating =rating;
		this.quantity = quantity;
		
	}
	public int compareTo(Product p) {
		if(id == p.id) {
			return 0;
		}else {
			if(id> p.id) {
				return 1;
			}
			else
			{
				return -1;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> al=new ArrayList<Product>();  
		al.add(new 	Product(101,"fogg", 800 , 4 ,1));  
		al.add(new Product(106,"Wild Stone", 600 , 4, 2));  
		al.add(new Product(105,"Park Avenue" , 700 , 5, 3));  
		  
		Collections.sort(al);  
		for(Product p:al){  
		System.out.println(p.id +" "+p.name +" " + p.cost +" "+  p.rating + " "+ p.quantity);  
		}  

	}

}
