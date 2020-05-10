package facade;

public class ANAF {
	public static boolean areCreante(String CNP){
        return Integer.parseInt(String.valueOf(CNP.charAt(CNP.length()-1)))%2==1;
    }
	
	public static boolean areDatorii(String CNP) {
		//facem impartire si restul trebuie sa fie 0 ca sa nu aiba si rest daca are 
		return (CNP.charAt(12)%2==0);
	}
}
