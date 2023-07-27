package root;

public abstract class Order {
	
	int orderAmount;

	public Order(int orderAmount) {

		if (orderAmount > 5000) {
			this.orderAmount = orderAmount;
			System.out.println("Order confirm");
		} else
			System.out.println("Order not confirm");
	}
	

	public int getOrderAmount() {
		return orderAmount;
	}


	public abstract double billCalculation() ;
	public abstract void addDiscount() ;





}
