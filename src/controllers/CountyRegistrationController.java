/*
 * Name: Stewart Wallace
 * Date: 4/2/2016
 * email: swallace3644@g.fmarion.edu
 * Purpose: This class controls the GUI for the county registration form. It also calls the fees form GUI.
 */

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CountyRegistrationController{
	@FXML TextField   vetIDText;
	@FXML TextField   vaccinationsText;
	@FXML TextField   vaccinationsDateText;
	@FXML TextField   certifiedText;
	@FXML RadioButton catRadio;
	@FXML RadioButton dogRadio;
	      int 		  animalID;
	      boolean 	  isPet;
	      FeesChargedForm feesForm;
	@FXML 
	public void handleSumbitButton(ActionEvent ae) throws ParseException{
		CountyRegistrationForm countyRegistrationForm = new CountyRegistrationForm();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		countyRegistrationForm.setVetID(Integer.parseInt(vetIDText.getText()));
		countyRegistrationForm.setVaccinationsDate(formatter.parse(vaccinationsDateText.getText()));
		
		Stage ownerForm = new Stage();
		Parent root;
		try {
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("FeesFormGUI.fxml"));
			root = (Parent)loader.load();
			FeesChargedController  displayController = loader.getController();
			
			
            
            
            Scene scene = new Scene(root);
            ownerForm.setScene(scene);
			ownerForm.show();
            
			displayController.addressText.setText(feesForm.address);
			displayController.emailText.setText(feesForm.email);
			displayController.zipText.setText(feesForm.zip);
			displayController.stateText.setText(feesForm.state);
			displayController.phoneText.setText(feesForm.phoneNumber);
			displayController.nameText.setText(feesForm.name);
			displayController.cityText.setText(feesForm.city);
			
			if(feesForm.dogOrCat)
				displayController.ownerDogOrCatText.setText("$25");
			
			if(feesForm.noRabies && feesForm.reason.equals("reclaim")){
				displayController.ownerRabiesText.setText("$10");
			}
			
			if(!feesForm.unaltered && feesForm.reason.equals("reclaim")){
			
				displayController.unalteredText.setText("$10");
			}
			
			displayController.ownerTotal.setText(feesForm.calculateRecoveryFee()+"");
			displayController.liveStockSubTotalText.setText(feesForm.calculateLiveStockRecoveryFee()+"");
			displayController.adoptionTotalText.setText(feesForm.calculateAdoptionFee()+"");
			displayController.feesTotalText.setText(feesForm.getTotal()+"");
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setFeesForm(FeesChargedForm feesForm){
		this.feesForm = feesForm;
	}
}
