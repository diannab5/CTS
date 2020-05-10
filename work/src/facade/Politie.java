package facade;

public class Politie {
	public static boolean esteUrmarit(String CNP){
        return Integer.parseInt(String.valueOf(CNP.charAt(CNP.length()-1)))%2==1;
    }
	
	public static boolean esteUrmarita(String CNP) {
		return (CNP.charAt(12)%2==0);
	}
}
