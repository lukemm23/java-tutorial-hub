package ClassesAndConstructors;

public class Swimmer {
	
	private int raceID;
	private String name;
	
	//default constructor
	public Swimmer() {
		// do nothing
	}
	
	//explicit constructor
	public Swimmer(int racerID, String swimmerName) {
		raceID =racerID;
		name = swimmerName;
	}
	
	//make the runner perform, return action of athelete
	public String performSport() {
		return "Swimming";
	}
	
//	toString() method representing state of the athlete
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
