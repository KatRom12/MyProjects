import java.util.Scanner;

public class SprawdzImie{
	public static void main (String[] args){
		String imie, mojeImie;
		
		mojeImie = "Kasia";
		System.out.println("Prosze podac imie:");
		imie = getString();
		
		if(imie.equals(mojeImie)){
		  System.out.println("Witaj, " + imie + ", mamy tak samo na imie");
		} else {
			System.out.println("Witaj, " + imie + ", ja jestem " + mojeImie);
		}	
		
		
	}
	
	public static String getString() {
		return new Scanner(System.in).nextLine();
	}

}	