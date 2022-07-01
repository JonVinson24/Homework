
public class weekOneLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//plane seats still available
		int planeSeatsAvailable = 35;
		//cost of groceries at checkout
		double costOfGroceries = 132.23;
		//persons middle initial
		char middleInitial = 'W';
		//create a variable to hold true if hot outside and false if cold outside
		boolean outsideTemperature = true;
		//create a variable to hold a customers first name
		String firstName = "Spongebob";
		// variable to hold a street address
		String streetAddress = "1234 123 Street E";
		
	
		System.out.println("The number of seats remaining on the plane is: " + planeSeatsAvailable);
		System.out.println(costOfGroceries + " is the total cost of groceries.");
		System.out.println("The persons middle initial is " + middleInitial);
		System.out.println("it is hot outside- " + outsideTemperature);
		System.out.println("The persons first name is: " + firstName);
		System.out.println("The address is " + streetAddress);
		
		//remove two seats from available plane seats
		
		planeSeatsAvailable = planeSeatsAvailable - 2;
		System.out.println(planeSeatsAvailable);
		//add 2.15 to the grocery total
		
		costOfGroceries = costOfGroceries + 2.15;
		System.out.println(costOfGroceries);
		
		//change the middle initial to something else
		
		middleInitial = 'V';
		System.out.println(middleInitial);
		
		//change the season varible to reflect the new opposite value
		outsideTemperature = ! outsideTemperature;
		System.out.println("it is hot outside- " + outsideTemperature);
		
		//create full name variable containing the customers first name, middle initial, and last name of your choice
		String fullName = firstName +" " + middleInitial + " Squarepants";
		System.out.println(fullName); 
		
		//print a line to the console that introduces the customer and says they live at the address variable
		
		System.out.println("This is out new customer " + fullName + " and they live at the address " + streetAddress);
		
		
	}

			
		
}

		

	

	

