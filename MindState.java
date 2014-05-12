package Cognition;

import java.util.ArrayList;

public class MindState
{

	private ArrayList <Integer> presenceScores;
	private ArrayList <Integer> acceptanceScores;
	private ArrayList <Double> overallScores;
	private ArrayList <String> dates;

	private double avgPScore;
	private double avgAScore;
	private double avgOScore;
	
	
	public MindState (){
		ArrayList <Integer> presenceScores = new ArrayList <Integer>();
		ArrayList <Integer> acceptanceScores = new ArrayList <Integer>();
		ArrayList <Double> overallScores = new ArrayList <Double>();
		ArrayList <String> dates = new ArrayList <String>();
	}
	
	public void addPresence (int newPresenceScore){
			presenceScores.add (newPresenceScore);
	}

	public ArrayList <Integer> getPresenceScores () {
		return presenceScores;
	}

	public void addAcceptance (int newAcceptanceScore){
			acceptanceScores.add (newAcceptanceScore);
	}

	public ArrayList <Integer> getAcceptanceScores () {
		return acceptanceScores;
	}

	public void addOverall (double newOverallScore) {
		overallScores.add (newOverallScore);
	}

	public ArrayList <Double> getOverallScores() {
		return overallScores;
	}

	
	
	public void setAvgPScore (ArrayList <Integer> presenceScores){
				double total = 0;   
		for (int i =0; i < presenceScores.size(); i++) {
			total = total + presenceScores.get(i);
		}
		avgPScore = (double) total/presenceScores.size();
	}

	public double getAvgPScore (){
		return avgPScore;
	}
	
	public void setAvgAScore (ArrayList <Integer> acceptanceScores){
		double avg = 0;
				double total = 0;   
		for (int i =0; i < acceptanceScores.size(); i++) {
			total = total + acceptanceScores.get(i);
		}
		avgAScore = (double) total/acceptanceScores.size();
	}

	public double getAvgAScore (){
		return avgAScore;
	}

	
	public void avgOScore (ArrayList <Double> overallScores){
				double total = 0;   
		for (int i =0; i < overallScores.size(); i++) {
			total = total + overallScores.get(i);
		}
		avgOScore = (double) total/overallScores.size();
	}

	public double getAvgOScore (){
		return avgOScore;
	}
		

}//end class

