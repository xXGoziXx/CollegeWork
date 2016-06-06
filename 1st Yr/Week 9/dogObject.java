/**
 * This is an example of the use of the object Dog
 * 
 * @author Godstime Osarobo
 * @version 1.0 17/04/2015
 */
public class dogObject
{
	public static void main(String args[]){
		Dog[] kennel =  new Dog[5];
		Dog[] labraKennel = new Dog[5];
		Dog Charlie = new Dog("Bulldog", "Yellow and White", "Tommy Merlin", "Dogs");
		Dog Wolfie = new Dog("Wolf Hybrid", "Black and White", "John Diggle", "Birds");
		Dog Terry = new Dog("German Shepherd", "Black and Gold", "Oliver Queen", "Sheep");
		Dog Precious = new Dog("Poodle", "White", "Laurel Lance", "Nothing");
		Dog Alex = new Dog("Labradoodle", "Black", "Godstime Osarobo", "Cats");
		kennel[0] = Charlie;
		kennel[1] = Wolfie;
		kennel[2] = Terry;
		kennel[3] = Precious;
		kennel[4] = Alex;
		for(int i = 0;i<kennel.length; i++){
			if((kennel[i].getBreed()).equalsIgnoreCase("Labradoodle")){
				labraKennel[i] = kennel[i];
				System.out.println(kennel[i].getOwner() + ", your dog is a " + kennel[i].getBreed() + " and is therefore allowed in the Labrakennel.");
			}
			else {
				System.out.println(kennel[i].getOwner() + ", your dog is a " + kennel[i].getBreed() + " and is therefore NOT allowed in the Labrakennel... Sorry");
			}
		}
		Alex.see("Godstime Osarobo");
		
	}
}