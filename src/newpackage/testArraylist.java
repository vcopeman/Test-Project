package newpackage;

import java.util.ArrayList;

public class testArraylist {

	public static void main(String[] args) {
		
		ArrayList Guests = new ArrayList(); //class + variable
		
		Guests.add("John");
		Guests.add("Lucy");
		Guests.add("David");
		Guests.add("Mark");
		Guests.add("Lucinda");
		Guests.add("Ram");
		
		System.out.println(Guests.get(1)); //need to increment by 1 as starts from 0, shortcut syso ctrl spacebar
		
		Guests.remove(2); //index
		
		System.out.println(Guests.get(2));
		
		for(int i=0;i<Guests.size();i++) //change to number of elements in arraylist
		{
			System.out.println(Guests.get(i));
			
		}
		

	}

}
