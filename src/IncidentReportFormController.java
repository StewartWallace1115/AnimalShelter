import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
	
	@FXML
	public void handleSubmitButton(ActionEvent ae) throws ParseException{
		IncidentReportForm incidentReportForm = new IncidentReportForm();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy"); 
	
		incidentReportForm.setACOBadgeNumber(ACOBadgeNumberField.getText());
		incidentReportForm.setIntakeNumber(Integer.parseInt(intakeNumberField.getText()));
		incidentReportForm.setDate(formatter.parse(dateField.getText()));
		
		
	}
}
