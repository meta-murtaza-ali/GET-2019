import java.util.ArrayList;

/**
 * define the cage class
 *
 */
public class Cage {
	public int count = 0;
	int Cagecapacity;
	public String animaltype;
	int cageId;
	int NoOfanimal;
	private ArrayList<Animal> animalList = new ArrayList<Animal>();

	/**
	 * @param capacity define the cage capacity
	 * @param name define the name of the cage
	 */
	public Cage(int capacity, String name) {
		count++;
		this.Cagecapacity = capacity;
		this.animaltype = name;
		this.cageId = count;
		this.NoOfanimal=0;
	}

	/**
	 * @return true when cage is full else return false
	 */
	public Boolean isFull() {
		if (Cagecapacity == NoOfanimal)
			return true;
		return false;
	}

	/**
	 * @param tobeAdded is the object of animal class
	 * @return true when is add in the cage
	 */
	public boolean addanimal(Animal tobeAdded) {
		if (Cagecapacity != NoOfanimal && animaltype == tobeAdded.getType()) {
			getAnimalList().add(tobeAdded);
			NoOfanimal++;
			return true;
		}
		return false;
	}

	/**
	 * @return animal list
	 */
	public ArrayList<Animal> getAnimalList() {
		return animalList;
	}

	/**
	 * @return animal type
	 */
	public String getAnimalType() {
		return animaltype;
	}

	/**
	 * @return the cage capacity
	 */
	public int getCapacity() {
		return Cagecapacity;
	}

	/**
	 * @return the number of animal
	 */
	public int getNoOfAnimal() {
		return NoOfanimal;
	}

}
