/**
  * Lab Ten
  * Scott Robertson
  **/

  import java.io.File;
import java.util.Scanner;
import java.util.Formatter;


public class MindWrite
{
 public static void main (String[] args) throws Exception{

	 String date = "5/5";
	 MindTrait traits = new MindTrait(date);
   Formatter writer = new Formatter("Scores.txt");

  
	String pS = "" + traits.getPresenceScore();
	 writer.format(pS);
	 
	
   writer.flush();
   writer.close();
    
   
	
	
	}//end main
} //end Formatter
