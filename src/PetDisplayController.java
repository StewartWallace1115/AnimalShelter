/*
 * Name: Stewart Wallace
 * Date: 3/28/16
 * email: swallace3644@g.fmarion.edu
 * Purpose: This class creates the PetDisplayGUI. This class also creates
 * DispositionFormGUI when the button is clicked.
 */

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PetDisplayController {
		  private Pet pet;
		  private int cageCardNumber;
		  private int idNumber;
	@FXML Text nameText;
	@FXML Text eyeColorText;
	@FXML Text sexText;
	@FXML Text furColorText;
	@FXML Text typeText;
	@FXML Text breedText;
	@FXML Text heightText;
	@FXML Text weightText;
	@FXML Text ageText;
	@FXML Text alteredText;
	@FXML Text vaccinationText;
	@FXML Text microChipText;
	@FXML Text cageCardNUmberText;
	@FXML Text idNumberText;
	FeesChargedForm feesForm;
	
	@FXML
	public void handleButtonClick(ActionEvent ae){
		Stage ownerForm = new Stage();
		Parent root;
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("DispositionFormGUI.fxml"));
			root = (Parent) loader.load();
			DispositionFormController dispositionFormController = loader.getController();
			Scene ownerFormScene = new Scene(root,800,800);
			
			dispositionFormController.setFeesChargedForm(feesForm);
			ownerForm.setScene(ownerFormScene);
			ownerForm.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void displayPet(){
		nameText.setText(pet.getName());
		eyeColorText.setText(pet.getEyeColor());
		sexText.setText(pet.getSex());
		furColorText.setText(pet.getFurColor());
		typeText.setText(pet.getAnimalType());
		breedText.setText(pet.getAnimalBreed());
		heightText.setText(pet.getHeight());
		weightText.setText(pet.getWeight());
		ageText.setText(pet.getAge() + "");
		alteredText.setText(pet.isSpayedNeutered()+"");
		vaccinationText.setText(pet.isVaccinationsCurrent() + "");
		microChipText.setText(pet.haveMicrochip() +"");
		cageCardNUmberText.setText(cageCardNumber + "");
		idNumberText.setText(idNumber + "");
		
	}
	public void setPet(Pet pet){
		this.pet = pet;
	}
	
	public void setCageCardNumber(int cageCardNumber){
		this.cageCardNumber = cageCardNumber;
	}
	
	public void setIdNumber(int idNumber){
		this.idNumber = idNumber;
	}
	
	public void setFeesChargedForm(FeesChargedForm feesForm){
		this.feesForm = feesForm;
	}
}
