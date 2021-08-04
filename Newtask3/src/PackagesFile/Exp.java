package PackagesFile;

public class Exp {

	public static void main(String[] args) {
		try{ 
			int arr[]= {12,13,14,15,16};
			System.out.println(arr[7]);
		}
		catch(Exception e) {
			System.out.println("exception occured");
		}
		finally {
			System.out.println("finally executed");
		}

	}

}
