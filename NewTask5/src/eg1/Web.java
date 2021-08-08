package eg1;

public class Web {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String web1 = " https://en.wikipedia.org/wiki/Main_page";
		
		System.out.println(WebSecure(web1));
		
	}
	public static boolean WebSecure(String s){
		boolean b=true;
		if(s.startsWith("http"))
		{
			b = false;
		}
		return b;

	}

}
