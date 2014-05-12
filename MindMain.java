
import java.util.Formatter;
import java.util.ArrayList;
import java.util.Scanner;

public class MindMain
{
      public static void main( String[] argsv ) throws Exception
      {
      	  Scanner input = new Scanner (System.in);
					MindInstructions instruct = new MindInstructions();
					//MindFormat main = new MindFormat();
					
					String date = input.nextLine();
   				Formatter writer = new Formatter("Scores.txt");

					MindTrait traits = new MindTrait(date);
					traits.setDate (date);
					int newPresenceScore = 0;
					int newAcceptanceScore = 0;

					instruct.introduction();
					//1
					instruct.presentMoment();
					newPresenceScore = input.nextInt();
					traits.setPresenceScore(newPresenceScore);
					//2
					instruct.body();
					newPresenceScore = input.nextInt();
					traits.setPresenceScore(newPresenceScore);
					//3
					instruct.returnToPresent();
					newPresenceScore = input.nextInt();
					traits.setPresenceScore(newPresenceScore);
					//4
					instruct.selfAppreciate();
					newAcceptanceScore = input.nextInt();
					traits.setAcceptanceScore(newAcceptanceScore);
					//5
					instruct.intentions();
					newPresenceScore = input.nextInt();
					traits.setPresenceScore(newPresenceScore);	
					//6
					instruct.nonJudgement();
					newAcceptanceScore = input.nextInt();
					traits.setAcceptanceScore(newAcceptanceScore);
					//7
					instruct.connectionToPresent();
					newPresenceScore = input.nextInt();
					traits.setPresenceScore(newPresenceScore);
					//8
					instruct.acceptance();
					newAcceptanceScore = input.nextInt();
					traits.setAcceptanceScore(newAcceptanceScore);
					//9
					instruct.friendliness();
					newAcceptanceScore = input.nextInt();
					traits.setAcceptanceScore(newAcceptanceScore);
					//10
					instruct.watchfulness();
					newAcceptanceScore = input.nextInt();
					traits.setAcceptanceScore(newAcceptanceScore);
					//11
					instruct.nonReacting();
					newAcceptanceScore = input.nextInt();
					traits.setAcceptanceScore(newAcceptanceScore);
					//12
					instruct.innerPeace();
					newAcceptanceScore = input.nextInt();
					traits.setAcceptanceScore(newAcceptanceScore);
					//13
					instruct.patience();
					newAcceptanceScore = input.nextInt();
					traits.setAcceptanceScore(newAcceptanceScore);
					//14
					instruct.smile();
					newAcceptanceScore = input.nextInt();
					traits.setAcceptanceScore(newAcceptanceScore);
									



					System.out.println (traits.getPresenceScore());
					System.out.println (traits.getAcceptanceScore());

					writer.format (date);
					String pS = " Presence Score = " + traits.getPresenceScore();
	 				writer.format(pS);
					String aS = " Acceptance Score = " + traits.getAcceptanceScore();
					writer.format (aS);
					writer.flush();
				  writer.close();
					

					








      }









}
