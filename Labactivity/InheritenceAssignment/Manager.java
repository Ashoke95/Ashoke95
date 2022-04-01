
public class Manager extends Employee{
	
	public Manager(long id, String Name, String address, long phone,double salary) {
	  super(id, Name, address, phone);
		
		this.employeeId=id;
		this.employeeName=Name;
		this.employeeaddress=address;
		this.employeephone=phone;
		this.basicsalary=salary;
	}

	public void calculateTransportAllowance() {
		double y=15 * basicsalary/100;
		System.out.println("TransportAllowance of Manager is :"+y);		
	}	
}
