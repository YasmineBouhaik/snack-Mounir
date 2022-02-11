
public class Apprenant {
	
	private String firstname; 
	private String lastname;
	private int level; 
	private String promotion;
	
	public Apprenant(String Firstname, String Lastname, int Level, String Promotion) {
		this.firstname = Firstname;
		this.lastname = Lastname;
		this.level = Level;
		this.promotion = Promotion;
		
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		this.level = level;
		
	}
	


}
