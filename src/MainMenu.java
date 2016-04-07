import java.util.Scanner;

/*
 * Name: Stewart Wallace
 * Date: 2/6/2016
 * email: 	swallace3644@g.fmarion.edu
 * 
 * Purpose: This class outputs a menu. This class is the main navigation for the 
 * software.
 *
 */


public class MainMenu {
	private int userInput;
	Pet pet = new Pet();
	AnimalIntakeForm intakeForm = new AnimalIntakeForm();
	
	MainMenu(){
		this.userInput = 0;
	}
	
	
	protected void menuSwitchOption(){
		boolean flag = true;
		while(flag)
		switch(userInput){
			case 1:  System.out.println("Animal diposition");
					
					 flag = false;
			case 2:  System.out.println("Animal intake");
					 flag = false;
					 break;
			case 3:  System.out.println("Animal reclaimation");
			         flag = false;
			default: System.out.println(userInput + " wasn't an option");
		}
	}

	
	public void dispositionSearchMenu(){
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("1: Animal ID number: ");
		System.out.println("2: Animal type:");
		System.out.println("3: Animal breed:");
		System.out.println("4: Animal type and animal breed:");
		System.out.println("5: Animal cage card number:");
		
		System.out.println("Enter your search method: ");
		int searchMethod = keyboard.nextInt();
		
		dispositionSearchSwitch(searchMethod);
		keyboard.close();
	}
	
	public void dispositionSearchSwitch(int userInput){
		boolean flag = true;
		while(flag){
			switch(userInput){
				case 1: System.out.println("Animal ID number:");
					    flag = false;
					    break;
				case 2: System.out.println("Animal type:");
						flag = false;
						break;
				case 3: System.out.println("Animal breed:");
						flag = false;
						break;
				case 4: System.out.println("Animal type and breed:");
						flag = false;
						break;
				case 5: System.out.println("Animal cage card number:");
						flag = false;
						break;
				default:System.out.println("Sorry that number is not a search option:");
						dispositionSearchMenu();
			}
		}
		
	}
}
