package day7;
class Employee
{
	int id;
	String name;
	Address address;
	
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void displayEmployeeInfo()
	{
		System.out.println("id"+id);
		System.out.println("name"+name);
		System.out.println("DoorNo"+address.doorNo);
		System.out.println("Street name"+address.streetName);
	}
	
}
class Address{
	int doorNo;
	String streetName;
	String city;
	public Address(int doorNo, String streetName, String city) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.city = city;
	}
	
}

class HasA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ad= new Address(21,"Btm","Bangalore");
		Employee emp=new Employee(1,"Rahul",ad);
		emp.displayEmployeeInfo();
	}

}
