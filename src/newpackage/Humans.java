package newpackage;

public class Humans {
	
	int age = 20; //properties, attributes, information
	String name = "John"; //properties
	
	public void walk() //method
	{
		System.out.println("Walking");
	}
	
	public void run() //method public means accessible by all classes, void means does not return anything
	{
		System.out.println("Running");
	}

	public static void main(String[] args) { //(execution method)
		
		Humans John = new Humans(); //compiler reserves this space
		
		// System.out.println(John.age); //called properties
		// System.out.println(John.name);
		
		// John.walk();
		
		/*
		 * The following is if else
		if(John.age<15)
		{
			System.out.println("child");
		}
		
		else if(John.age>15) //else more understandable to interpret 
		{
			System.out.println("adult");
		}*/
		
		// Loops, for loop, while never used, essential for selenium
		
		/*
		for(int i=1;i<=10;i++) //bbc example, number of links, dynamic
		{
			System.out.println(i);
		}*/
		
		//Decrement loop
		
		/*
		for(int i=10;i>=-1;i--) //bbc example, number of links, dynamic
		{
			System.out.println(i);
		}*/
		

		
		
	}
}
