class MethodOverloading {
	void displayInfo()
	{
		System.out.println("Zero parameter");
	}
	
	void displayInfo(String name)
	{
		System.out.println("Your name is"+name);
	}
	void displayInfo(String name,int id)
	{
		
		System.out.println("Your name is"+name);
		System.out.println("Your id is"+id);
	}

	void displayInfo(int id,String name)
	{
		
		System.out.println("Your id is"+id);
		System.out.println("Your name is"+name);
	}

	void displayInfo(int id)
	{
		 
		System.out.println("Your id is"+id);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj=new  MethodOverloading();
		obj.displayInfo("Moni",123s);
	}

}
