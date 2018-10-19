import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String manufacture;
		String model;
		double price;
		String carrier;
		String filler;
		boolean cont = true;
		
		while(cont) {
		
		System.out.println("Who made your phone?");
		manufacture = scn.nextLine();
		
		System.out.println("What model is your phone?");
		model = scn.nextLine();
		
		System.out.println("How much dose your phone cost?");
		price = scn.nextDouble();
		scn.nextLine();
		System.out.println("Who is your carrier?");
		carrier = scn.nextLine();
		
		MobilePhone phone = new MobilePhone(manufacture, model, price, carrier);
		
		System.out.println("What number would you like to call?");
		filler = scn.nextLine();
		
		System.out.println(phone.call(filler));
		
		System.out.println("What would you like to text?");
		filler = scn.nextLine();
		
		System.out.println(phone.text(filler));
		
		System.out.println(phone.toString());
		
		
		System.out.println("Would you like to make a new phone? 1 for yes or 2 for no");
		filler = scn.nextLine();
		if(filler == "1") {
			
		}
		else if(filler == "2") {
			cont = false;
		}
		else {
			System.out.println("Invalid awnser, assuming no.");
			cont = false;
		}
		}
		
		scn.close();
	}

}
