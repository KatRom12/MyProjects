import java.util.Scanner;

public class ImiePole{
	public static void main (String[] args){
		System.out.println("Prosze podac imie:");
		String imie = getString();
		System.out.println("Witaj, " + imie + "!");
		
		System.out.println("Prosze podac promien kola:");
		int r = getInt();
		double pole = r*r*3.14;
		System.out.println("Pole kola o promieniu " + r + " wynosi: " + pole);
	}
	
	public static String getString() {
		return new Scanner(System.in).nextLine();
	}

	public static int getInt() {
		return new Scanner(System.in).nextInt();
	}	
}	