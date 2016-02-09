package vererbung;

public class Hase {
	
	private String name;

	public Hase(String name) {
		super();
		this.name = name;
	}

	public void schlafen() {
		System.out.println(name + " schläft");
	}

	
	public void hoppeln () {
		System.out.println(name + " schläft");
	}
}
