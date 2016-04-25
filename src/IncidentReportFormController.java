/*
 * Name: Stewart Wallace
 * Date: 3/30/2016
 * email: swallace3644@g.fmarion.edu
 * Purpose: This class acceepts input from the user and inserts it into 
 * the incidenet report table.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class IncidentReportFormController {
	@FXML private TextField intakeNumberField;
	@FXML private TextField dateField;
	@FXML private TextField weatherConditionField;
	@FXML private TextField ACOBadgeNumberField;
	@FXML private TextField timeField;
	@FXML private TextArea  additionalInformationArea;
	CageCard cageCard;
	private int cageCardNumber;
	private int petid;
	
	
	@FXML
	public void handleSubmitButton(ActionEvent ae) throws ParseException{
		cageCard = new CageCard();
		IncidentReportForm incidentReportForm = new IncidentReportForm();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy"); 
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");
		
		incidentReportForm.setACOBadgeNumber(ACOBadgeNumberField.getText());
		incidentReportForm.setIntakeNumber(Integer.parseInt(intakeNumberField.getText()));
		incidentReportForm.setDate(formatter.parse(dateField.getText()));
		incidentReportForm.setWeatherCondition(weatherConditionField.getText());
		incidentReportForm.setTime(time.parse(timeField.getText()));
		incidentReportForm.setAdditionalInformation(additionalInformationArea.getText());
		CageCardDatabase ccdb = new CageCardDatabase();
		petid = ccdb.getPetId();
		cageCardNumber = ccdb.getCageCardNumber();
		
		cageCard = new CageCard(incidentReportForm.getDate(),cageCardNumber , petid);
		
		CageCardDatabase cageCardDB = new CageCardDatabase(cageCard);
		cageCardDB.insert();
	}
	
	public void setpetID(int petid){
		this.petid = petid;
	}
	
	public void setCageCardNumber(int cageCardNumber){
		this.cageCardNumber = cageCardNumber;
	}
}
