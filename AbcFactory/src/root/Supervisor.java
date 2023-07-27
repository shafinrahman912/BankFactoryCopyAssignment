package root;

public class Supervisor extends registeredClients {

	int supervisorId;
	String supervisorName;
	
	

	public Supervisor(int clientId, String clientName, int orderAmount, int supervisorId, String supervisorName) {
		super(clientId, clientName, orderAmount);
		
		this.supervisorId = supervisorId;
		this.supervisorName = supervisorName;
	}

	public void addDiscount() {
		// TODO Auto-generated method stub
		if (getOrderAmount()> 10000) {
			double discountBill=(billCalculation()*10)/100;
		
			System.out.println("Bill After Discount: "+(billCalculation()-discountBill));
		}
		else
			System.out.println("No discount and Bill: "+billCalculation());
	}
	
	

}
