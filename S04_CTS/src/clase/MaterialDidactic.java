package clase;

public abstract class MaterialDidactic {
    private String nume;

    
	public MaterialDidactic(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}
	

	@Override
	public String toString() {
		return "MaterialDidactic [nume=" + nume + "]";
	}

	public abstract void getPret();
	
    
    
}
