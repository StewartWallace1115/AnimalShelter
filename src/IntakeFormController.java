/*
 * Name: Stewart Wallace
 * Date: 2/28/2016
 * Purpose: This class is the controller class for the intake form. This class 
 * creates either live stock or a pet class. This class then inserts the pet object into
 * either pet table or livestock table. This class also creates cagecard class and inserts it
 * into cagecard table.
 */

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class IntakeFormController {
	@FXML private TextField   nameField;
	@FXML private TextField   eyeColorField;
	@FXML private TextField   furColorField;
	@FXML private TextField	  animalTypeField;
	@FXML private TextField   animalBreedField;
	@FXML private TextField   heightField;
	@FXML private TextField   weightField;
	@FXML private TextField   ageField;
	@FXML private TextField   alteredField;
	@FXML private TextField   sexField;
	@FXML private TextField   cageCardNumberField;
	@FXML private TextField   vaccinationField;
	@FXML private TextField   microchipField;
	@FXML private RadioButton liveStockRadioButton;
	@FXML private RadioButton petRadioButton;
	CageCard cageCard;
	
	/*
	 * This method handles the submit button when it is clicked. 
	 */
	@FXML
	public void handleSumbitButton(ActionEvent ae){
		if(liveStockRadioButton.isSelected()){
			insertLiveStock();
			
		}else if(petRadioButton.isSelected()){
			insertPet();
		}
		
		createIntakeOwnerForm();
	}
	
	/*
	 * This method inserts a pet into the pet database. It also inserts a cagecard
	 * object into cagecard table.
	 */
	public void insertPet(){
		Pet pet = new Pet();
		cageCard = new CageCard();
		
		pet.setName(nameField.getText());
		pet.setEyeColor(eyeColorField.getText());
		pet.setHeight(heightField.getText());
		pet.setWeight(weightField.getText());
		pet.setAge(Integer.parseInt(ageField.getText()));
		pet.setSpayedNeutered(Boolean.parseBoolean(alteredField.getText()));
		pet.setAnimalBreed(animalBreedField.getText());
		pet.setAnimalType(animalTypeField.getText());
		pet.setFurColor(furColorField.getText());
		pet.setSex(sexField.getText());
		pet.setVaccinationsCurrent(Boolean.parseBoolean(vaccinationField.getText()));
		pet.setMicrochip(Boolean.parseBoolean(microchipField.getText()));
		cageCard.setCageNumber(Integer.parseInt(cageCardNumberField.getText()));
		
		PetDatabase petDB = new PetDatabase(pet, cageCard);
		petDB.insert();
	}
	
	public void insertLiveStock(){
		LiveStock liveStock = new LiveStock();
		liveStock.setName(nameField.getText());
		liveStock.setEyeColor(eyeColorField.getText());
		liveStock.setHeight(heightField.getText());
		liveStock.setWeight(weightField.getText());
		liveStock.setSex(sexField.getText());
		liveStock.setAnimalBreed(animalBreedField.getText());
		liveStock.setAnimalType(animalTypeField.getText());
		liveStock.setFurColor(furColorField.getText());
		liveStock.setAge(Integer.parseInt(ageField.getText()));
		liveStock.setVetNumber(Integer.parseInt(cageCardNumberField.getText()));
		
		LiveStockDatabase liveStockDB = new LiveStockDatabase(liveStock);
		liveStockDB.insert();
	}
	
	/*
	 * This method creates the IntakeOwnerForm gui. 
	 */
	public void createIntakeOwnerForm(){
		Stage ownerForm = new Stage();
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getClassLoader().getResource("IntakeOwnerFormGUI.fxml"));
			OwnerController ownerController = new OwnerController();
		
			ownerController.setPetIDNumber(cageCard.getPetID());
			Scene scene = new Scene (root, 740, 600);
			ownerForm.setScene(scene);
			ownerForm.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
