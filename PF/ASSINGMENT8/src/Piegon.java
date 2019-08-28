/**
 * define the Piegon class
 *
 */
public  class Piegon extends Bird {

	/**
	 * @param name define the Piegon name
	 * @param age define the Piegon age
	 * @param animalWeight define the Piegon weight
	 */
	public Piegon(String name, int age, float animalWeight) {
		super(name, age, animalWeight);
		
	}

	/* (non-Javadoc)
	 * @see Bird#getType()
	 * return the Piegon name
	 */
	public String getType(){
		return "Piegon";
	}

	/* (non-Javadoc)
	 * @see Bird#getSound()
	 * return the Piegon sound
	 */
	public String getSound(){
		return "Chirp";
	}

	
}
