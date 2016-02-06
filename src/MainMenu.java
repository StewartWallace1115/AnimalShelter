/*
 * Name: Jordan Powell, Stewart Wallace
 * Date: 2/6/2016
 * email: 	swallace3644@g.fmarion.edu
 * 
 * Purpose: This class outputs a menu. This class is the main navigation for the 
 * software.
 * 
 * Needs: A GUI and the menu options to go somewhere. 
 */

import java.util.Scanner;

//import javafx.scene.layout.*;
public class MainMenu {
	private int userInput;
	
	
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
			case 3:  System.out.println("Animal reclaimation");
			         flag = false;
			default: System.out.println(userInput + " wasn't an option");
		}
	}
}
