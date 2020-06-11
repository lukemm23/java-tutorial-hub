package ClassesAndConstructors;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		Runner raceRunner;
		Swimmer raceSwimmer;
		
		boolean runRaceManager = true;
		
		while(runRaceManager) {
			
			int menuChoice = printMenu();
			switch(menuChoice) {
			case 1:
				System.out.println("you chose to create a new runner.");
				raceRunner = getNewRunner();
				System.out.println("you created the runner:" + raceRunner.toString());
				break;
			case 2:
				System.out.println("you chose to create a new swimmer.");
				raceSwimmer = getNewSwimmer();
				System.out.println("you created the swimmer:" + raceSwimmer.toString());
				break;
			case 3:
				System.out.println("thank you for using infinite skills race manager");
				runRaceManager = false;
				break;
			default:
				break;
			}
		}

	}
	
	public static int printMenu() {
	Scanner input = new Scanner(System.in);
	
	System.out.println("*****************************************");
	System.out.println("*Welcome to Infinite Skills Race Manager*");
	System.out.println("*****************************************");
	System.out.println("What would you like to do today?");
	System.out.println("-----------------------------------------");
	System.out.println("Enter 1 to add a new Runner");
	System.out.println("Enter 2 to add a new Swimmer");
	System.out.println("Enter 3 to quit");
	System.out.println("-----------------------------------------");
	System.out.println("*****************************************");
	
	int result = Integer.parseInt(input.nextLine());
	return result;
}
	
//	get a new runner from the user
	public static Runner getNewRunner() {
		Scanner input = new Scanner (System.in);
		Runner r = new Runner();
		System.out.println("Please enter the name of the runner.");
		r.setName(input.nextLine());
		System.out.println("Please enter the raceID of the runner");
		r.setRaceID(Integer.parseInt(input.nextLine()));
		return r;
	}
	// get a new swimmer from the user
	public static Swimmer getNewSwimmer() {
		Scanner input = new Scanner (System.in);
		Swimmer r = new Swimmer();
		System.out.println("Please enter the name of the swimmer.");
		r.setName(input.nextLine());
		System.out.println("Please enter the raceID of the swimmer");
		r.setRaceID(Integer.parseInt(input.nextLine()));
		return r;
	}

}
