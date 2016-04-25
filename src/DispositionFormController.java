/*
 * Name:Stewart Wallace
 * Date: 3/27/2016 
 * email: swallace3644@g.fmarion.edu
 * Purpose: This class is the controller class for the disposition form gui.  
 * It takes information from the user and inserts it into owner table.
 * 
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

public class DispositionFormController{
	@FXML TextField   nameField;
	@FXML TextField   dateField;
	@FXML TextField   cityField;
	@FXML TextField   zipField;
	@FXML TextField   emailAddressField;
	@FXML TextField   addressField;
	@FXML TextField   phoneNumberField;
	@FXML RadioButton auctionRadio;
	@FXML RadioButton euthanizedRadio;
	@FXML RadioButton adoptedRadio;
	@FXML RadioButton reclaimRadio;
		  int		  petNumb;
		  FeesChargedForm feesForm;
		  
	@FXML
	public void handleSumbitButton(ActionEvent ae){
		if(auctionRadio.isSelected()){
			Owner owner = new Owner();
			
			owner.setName(nameField.getText());
			owner.setAddress(addressField.getText());
			owner.setZip(Integer.parseInt(zipField.getText()));
			owner.setPhoneNumber(phoneNumberField.getText());
			owner.setCity(cityField.getText());
			
			owner.setEmail(emailAddressField.getText());
			
			OwnerDatabase ownerDB = new OwnerDatabase(owner);
			feesForm.address = owner.getAddress();
			feesForm.city = owner.getCity();
			feesForm.email = owner.getEmail();
			feesForm.name = owner.getName();
			feesForm.zip = owner.getZip()+"";
			feesForm.phoneNumber = owner.getPhoneNumber();
			feesForm.state = owner.getState();
			ownerDB.insertReason("auction");
			feesForm.reason = "auction";
		}else if(euthanizedRadio.isSelected()){
			Owner owner = new Owner();
			
			owner.setName(nameField.getText());
			owner.setAddress(addressField.getText());
			owner.setZip(Integer.parseInt(zipField.getText()));
			owner.setPhoneNumber(phoneNumberField.getText());
			owner.setCity(cityField.getText());
			
			owner.setEmail(emailAddressField.getText());
			
			OwnerDatabase ownerDB = new OwnerDatabase(owner);
			feesForm.address = owner.getAddress();
			feesForm.city = owner.getCity();
			feesForm.email = owner.getEmail();
			feesForm.name = owner.getName();
			feesForm.zip = owner.getZip()+"";
			feesForm.phoneNumber = owner.getPhoneNumber();
			feesForm.state = owner.getState();
			ownerDB.insertReason("euthanized");
			feesForm.reason = "euthanized";
		}else if(adoptedRadio.isSelected()){
			Owner owner = new Owner();
			
			owner.setName(nameField.getText());
			owner.setAddress(addressField.getText());
			owner.setZip(Integer.parseInt(zipField.getText()));
			owner.setPhoneNumber(phoneNumberField.getText());
			owner.setCity(cityField.getText());
			
			owner.setEmail(emailAddressField.getText());
			
			OwnerDatabase ownerDB = new OwnerDatabase(owner);
			feesForm.address = owner.getAddress();
			feesForm.city = owner.getCity();
			feesForm.email = owner.getEmail();
			feesForm.name = owner.getName();
			feesForm.zip = owner.getZip()+"";
			feesForm.phoneNumber = owner.getPhoneNumber();
			feesForm.state = owner.getState();
			ownerDB.insertReason("adopted");
			feesForm.reason = "adopted";
		}else if(reclaimRadio.isSelected()){
			Owner owner = new Owner();
			
			owner.setName(nameField.getText());
			owner.setAddress(addressField.getText());
			owner.setZip(Integer.parseInt(zipField.getText()));
			owner.setPhoneNumber(phoneNumberField.getText());
			owner.setCity(cityField.getText());
			
			owner.setEmail(emailAddressField.getText());
			
			OwnerDatabase ownerDB = new OwnerDatabase(owner);
			
			feesForm.address = owner.getAddress();
			feesForm.city = owner.getCity();
			feesForm.email = owner.getEmail();
			feesForm.name = owner.getName();
			feesForm.zip = owner.getZip()+"";
			feesForm.phoneNumber = owner.getPhoneNumber();
			feesForm.state = owner.getState();
			
			ownerDB.insertReason("reclaim");
			feesForm.reason = "reclaim";
		}
		
		Stage countyForm = new Stage();
		Parent root;
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("CountyRegistrationGUI.fxml"));
			root = loader.load();
			CountyRegistrationController countyController = loader.getController();
			countyController.setFeesForm(feesForm);
			Scene scene = new Scene(root, 800,800);
			countyForm.setScene(scene);
			countyForm.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void setFeesChargedForm(FeesChargedForm feesForm){
		this.feesForm = feesForm;
	}
}
