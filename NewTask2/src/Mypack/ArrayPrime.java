package Mypack;

public class ArrayPrime {

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5,6,7,8,9};
		for(int i =0;i<=arr.length ;i++) 
		{
		 try {
			 if (primeNo(arr[i])) 
			  {
				System.out.println("is prime number :" + arr[i] +" ");
			  }
		    }
		 catch(ArrayIndexOutOfBoundsException e)
		 {
			System.out.println("exception occurs");
		 }
		} 
	}
	public static boolean primeNo(int x) 
	{
		boolean b =true;
			if(x==1 ||x==0) 
			{
			b= false;
		    }
		    else 
		    {
		    	for(int i=2;i<=x/2;i++) 
		    	{
		    		if(x%i ==0)
		    		{
		    			b=false;
		    			break;
		    		}
		    	}
		    }
		
	return b;
	}

}
