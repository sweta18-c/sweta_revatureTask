package eg1;

public class Bus implements Comparable<Bus> {
		private int id;
		private String providerName;
		private double cost;
		private float rating;
		

		public Bus(int id, String providerName, double cost, float rating) {
			super();
			this.id = id;
			this.providerName = providerName;
			this.cost = cost;
			this.rating = rating;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getProviderName() {
			return providerName;
		}

		public void setProviderName(String providerName) {
			this.providerName = providerName;
		}

		public double getCost() {
			return cost;
		}

		public int getRating() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int compareTo(Bus o) {
			// TODO Auto-generated method stub
			return 0;
		}

}
