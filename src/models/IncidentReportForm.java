/*
 * Name:  Jordan Powell
 * Date:  2/25/2016
 * email: Jordan Powell   - jpowell3617@g.fmarion.edu
 * 
 * Purpose: The purpose of this class is to create and store information for 
 * 			animal incident reports for the animal shelter. 
 */

import java.util.Date;

public class IncidentReportForm {
	private String ACOBadgeNumber;
	private int intakeNumber;
	private Date date;
	private Date time;
	private String weatherCondition;
	private String additionalInformation;
	
	public String getACOBadgeNumber() 
	{
		return ACOBadgeNumber;
	}
	public void setACOBadgeNumber(String aCOBadgeNumber) 
	{
		ACOBadgeNumber = aCOBadgeNumber;
	}
	public int getIntakeNumber()
	{
		return intakeNumber;
	}
	public void setIntakeNumber(int intakeNumber) 
	{
		this.intakeNumber = intakeNumber;
	}
	public Date getDate()
	{
		return date;
	}
	public void setDate(Date date) 
	{
		this.date = date;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time)
	{
		this.time = time;
	}
	public String getWeatherCondition()
	{
		return weatherCondition;
	}
	public void setWeatherCondition(String weatherCondition)
	{
		this.weatherCondition = weatherCondition;
	}
	public String getAdditionalInformation()
	{
		return additionalInformation;
	}
	public void setAdditionalInformation(String additionalInformation) 
	{
		this.additionalInformation = additionalInformation;
	}
}
