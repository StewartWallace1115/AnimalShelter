/*
 * Name: Stewart Wallace
 * Date: 3/28/2016
 * email: swallace3644@g.fmarion.edu
 * Purpose: This class creates the reclamation form gui. This class creates 
 * a fees form for the reclamation procedure. This class also creates the 
 * displayPetGUI.
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

public class ReclaimationFormController{
	@FXML TextField nameField;
	@FXML TextField idField;
	@FXML TextField dateField;
	@FXML TextField cageCardNumberField;
	@FXML TextField vetNumberField;
	@FXML RadioButton petRadioButton;
	@FXML RadioButton liveStockRadioButton;
		  Pet		  pet;
		  FeesChargedForm feesForm = new FeesChargedForm();
		  LiveStock   liveStock;
	@FXML 
	public void handleSumbitButton(ActionEvent ae){
		
		
		if(petRadioButton.isSelected()){
			ReclaimationDatabase reclaimationDB = new ReclaimationDatabase();
			
			if(!idField.equals("")){
				pet = reclaimationDB.searchIDPet(Integer.parseInt(idField.getText()));
				
			}
			feesForm.setDogOrCat(true);
			feesForm.setUnaltered(!pet.spayedNeutered);
			feesForm.setNoRabies(pet.vaccinationsCurrent);
		
		}else if(liveStockRadioButton.isSelected()){
			ReclaimationDatabase reclaimationDB = new ReclaimationDatabase();
			
			if(!idField.equals("")){
				liveStock = reclaimationDB.searchVetID(Integer.parseInt(idField.getText()));
				
			}
			feesForm.setDogOrCat(false);
			
			
		}
		
		Stage ownerForm = new Stage();
		Parent root;
		if (petRadioButton.isSelected()) {
			try {

				FXMLLoader loader = new FXMLLoader(getClass().getResource("DisplayPetGUI.fxml"));
				root = (Parent) loader.load();
				PetDisplayController displayController = loader.getController();

				Scene scene = new Scene(root);

				displayController.nameText.setText(pet.getName());
				displayController.eyeColorText.setText(pet.getEyeColor());

				displayController.ageText.setText(pet.getAge() + "");
				displayController.alteredText.setText(pet.spayedNeutered + "");
				displayController.breedText.setText(pet.getAnimalBreed());

				displayController.furColorText.setText(pet.getFurColor());
				displayController.heightText.setText(pet.getHeight());
				displayController.weightText.setText(pet.getWeight());
				displayController.microChipText.setText(pet.microchip + "");
				displayController.idNumberText.setText(idField.getText());

				displayController.setFeesChargedForm(feesForm);
				ownerForm.setScene(scene);
				ownerForm.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}else{
			try {

				FXMLLoader loader = new FXMLLoader(getClass().getResource("DisplayPetGUI.fxml"));
				root = (Parent) loader.load();
				PetDisplayController displayController = loader.getController();

				Scene scene = new Scene(root);

				displayController.nameText.setText(liveStock.getName());
				displayController.eyeColorText.setText(liveStock.getEyeColor());

				displayController.ageText.setText(liveStock.getAge() + "");
				displayController.breedText.setText(liveStock.getAnimalBreed());

				displayController.furColorText.setText(liveStock.getFurColor());
				displayController.heightText.setText(liveStock.getHeight());
				displayController.weightText.setText(liveStock.getWeight());
				displayController.idNumberText.setText(idField.getText());

				displayController.setFeesChargedForm(feesForm);
				ownerForm.setScene(scene);
				ownerForm.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
	
	
}
