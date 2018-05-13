package bank.abc;
class Customer {
	private int id;
	private String name;
	private double balance;
	
	// default and parameterized constructor
	public Customer() {		
	}
	public Customer(int id,String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	// setters and getters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String firstName) {
		this.name = firstName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", balance=" + balance
				+ "]";
	}

}