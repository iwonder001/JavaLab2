import java.util.Scanner;

public class Adventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

			// testing if inputParty equals yes, then boolean party equals true.
			// If not all ready declared boolean party = false at the beginning.
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

				if (bikiniBash) {
					System.out.println(
							"Well choosen grasshopper!!! What are you going to wear to said party? (Bikini/Naked/Snowsuit) ");
					partyWear = input.nextLine();

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

				} else {
				System.out.println("YOU ARE LAME!!!");
				
				
			}
			
			System.out.println("Do you want to play again? (y/n)");
			inputEnd=input.nextLine();
			
			if(inputEnd.equalsIgnoreCase("n")) {
				userContinue = false;
				System.out.println("Thanks for playing " + name);
			}

	

			

		}

	}

}
