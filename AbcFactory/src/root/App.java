package root;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		registeredClients client = new registeredClients(5, "shafin", 10001);
		Supervisor sp=new Supervisor(client.clientId,client.clientName,client.orderAmount,5,"abir");

		client.totalBill();
		sp.addDiscount();
		
	}

}
