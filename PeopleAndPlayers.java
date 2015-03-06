
  import javax.swing.JOptionPane;

  public class PeopleAndPlayers

  {
      public static void main(String[] args) 

      {
	int numPeople, groupSize, teamSize, numPlayers ;

	String peopleString = JOptionPane.showInputDialog("Enter the number of people: ");

	numPeople = Integer.parseInt(peopleString);

	String playerString = JOptionPane.showInputDialog("Enter the number of players: ");

	numPlayers = Integer.parseInt(playerString);
 
	if (numPeople > 10){ 

	 groupSize =  numPeople/2;

	 JOptionPane.showMessageDialog(null,"The total number of people is " + numPeople +

	"\nThere are " + groupSize + " people in each group");	

	 }

	else {
	 }

	    if (((3 <=numPeople) && (numPeople <=10))) { 
	    groupSize = numPeople/3;
	    JOptionPane.showMessageDialog(null,"The total number of people is " + numPeople + 
																    "\nThere are " + groupSize + " poeple in each group");
																      }	
		 else {
		 }

			if ((numPeople < 3)) {
		        JOptionPane.showMessageDialog(null,"The number of people has to be at least 3");
			 }

				 if ((11<=numPlayers) && (numPlayers<=55)){
				 teamSize = numPlayers/11;
	                         JOptionPane.showMessageDialog(null,"There are " + numPlayers + " players."
	                         + "\nThe number of players in your team is " + teamSize);
				  }

	  if (!((11<=numPlayers) && (numPlayers<=55))){
																  teamSize = 1;
																 JOptionPane.showMessageDialog(null,"The number of players in your team is 1" );
																 }
													       
	       else {  JOptionPane.showMessageDialog(null,"There are " +

	      numPlayers + " players. "	+ "\nThe number of players in your team is 1" );
	      
	      }
				
	}

  }

																																				
																												




						
