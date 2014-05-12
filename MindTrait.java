//package Cognition;

public class MindTrait
{
	private int presenceScore;
	private int acceptanceScore;
	private double overallScore;
	private String date;
	private int avgPresence;
	private int avgAcceptance;

	public MindTrait (String date){
		this.date = date;
		presenceScore = 0;
		acceptanceScore = 0;
		overallScore = 0;
	}
	
	public void setPresenceScore (int newPresenceScore){
		presenceScore =newPresenceScore + presenceScore;
		}

	public int getPresenceScore (){
		return presenceScore;
	}

	public void setAcceptanceScore (int newAcceptanceScore){
		acceptanceScore = acceptanceScore + newAcceptanceScore;
		}

	public int getAcceptanceScore (){
		return acceptanceScore;
	}

	
	public void setOverallScore (){
		avgPresence = presenceScore/5;
		avgAcceptance = acceptanceScore/9;
		overallScore = (avgPresence + avgAcceptance)/2;
	}

	public double getOverallScore (){
		return overallScore;
	}
	
	public void setDate (String newDate){
		date = newDate;
	}

	public String getDate () {
		return date;
	}
		

}//end class

