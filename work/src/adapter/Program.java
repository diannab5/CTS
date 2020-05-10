package adapter;

import adapter.framework_achizitionat.CreditLeasing;

public class Program {

	
	public static void detaliiCredit(ICredit credit,int numarLuni) {
		credit.ofertaCredit();
		System.out.println("rata lunara"+credit.rataLunara());
	}
	public static void main(String[] args) {
		CreditNevoi creditPersonal=new CreditNevoi(12,2000);
		detaliiCredit(creditPersonal,12);
        
        CreditLeasing creditLeasing=new CreditLeasing(1600,6);
        AdapterCredit adapterCredit = new AdapterCredit(creditLeasing);
        detaliiCredit(adapterCredit,12);
	
        AdapterCreditClase adapterClase = new AdapterCreditClase(3000,12);
        detaliiCredit(adapterClase,12);
	}

}
