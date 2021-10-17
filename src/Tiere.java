
public class Tiere {
	
	String[] tierliste = new String[5];

	public Tiere() {
		System.out.println(3 + 5 * 2);
	}
	
	public void initTiere() {
		tierliste[0] = "Maus";
		tierliste[1] = "Katze";
		
	}
	
	public String[] getTiere() {
		return tierliste;
	}
}
