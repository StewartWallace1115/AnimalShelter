/*
 * Name: Stewart Wallace
 * Date: 2/6/2016
 * email: 	swallace3644@g.fmarion.edu
 * 
 * Purpose: This class outputs a menu. This class is the main navigation for the 
 * software.
 * 
 * Needs: A GUI and the menu options to go somewhere. Finish animalIntakeMenu() 
 * with animal class attributes. Add two more methods pet and livestock. Add 
 * conditional to animalIntakeMenu for either pet or liveStock leading to 
 * the correct method. 
 */

import java.util.Scanner;

//import javafx.scene.layout.*;
public class MainMenu {
	private int userInput;
	Pet pet = new Pet();
	AnimalIntakeForm intakeForm = new AnimalIntakeForm();
	
	MainMenu(){
		this.userInput = 0;
	}
	
	public void displayMenu(){
		System.out.println("1: Animal Diposition");
		System.out.println("2: Animal Intake");
		System.out.println("3: Animal Reclaimation");
		Scanner keyboard = new Scanner(System.in);
		userInput = keyboard.nextInt();
		menuSwitchOption();
		keyboard.close();
	}
	
	protected void menuSwitchOption(){
		boolean flag = true;
		while(flag)
		switch(userInput){
			case 1:  System.out.println("Animal diposition");
					
					 flag = false;
			case 2:  System.out.println("Animal intake");
					 flag = false;
					 animalIntakeMenu();
					 break;
			case 3:  System.out.println("Animal reclaimation");
			         flag = false;
			default: System.out.println(userInput + " wasn't an option");
		}
	}
	
	protected void animalIntakeMenu(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter owner, if known:");
		String ownerName = keyboard.nextLine();
		intakeForm.setOwner(ownerName);
		
		System.out.println("Enter where animal was located:");
		String location = keyboard.nextLine();
		intakeForm.setLocation(location);
		
		System.out.println("Enter animal's name, if known:");
		String name = keyboard.nextLine();
		pet.setName(name);
		
		System.out.println("Enter animal's height");
		String height = keyboard.nextLine();
		pet.setHeight(height);
		
		System.out.println("Enter animal's eye color");
		String eyeColor = keyboard.nextLine();
		pet.setEyeColor(eyeColor);
		
		System.out.println("Enter animal's sex");
		String sex = keyboard.nextLine();
		pet.setSex(sex);
		
		System.out.println("Enter animal's weight");
		String weight = keyboard.nextLine();
		pet.setWeight(weight);
		
		System.out.println("Enter type of animal, i.e cat, dog:");
		String animalType = keyboard.nextLine();
		pet.setAnimalType(animalType);
		
		System.out.println("Enter animal's breed:");
		String animalBreed = keyboard.nextLine();
		pet.setAnimalBreed(animalBreed);
		
		System.out.println("Is the animal spayed or neutered? True or false");
		boolean spayedNeutered = keyboard.nextBoolean();
		pet.setSpayedNeutered(spayedNeutered);
		
		PetDatabaseClass petdata = new PetDatabaseClass(pet);
		petdata.insert();

		keyboard.close();
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
