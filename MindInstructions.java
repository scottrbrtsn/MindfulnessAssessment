import java.util.ArrayList;
// from the Frieburg Mindfulness Inventory 

public class MindInstructions
{		
		public MindInstructions(){
				  System.out.println("Please enter today's date");
		}

		
		public void introduction(){
      		System.out.println("For the following questions");
      		System.out.println("Rate your experience from a 1-5");
      		System.out.println("1 = Rarely");
      		System.out.println("2 = Occasionally");
					System.out.println("3 = Fairly Often");
      		System.out.println("4 = Almost Always");
					System.out.println("5 = Always");
		}
//item 1    1,2,3,5,7 are presence items; rest are acceptance
		public void presentMoment(){
			 System.out.println("I am open to the experience of the present moment.");
		}
//item 2
		public void body(){
      System.out.println("I sense my body, whether eating, cooking, cleaning or talking");
    }
//item 3
    public void returnToPresent(){
	 		System.out.println("When I notice an absence of mind,");
	 		System.out.println("I gently return to the experience of the here and now.");
		}
//item 4
		public void selfAppreciate(){
     	System.out.println("I am able to appreciate myself.");
    }
//item 5
    public void intentions(){
   		System.out.println("I pay attention to what's behind my actions.");
   	}
//item 6
   	public void nonJudgement(){
      System.out.println("I see my mistakes and difficulties without judging them");
   	}
//item 7
 		public void connectionToPresent(){
      System.out.println("I feel connected to my experience in the here-and-now.");
   	}
//item 8
   	public void acceptance(){
     	System.out.println("I accept unpleasant experience");
   	}
//item 9
   	public void friendliness(){
     	System.out.println("I am friendly to myself when things go wrong");
   	}
//item 10
   	public void watchfulness(){
     	System.out.println("I watch my feelings without getting lost in them.");
   	}
//item 11
 		public void nonReacting(){
     	System.out.println("In difficult situations, I can pause without immediately reacting");
   	}
//item 12
 		public void innerPeace(){
     	System.out.println("I experience moments of inner peace and ease,");
     	System.out.println("even when things get hectic and stressful.");
   	}
//item 13
		public void patience(){
		  System.out.println("I am patient with myself and others.");
		}
//item 14
		public void smile(){
		  System.out.println("I am able to smile when");
		  System.out.println("I notice how I sometimes make life difficult.");
		}
			 
}
