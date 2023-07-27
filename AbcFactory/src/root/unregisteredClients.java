package root;

public class unregisteredClients extends Clients {

	public unregisteredClients(int clientId, String clientName, int orderAmount) {
		super(clientId, clientName, orderAmount);
		System.out.println("No Discount");
		// TODO Auto-generated constructor stub
	}

	public void totalBill() {
		System.out.println("No discount for unregistered clients and Bill: " + billCalculation());
	}

}
