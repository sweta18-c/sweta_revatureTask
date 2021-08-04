package eg2;

public class TrainTime {

	private int num;	
	private String code;	
	private String station;	
	private String Arrival;	
	private String Departure;
	
	public TrainTime(int num, String code, String station, String arrival, String departure) {		
		this.num = num;		
		this.code = code;		
		this.station = station;		
		Arrival = arrival;		
		Departure = departure;	
		}	
	public void printTiming() {				
		System.out.printf("%d %1s %17s %8s %11s\n", num,code,station,Arrival,Departure);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Yasvantpur Delhi Sarai Rohilla AC Duronto Express (12213)\r\n");		
		System.out.println("-----------------------------------------------");		
		System.out.println("#  code 	station      Arr.	 Dep.");		
		System.out.println("-----------------------------------------------");	
		TrainTime[] transactions = {				
				new TrainTime(1,"YPR","Yasvantpur Jn","11:00","23:40"),				
				new TrainTime(2,"GTL","Guntakal Jn","03:45","03:50"),				
				new TrainTime(3,"YPR","Sekandrabad Jn","08:55","9:00"),				
				new TrainTime(4,"YPR","Balharshah Jn","13:30","13:35"),			
				new TrainTime(5,"YPR","HabibGanj Jn","21:20","23:40"),				
		};
		for (TrainTime transaction : transactions) {
			transaction.printTiming();
		}
	}	

}
