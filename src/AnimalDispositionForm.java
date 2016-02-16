import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * Name: Jordan Powell, Stewart Wallace
 * email: swallace3644@g.fmarion.edu
 * 
 * Purpose:
 */
public class AnimalDispositionForm {
	Pet pet;
	private String name;
	private String exitReason;
	private String phoneNumber;
	private String date;
	
	AnimalDispositionForm(){
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		date = dateFormat.format(cal.getTime());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExitReason() {
		return exitReason;
	}
	public void setExitReason(String exitReason) {
		this.exitReason = exitReason;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
