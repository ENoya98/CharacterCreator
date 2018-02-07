import java.util.ArrayList;
import java.util.Random;

public class CharacterCreator {
	// Names of the Game of Thrones Houses in The North
	// Great House (House Stark) and the vassal houses
	// owing allegiance to House Stark
	// 
	public static final String HOUSE_STARK     = "House Stark";
	public static final String HOUSE_KARSTARK  = "House Karstark";
	public static final String HOUSE_TARLEY    = "House Tarley";
	public static final String HOUSE_FORRESTER = "House Forrester";
	public static final String HOUSE_MORLEY    = "House Moreley";
	public static final String HOUSE_MANDERLY  = "House Manderly";
	public static final String HOUSE_UMBER     = "House Umber";
	
	// Age of for characters in Game of Thrones based on 
	// medieval times average life span
	// Note: averages include a very skewed death rate for infants,
	// children under 5 (died at 30% - 50%) and women dying in
	// child birth (about 16%) 
	// Median age is as noted 
	// Standard deviation approximated to represent 70% of population
	// between ages MEDIAN_AGE - 10 (5) and MEDIAN_AGE + 10 (25)
	private static final int MINIMUM_AGE          =  0;
	private static final int AVERAGE_AGE_AT_DEATH = 32;
	private static final int MEDIAN_AGE           = (MINIMUM_AGE + AVERAGE_AGE_AT_DEATH)/2;
	private static final int STANDARD_DEVIATION   = 10;
	
	// Holds house names for randomly generating allegiance
	public  ArrayList<String> houses;

	// constuctor
	public CharacterCreator () {
		houses = new ArrayList<String> ();
		houses.add(HOUSE_STARK);
		houses.add(HOUSE_KARSTARK);
		houses.add(HOUSE_TARLEY);
		houses.add(HOUSE_FORRESTER);
		houses.add(HOUSE_MORLEY);
		houses.add(HOUSE_MANDERLY);
		houses.add(HOUSE_UMBER);
	}

	// Generate a new character unnamed character
	public Character newCharacter () {
		int gender        = generateGender();
		int age           = generateAge();
		String allegiance = generateAllegiance();
		return new Character (generateName(), gender, age, allegiance);
	}
	
	// Generate a new named character
	public Character newCharacter (String name) {
		Character character = newCharacter ();
		character.setName(name);
		return character;
	}
	
	// Generates a random integer evenly distributed in 
	// the specified range of minValue and maxValue
	private int randomValue (int minValue, int maxValue) {
	  int range = (maxValue - minValue) + 1;     
      return (int)(Math.random() * range);
	}
	
	// Generates an age for a character, using a gaussian 
	// distribution with median and standard distribution
	// as indicated
	private int generateAge () {
		Random randomGenerator = new Random();
		return (int) Math.abs(((randomGenerator.nextGaussian() * STANDARD_DEVIATION)
				+ MEDIAN_AGE)) ;
	}
	
	// Generates a gender for a character with equal likelihood
	// of being female or male -- may not represent a true 
	// distribution of medieval population
	private  int generateGender () {
		return randomValue (Character.MALE,
				Character.FEMALE);
	}
	
	// Generates an allegiance to one of the houses in The North
	// Equal likelihood for any allegiance
	private String generateAllegiance () {
		int houseIndex = randomValue(0, houses.size()-1);
		return houses.get(houseIndex);
	}
	
	//Name Generating code I found online :) added for fun
	//Source: http://www.java-gaming.org/index.php?topic=35802.0
	private static String[] Beginning = { "Kr", "Ca", "Ra", "Mrok", "Cru",
	         "Ray", "Bre", "Zed", "Drak", "Mor", "Jag", "Mer", "Jar", "Mjol",
	         "Zork", "Mad", "Cry", "Zur", "Creo", "Azak", "Azur", "Rei", "Cro",
	         "Mar", "Luk" };
	private static String[] End = { "d", "ed", "ark", "arc", "es", "er", "der",
	         "tron", "med", "ure", "zur", "cred", "mur" };
	   
	private static Random rand = new Random();

	public static String generateName() {
	    return Beginning[rand.nextInt(Beginning.length)] + End[rand.nextInt(End.length)];

	}

}