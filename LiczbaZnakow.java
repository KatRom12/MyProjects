import java.util.Scanner;

public class LiczbaZnakow{
	public static void main (String[] args){
		System.out.println("Prosze podac slowo:");
		String slowo = getString();
		
		System.out.println("To slowo ma " + slowo.length() + " znakow.");
	}
	
	public static String getString() {
		return new Scanner(System.in).nextLine();
	}
}