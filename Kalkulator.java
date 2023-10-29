import java.util.Scanner;

public class Kalkulator{
	public static void main (String[] args){
		
		System.out.println("Podaj liczbe: ");
		int poprzedniWynik = getInt();
		
		String koniec;		
		boolean czyBlednaOperacja;
		
		do {
			int nowyWynik = 0;
			czyBlednaOperacja = false;
			
			System.out.println("Jakie dzialanie: (*  /  -  +) : ");
			String dzialanie = getString();
			
			System.out.println("Podaj druga liczbe: ");
			int two = getInt();
		
			switch (dzialanie) {
				case "+":
					nowyWynik = poprzedniWynik + two;
					break;
				case "-":
					nowyWynik = poprzedniWynik - two;
					break;
				case "*":
					nowyWynik = poprzedniWynik * two;
					break;
				case "/":
					if (two == 0){
						czyBlednaOperacja = true;
						System.out.println("Nie mozna dzielic przez 0!");
					} else {
						nowyWynik = poprzedniWynik / two;
					}	
					break;
				default:
					czyBlednaOperacja = true;
					System.out.println("Nieprawidlowa operacja.");
			}
			
			if (!czyBlednaOperacja){
				System.out.println(poprzedniWynik + " " + dzialanie + " " + two + " = " + nowyWynik);
				poprzedniWynik = nowyWynik;
			}
			
			System.out.print("Chcesz kontynuowac ? t/n  ");
			koniec = getString();
		} while (koniec.equals("t"));
	}
	
	public static int getInt (){
		return new Scanner(System.in).nextInt();
	}	
	
	public static String getString(){
		return new Scanner(System.in).next();
	}	
}	