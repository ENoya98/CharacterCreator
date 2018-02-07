
public class Character {

	public static final int MALE	= 0;
	public static final int FEMALE 	= 1;
	private String	name;
	private int age;
	private int gender;
	private String allegiance;
	
	public Character(){
		name = "";
		age = 18;
		gender = 0;
		allegiance = "House Stark";
	}

	public Character(String name, int gender, int age, String allegiance){
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.allegiance = allegiance;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getAllegiance() {
		return allegiance;
	}
	public void setAllegiance(String allegiance) {
		this.allegiance = allegiance;
	}
	
	private String mOrF(int gender){
		if(gender == FEMALE){
			return "Female";
		}
		else{
			return "Male";
		}
	}

	@Override
	public String toString() {
		return "Character [name=" + name + ", age=" + age + ", gender=" + mOrF(gender) + ", allegiance=" + allegiance + "]";
	}
	
}
