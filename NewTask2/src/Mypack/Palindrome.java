package Mypack;
import java.lang.*;
public class Palindrome {

	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<ar.length;i++) {
			if(isPalindrome(ar[i])) {
				System.out.println(ar[i]);
			}
		}
	}
	public static boolean isPalindrome(int n) {
		int r=0,n1,n2;
		n2= n;
		while(n2!=0) {
			n1=n2%10;
			r=r*10+n1;
			n2=n2/10;
		}
		if(n==r)
			return true;
		else
			return false;
	}

}
