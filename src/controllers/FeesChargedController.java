/*
 * Name: Stewart Wallace
 * Date: 4/7/2016
 * email: swallace3644@g.fmarion.edu
 * Purpose: This class creates the FeesCharged receipt form. This class updates 
 * the receipt from the fees charge form. 
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class FeesChargedController {
	int totalFee;
	boolean catOrDogRecovery;
	boolean rabiesProof;
	boolean unaltered;
	boolean catOrDogAdoption;
	int days;
	int totalAnimals;
	
	@FXML Text ownerDogOrCatText;
	@FXML Text petLiveStockText;
	
	@FXML Text ownerTotal;
	
	@FXML Text amountPetText;
	@FXML Text adoptionTotalText;
	@FXML Text liveStockDaysText;
	@FXML Text liveStockAmountTex;
	@FXML Text liveStockSubTotalText;
	@FXML Text feesTotalText;
	
	
	@FXML Text ownerRabiesText;
	@FXML Text unalteredText;
	@FXML Text nameText;
	@FXML Text cityText;
	@FXML Text phoneText;
	@FXML Text addressText;
	@FXML Text stateText;
	@FXML Text zipText;
	@FXML Text emailText;
		  FeesChargedForm feesForm;
		  
	@FXML
	public void handlePrintButton(ActionEvent ae){
		if(feesForm.dogOrCat){
			PetDatabase petDB = new PetDatabase();
			petDB.deletePet(feesForm.animalID);
		}
	}
}
