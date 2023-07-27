package root;

public class Clients extends Order {
	int clientId;
	String clientName;

//	boolean registration;
	public Clients(int clientId, String clientName, int orderAmount) {
		super(orderAmount);

	}

	@Override
	public double billCalculation() {
		// TODO Auto-generated method stub
		double shirtPrice = 200.0;
		double tax = 5.0;
		double bill, total;

		bill = shirtPrice * getOrderAmount();
		total =bill + ((tax * bill) / 100);
	
		return total;
	}

	@Override
	public void addDiscount() {
		// TODO Auto-generated method stub
	
	}
	

	
	

}
