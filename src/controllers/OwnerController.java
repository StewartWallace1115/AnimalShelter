import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class OwnerController {
	@FXML private TextField nameField;
	@FXML private TextField addressField;
	@FXML private TextField zipCodeField;
	@FXML private TextField phoneNumberField; 
	@FXML private TextField cityField;
	@FXML private TextField stateField; 
	@FXML private TextField emailAddressField;
	CageCard cageCard;
	private int petidNumber;
	
	@FXML 
	public void handleSubmitButton(ActionEvent ae){
		Owner owner = new Owner();
		System.out.println(petidNumber);
		owner.setName(nameField.getText());
		owner.setAddress(addressField.getText());
		owner.setZip(Integer.parseInt(zipCodeField.getText()));
		owner.setPhoneNumber(phoneNumberField.getText());
		owner.setCity(cityField.getText());
		owner.setState(stateField.getText());
		owner.setEmail(emailAddressField.getText());
		
		OwnerDatabase ownerDB = new OwnerDatabase(owner);
		ownerDB.insert();
		
		Stage ownerForm = new Stage();
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getClassLoader().getResource("IncidentReportFormGUI.fxml"));
			IncidentReportFormController incidentController = new IncidentReportFormController();
			
			incidentController.setpetID(petidNumber);
			Scene scene = new Scene (root, 740, 600);
			ownerForm.setScene(scene);
			ownerForm.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void setCageCard(CageCard cageCard){
		this.cageCard = cageCard;
	}
	
	public void setPetIDNumber(int petIdNumber){
		this.petidNumber = petIdNumber;
	}
	
}
