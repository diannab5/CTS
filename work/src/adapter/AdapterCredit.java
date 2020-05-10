package adapter;

import adapter.framework_achizitionat.CreditLeasing;

//Adapter de obiecte 
//Aceasta clasa contine o instanta a clasei existente 
//si implementeaza interfata la care trebuie sa se faca adaptarea
public class AdapterCredit implements ICredit {

	 private CreditLeasing creditLeasing;
	
	 
	 public AdapterCredit(CreditLeasing creditLeasing) {
		super();
		this.creditLeasing = creditLeasing;
	}

	@Override
	public void ofertaCredit() {
		//prin intermediul instantei apelam metodele specifice clasei existente adica CreditNevoi
		creditLeasing.oferaLeasing(); 
		
	}

	@Override
	public float rataLunara() {
		return creditLeasing.calculSumaLunara();
	}

}
