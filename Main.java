import java.util.ArrayList;

public class Main {

	public static void main (String args []) {
		
		final int LOWER_BOUND_AGE = 11;
		final int UPPER_BOUND_AGE = 26;
		
		// Create an ArrayList for Character instances and
		// Create an instance of CharacterCreator to generate
		// those instances
		ArrayList <Character> characters  = new ArrayList<Character> ();
		CharacterCreator characterCreator = new CharacterCreator();
	
		// Create 100 instances of Character, store them in
		// the ArrayList and print them out as they are created
		System.out.println("---------All Characters");
		for (int i=0; i<100; i++) {
		   Character character = characterCreator.newCharacter();
		   characters.add(character);
		   System.out.println(character);
		}
		
		// Find all Characters in the ArrayList that are between
		// the ages of LOWER_BOUND_AGE and UPPER_BOUND_AGE
		System.out.println();
		System.out.println("---------Characters Between the Ages of " +
		       LOWER_BOUND_AGE + " - " + UPPER_BOUND_AGE);
		int count = 0;
		for (int i=0; i<100; i++) {
			Character character = characters.get(i);
			if ((character.getAge() >=LOWER_BOUND_AGE) && (character.getAge() <= UPPER_BOUND_AGE)) {
				count++;
				System.out.println(character);
			}
		}
		System.out.println("---------Count of Characters: " + count);

		//
		// Find all Characters in the ArrayList that are FEMALE
		count = 0;
		System.out.println();
		System.out.println("---------Characters That Are Female "); 
		for (int i=0; i<100; i++) {
			Character character = characters.get(i);
			if(character.getGender() == 1)
			{
				System.out.println(character);
				count++;
			}
		}
		System.out.println("---------Count of Female Characters: " + count);
		
		//
		// Find all Characters in the ArrayList that are MALE
		count = 0;
		System.out.println();
		System.out.println("---------Characters That Are Male "); 
		for (int i=0; i<100; i++) {
			Character character = characters.get(i);
			if(character.getGender() == 0)
			{
				System.out.println(character);
				count++;
			}
		}
		System.out.println("---------Count of Male Characters: " + count);
		
		//
		// Find all Characters in the ArrayList that have allegiance HOUSE_STARK
		count = 0;
		System.out.println();
		System.out.println("---------Characters That Have Allegiance " + 
				CharacterCreator.HOUSE_STARK); 
		for (int i=0; i<100; i++) {
			Character character = characters.get(i);
			if(character.getAllegiance() == "House Stark")
			{
				System.out.println(character);
				count++;
			}
		}
		System.out.println("---------Count of " + CharacterCreator.HOUSE_STARK +
				" Characters: " + count);
	}
}