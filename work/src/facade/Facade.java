package facade;


//clasa care ascunde complexitatea framework-ului
//clasa cuprinde metode care sa utilizeze metodele din clasele framework-ului
//ascunde complexitatea prin apelurile sale
//poate fi o unica instanta
public class Facade {
	public static boolean verificaPersoanaPentruCreareCont(Persoana persoana) {
		if(persoana.getVarsta()>=18) {
			if(Politie.esteUrmarita(persoana.getCNP())) {
				if(ANAF.areDatorii(persoana.getCNP())) {
					return true;
				}
			}
		}
		return false;
	}
}
