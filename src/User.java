/*
 * Name: Stewart Wallace
 * Date: 3/1/2016
 * Purpose: This class is a logical class for the users of the system.
 */
public class User {
	
	private String userName; 
	private String password;
	
	User(){
		
	}
	
	User(String userName, String password){
		this.userName = userName;
		this.password = password;
	}
	
	/*
	 * Returns usernmae as String.
	 */
	public String getUserName() {
		return userName;
	}
	
	/*
	 * Sets the userName. It accepts String as parameter.
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/*
	 * Returns password as a String.
	 */
	public String getPassword() {
		return password;
	}
	
	/*
	 * Sets the password. It accepts a String parameter. 
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
