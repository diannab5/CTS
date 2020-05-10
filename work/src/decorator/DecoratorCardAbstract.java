package decorator;


//clasa abstracta care defineste decoratorul
//e implementeaza interfata care defineste familia de obiecte 
//si se creeaza o instanta de tipul acelei interfete
//Pentru metoda din interfata se furnizeaza o implementare si se adauga noi functii abstracte
public abstract class DecoratorCardAbstract implements ICard {

	@Override
	public void efectuarePlataOnline() {
		cardAbstract.efectuarePlataOnline();
		
	}

	@Override
	public void efectuarePlataNormala() {
		cardAbstract.efectuarePlataNormala();
		
	}
	
	ICard cardAbstract=null;

	public DecoratorCardAbstract(ICard cardAbstract) {
		super();
		this.cardAbstract = cardAbstract;
	}
	
	public abstract void efectuarePlataContactless();
	
	
}
