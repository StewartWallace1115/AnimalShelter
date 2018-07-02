/*
 * Name: Stewart Wallace
 * Date: 2/27/2016
 * email: swallace3644@g.fmarion.edu
 * purpose: This class is the controller class for the disposition form gui. 
 * This class sends either the petid or cage card number to the disposition database
 * to be searched.
 */

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DispositionSearchController {
	@FXML private TextField idNumberField;
	@FXML private TextField cageNumberField;
		  private int petCageNumber;
		  private Pet pet;
		  private int idNumb;
		  
	@FXML
	public void handleButtonClick(ActionEvent ae){
		String idNumber = idNumberField.getText();
		String cageNumber = cageNumberField.getText();
		
		if(idNumber.length() != 0){
			this.idNumb = Integer.parseInt(idNumber);
			
			DispositionSearchDatabase dispositionSearchDB = new DispositionSearchDatabase();
			pet = dispositionSearchDB.searchIDNumber(this.idNumb);
			this.petCageNumber = dispositionSearchDB.findCageNumber(this.idNumb);
			
		}else if(cageNumber.length() != 0){
			
		}else{
			
		}
		
		Stage ownerForm = new Stage();
		Parent root;
		try {
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("DisplayPetGUI.fxml"));
			root = (Parent)loader.load();
			PetDisplayController  displayController = loader.getController();
            displayController.setIdNumber(1324);
            
            Scene scene = new Scene(root);
			FeesChargedForm feesForm = new FeesChargedForm();
			feesForm.animalID = Integer.parseInt(idNumber);
            displayController.nameText.setText(pet.getName());
            displayController.eyeColorText.setText(pet.getEyeColor());
            displayController.setFeesChargedForm(feesForm);
            displayController.ageText.setText(pet.getAge() +"");
            displayController.alteredText.setText(pet.spayedNeutered+"");
            displayController.breedText.setText(pet.getAnimalBreed());
            String cageCardNumber = this.petCageNumber + "";
            displayController.cageCardNUmberText.setText(cageCardNumber);
            displayController.furColorText.setText(pet.getFurColor());
            displayController.heightText.setText(pet.getHeight());
            displayController.weightText.setText(pet.getWeight());
            displayController.microChipText.setText(pet.microchip+"");
            displayController.idNumberText.setText(idNumb +"");
            
            displayController.setIdNumber(idNumb);
            
			ownerForm.setScene(scene);
			ownerForm.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
