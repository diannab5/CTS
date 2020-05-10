package decorator;

public class DecoratorCardConcret extends DecoratorCardAbstract {

	//se implementeaza si metodele din decoratorul abstract 
	public DecoratorCardConcret(ICard cardAbstract) {
		super(cardAbstract);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void efectuarePlataContactless() {
		System.out.println("S-a efectuat plata contactless");
		
	}

}
