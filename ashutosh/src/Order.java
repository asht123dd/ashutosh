package shyam;

public class Order implements Deliverable{
	private int orderNo;		
	private String orderDate;		
	private int cost;			
	private String custName;		
	private String custAddress;		
	private int approxDistance;		

	public Order() {
		super();
	}

	public Order(int orderNo, String orderDate, int cost, String custName, String custAddress, int approxDistance) {
		super();
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.cost = cost;
		this.custName = custName;
		this.custAddress = custAddress;
		this.approxDistance = approxDistance;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public int getApproxDistance() {
		return approxDistance;
	}

	public void setApproxDistance(int approxDistance) {
		this.approxDistance = approxDistance;
	}

	@Override
	public boolean delivery() {
		// TODO Auto-generated method stub
		
		if(this.getApproxDistance()<delivery_limit){
			return true;
		}
		return false;
	}

}
