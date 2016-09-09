import java.util.Scanner;

public class Adventure {

	public static void main(String[] args) {

		String name;
		name = "";
		String inputParty, inputBikiniBash, inputCrossword, inputBikini, inputNaked, inputSnowsuit, partyWear, inputEnd;
		boolean party = false;
		boolean bikiniBash = false;
		boolean crossword = false;

		String inputContinue;
		boolean userContinue = true;

		// download scanner for user to be able to add input
		// get input from user
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome College Freshman! What is your name? (enter your name):" + name);
		name = input.nextLine();

		while (userContinue) {
			System.out.println("Do you want to PARTY Freshman? (y/n)");
			inputParty = input.nextLine();
			//inputParty is holding the answer space for y or n.   

			// testing if inputParty equals yes, then boolean party equals true.
			// If not already declared boolean party = false at the beginning.
			//boolean party = false initialized at the beginning of the code.  Use if statement to run loop options if user said yes, so must make and initialize boolean party = true since I said it was false earlier. 
			if (inputParty.equalsIgnoreCase("y")) {
				party = true;
			}

			// Use if statement to decide if going to Party

			if (party) {
				System.out.println("Do you want to attend a nice wholesome Bikini Party? (y/n)");
				inputBikiniBash = input.nextLine();

				if (inputBikiniBash.equalsIgnoreCase("y")) {
					bikiniBash = true;
				}

				//if user says y they want to go to bikiniBash then they are given 3 clothing options which will be in a switch
				//partyWear will hold bikini, naked or snowsuit answer
				if (bikiniBash) {
					System.out.println(
							"Well choosen grasshopper!!! What are you going to wear to said party? (Bikini/Naked/Snowsuit) ");
					partyWear = input.nextLine();

					//why is "bikini", etc is quotation marks?
					switch (partyWear) {
					case "bikini":
						System.out.println("Got drunk and you lost your bikini bottom. Run home!");
						break;
					case "naked":
						System.out.println("Why are you naked you FREAK! You are denied entry.");
						break;
					case "snowsuit":
						System.out.println("Really? GO HOME!!");
						break;
					}

					//if user answers no to attending bikiniBash user will then be asked if they want to attend a Crossword party
				} else {
					System.out.println("Your parents would love it you spent your Friday at a Crossword Party.  What say you? (y/n)");
					inputCrossword = input.nextLine();
					if (inputCrossword.equalsIgnoreCase("y")) {
						crossword = true;
					}
					
					if (crossword) {
						System.out.println("Seriously???");
					} else {
						System.out.println("Should have went to the Bikini Party!! Go Home.");
					}
				} 

				//if user says no to attending the party at the beginning of the loop then it will be false and get this answer.  This is the end of the while loop.
				} else {
				System.out.println("YOU ARE LAME!!!");
				
				
			}
			
			System.out.println("Do you want to play again? (y/n)");
			inputEnd=input.nextLine();
			
			//using variable values that were established in the first question where i asked the user their name. 
			if(inputEnd.equalsIgnoreCase("n")) {
				userContinue = false;
				System.out.println("Thanks for playing " + name);
			}

	

			

		}

	}

}
