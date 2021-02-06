package day7;
class Parent
{
	void property()
	{
		System.out.println("20 laks");
	}
	void marry()
	{
		System.out.println("you marry preethi");
	}
}
class child extends Parent
{
	//child class can give his own implementation.
	void marry()
	{
		System.out.println("i will marry kareena");
	}
	void Vehicle()
	{
		System.out.println("I have 20");
	}
}
class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*child c=new child();
		c.property();
		c.marry();
		c.Vehicle();*/
		Parent p=new child();// which one override that only it prints.
		p.property();
		p.marry();
		//p.Vehicle();
		
	}

}
