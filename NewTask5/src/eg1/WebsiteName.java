package eg1;
import java.util.Scanner;
public class WebsiteName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String url =s.nextLine();
		String urlSplit[]= url.split("/");
		 
		System.out.println(urlSplit[2]); 
		
		s.close();
	}

}
