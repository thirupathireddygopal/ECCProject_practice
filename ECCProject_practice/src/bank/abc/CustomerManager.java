package bank.abc;

import java.util.ArrayList;

public class CustomerManager {
	private ArrayList<Customer> customersList = new ArrayList<Customer>();

	public int addCustomer(int id,String name,double balance) {
		Customer customer=new Customer();
		customersList.add(customer);
		return customer.getId();
	}
	
	public Customer displayCustomer(int id) {
		for(Customer cust : customersList) {
			if(cust.getId() == id)
			{
				return cust;
			}
		}
		return null;
	}
	
	public ArrayList<Customer> displayAllCustomersOne(){		
			return customersList;
		}
	
	public ArrayList<Customer> displayAllCustomersTwo(){		
		return customersList;
	}
	
	
	public double deposit(int id, double balance, boolean check) {
		for(Customer cust :customersList) {
			if(check){
			if(cust.getId()==id){
				return 1;
			}
			}else if(cust.getId()==id){
				cust.setBalance(cust.getBalance()+balance);
				return cust.getBalance();
			}		
		}
	return 0;
	}
	
	public double withdraw(int id , double withdraw, boolean check){
		for(Customer cust : customersList){
			if(check){
				if(cust.getId() == id){
					return 1;
				}				
			}
			else if(cust.getId() == id){
				cust.setBalance(cust.getBalance()-withdraw);
				return cust.getBalance();
			}
		}
		return 0;
	}
	
	public double transfer(int id ,int trid, double transfer, boolean check){
		double balance = 0;
		for(Customer cust :customersList){
			if(check){
				if(cust.getId() == id ){
					for(Customer cust1 : customersList){
						if(cust1.getId() == trid){
							return 1;
						}
					}					
				}
			}
			else{
				balance = withdraw(id, transfer, false);
				deposit(trid, transfer, false);
				return balance;
			}
		}
		return 0;
	}
}







