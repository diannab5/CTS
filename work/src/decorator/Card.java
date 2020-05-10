package decorator;

public class Card implements ICard{

	//in cadrul acestei clase se implementeaza interfata 
	
	@Override
	public void efectuarePlataOnline() {
		System.out.println("A fost efectuata  o plata online!");
		
	}

	@Override
	public void efectuarePlataNormala() {
		System.out.println("A fost creata o plata normala!");
		
	}

}
