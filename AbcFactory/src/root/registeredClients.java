package root;

public class registeredClients extends Clients  {

	public registeredClients(int clientId, String clientName, int orderAmount) {
		super(clientId, clientName, orderAmount);
		// TODO Auto-generated constructor stub
	}

	public void totalBill() {
		System.out.println("Bill Without Discount: " + billCalculation());
	}


}
