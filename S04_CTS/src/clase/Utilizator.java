package clase;

import java.util.ArrayList;
import java.util.List;

public class Utilizator {
	private String username;
	private List<Double> medieMinutePerSesiune;
	private static int nrUtilizatori;
	private List<MaterialDidactic> materialeDidactice;

	public Utilizator(String identitate,List<MaterialDidactic> materialeDidactice, List<Double> minSesiuneZi) {
		super();
		this.username = identitate;
		this.medieMinutePerSesiune = new ArrayList<Double>();
		this.materialeDidactice=new ArrayList<MaterialDidactic>();
		nrUtilizatori++;
	
	}

	public Utilizator() {
		this.username="Cineva";
		this.medieMinutePerSesiune = new ArrayList<Double>();
		this.materialeDidactice=new ArrayList<MaterialDidactic>();
		nrUtilizatori++;
	}

	private void SesiuneMedieLucru() {
		double sum = 0;
		for (int i = 0; i < nrUtilizatori; i++) {
			//sum += nrSesiuniZi * medieMinutePerSesiune;
			
			
		}
		sum = sum / this.nrUtilizatori;
		System.out.println("Sesiunea de lucru a unui utilizator dureaza, in medie " + sum + " minute!");
	}

	@Override
	public String toString() {
		return "Utilizatorul :" + username  + "petrece "
				+ " sesiuni per zi, fiecare sesiune avand in medie " + medieMinutePerSesiune
				+ "minute, iar cea mai recenta alegere din wishlist este cartea: ";
	}

}
