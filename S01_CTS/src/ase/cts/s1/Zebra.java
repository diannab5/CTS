package ase.cts.s1;

public class Zebra extends Animal {

	private String tipHrana;
	public Zebra(String name, String tipHrana) {
		super(name);
		this.tipHrana = tipHrana;
	}
	public String getTipHrana() {
		return tipHrana;
	}

}
