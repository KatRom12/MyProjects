import java.util.Scanner;

public class ObwodTrojkatDane{
	public static void main (String[] args){
		System.out.println("Prosze podac dlugosc pierwszego boku:");
		int x = getInt();
		
		System.out.println("Prosze podac dlugosc drugiego boku:");
		int y = getInt();
		
		System.out.println("Prosze podac dlugosc trzeciego boku:");
		int z = getInt();
		
		int obwod = x+y+z;
		
		System.out.println("Obwod trojkata o podanych bokach wynosi: " + obwod);
	}
	

	public static int getInt() {
		return new Scanner(System.in).nextInt();
	}	
}	