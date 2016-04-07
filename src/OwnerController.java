import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class OwnerController {
	@FXML private TextField nameField;
	@FXML private TextField addressField;
	@FXML private TextField zipCodeField;
	@FXML private TextField phoneNumberField; 
	@FXML private TextField cityField;
	@FXML private TextField stateField; 
	@FXML private TextField emailAddressField;
	
	@FXML 
	public void handleSubmitButton(ActionEvent ae){
		Owner owner = new Owner();
		
		owner.setName(nameField.getText());
		owner.setAddress(addressField.getText());
		owner.setZip(Integer.parseInt(zipCodeField.getText()));
		owner.setPhoneNumber(phoneNumberField.getText());
		owner.setCity(cityField.getText());
		owner.setState(stateField.getText());
		owner.setEmail(emailAddressField.getText());
		
		OwnerDatabase ownerDB = new OwnerDatabase(owner);
		ownerDB.insert();
		
	}
}
