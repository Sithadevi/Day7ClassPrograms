package day7;
class Bank{
	void rateOfIntrest() {
		System.out.println("Two percent of intrest");
	}
	void minimumBalance()
	{
		System.out.println("Thousand Ruppes");
	}
}
class Axis extends Bank{
	void rateOfIntrest() {
		super.rateOfIntrest();
		System.out.println("Four percent of intrest");
	}
	
}
class Icic extends Bank{
	void rateOfIntrest() {
		System.out.println("Seven percent of intrest");
	}
	
}
class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank axis=new Axis();
		Bank icic=new Icic();
		axis.rateOfIntrest();
		axis.minimumBalance();
		icic.rateOfIntrest();
		icic.minimumBalance();
		
	}

}
