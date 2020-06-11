package ClassesAndConstructors;

public class Runner {
	
	private int raceID;
	private String name;
	
	//default constructor
	public Runner() {
		// do nothing
	}
	
	//make the runner perform, return action of athelete
	public String performSport() {
		return "Running";
	}
	
	public String toString() {
		return String.format("%d is %s\n"
				, getRaceID()
				, getName()
				, performSport());
	}

	//getters and setters
	public int getRaceID() {
		return raceID;
	}

	public void setRaceID(int value) {
		this.raceID = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
