package Mypack;

public class Max {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7,8,9};
		int maxNo = arr[0];
		for(int i =1; i<=arr.length;i++) {
			try{
				if(arr[i]>maxNo) 
				{
					maxNo=arr[i];
				}
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("exception occurs ");
			}
			
		}
		System.out.println(maxNo);
	}

}
