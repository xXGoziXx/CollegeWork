/**
 * This is a Dog Object class
 * 
 * @author Godstime Osarobo
 * @version 1.0 17/04/2015
 */
public class Dog
{
    // instance variables
    private String Breed;
	private String Colour;
	private String Owner;
	private String Chases;
    /**
     * Default Constructor for class Dog
     */
    public Dog()
    {
        // initialise attribute variables
        Breed = "Golden Retriever";
		Colour = "Golden Yellow";
		Owner = "Godstime Osarobo";
		Chases = "Cats";
    }
	
	/**
	 * General Constructor for class Dog
	 *
	 * Creates a new car with the details provided and assigns it a unique registration number
	 * @param Breed The breed of this dog
	 * @param Colour The colour of this dog
	 * @param Owner The person that owns this dog
	 * @param Chases What the dog chases
	 */
	public Dog(String Breed, String Colour, String Owner, String Chases){
		// initialise attributes variables
		this.Breed = Breed;
		this.Colour = Colour;
		this.Owner = Owner;
		this.Chases = Chases;
	}

    /**
     * The Breed of the dog
     * 
     * @param void
     * @return String
     */
    public String getBreed(){
		return Breed;
	}
	
	/**
     * The Colour of the dog
     * 
     * @param void
     * @return String
     */
	public String getColour(){
		return Colour;
	}
	
	/**
     * The Owner of the dog
     * 
     * @param void
     * @return String
     */
	public String getOwner(){
		return Owner;
	}
	
	/**
     * What the dog Chases
     * 
     * @param void
     * @return String
     */
	public String getChases(){
		return Chases;
	}
	
	/**
     * The Breed of the dog
     * 
     * @param String Breed
     * @return void
     */
	public void setBreed(String Breed){
		this.Breed = Breed;
	}
	
	/**
     * The Colour of the dog
     * 
     * @param String Colour
     * @return void
     */
	public void setColour(String Colour){
		this.Colour = Colour;
	}
	
	/**
     * The Owner of the dog
     * 
     * @param String Owner
     * @return void
     */
	public void setOwner(String Owner){
		this.Owner = Owner;
	}
	
	/**
     * What the dog Chases
     * 
     * @param String Chases
     * @return void
     */
	public void setChases(String Chases){
		this.Chases = Chases;
	}
	
	/**
	 * If the dog sees the Owner bark. If not growl.
	 *
	 * @param String The person the Dog sees
	 * @return void Print what you have to print :/
	 */
	public void see(String person){
		if(person.equalsIgnoreCase(getOwner())) {
			System.out.println("Woof Woof!");
		}
		else{
			System.out.println("Grrr...");
		}
	}
}
