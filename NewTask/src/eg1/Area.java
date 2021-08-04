package eg1;
import java.util.Scanner;
public class Area {
	static double areaofQuad(double l, double b) {
		return l*b;
	}
	static double areaofQuad(double s) {
		return s*s;
	}
	static double areaofQuad(double a, double b,double h) {
		return h/2 *(a+b);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s =sc.nextLine();
		
		
		double l =sc.nextDouble();
		double b =sc.nextDouble();
		double h =sc.nextDouble();
		System.out.println("area of rectangle :"  + areaofQuad(l,b));
		System.out.println("area of square :"  + areaofQuad(l));
		System.out.println("area of trapezium :"  + areaofQuad(l,b,h));

	}

}
