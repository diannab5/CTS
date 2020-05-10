package adapter;

import adapter.framework_achizitionat.CreditLeasing;

//Mosteneste clasa existenta si implementeaza interfata la care 
//trebuie sa se faca adaptarea
//Prin implementarea interfetei se asigura implementarea unui set de metode
//aceste metode fac apeluri la metodele specifice clasei existente prin intermediul parintelui (super)
public class AdapterCreditClase extends CreditLeasing implements ICredit {

	
	public AdapterCreditClase(float pretProdus, int nrLuniRestituire) {
		super(pretProdus, nrLuniRestituire);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ofertaCredit() {
	  super.oferaLeasing();
		
	}

	@Override
	public float rataLunara() {
		return super.calculSumaLunara();
	}

}
