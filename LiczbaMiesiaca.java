import java.util.Scanner;

public class LiczbaMiesiaca{
	public static void main (String[] args){
		int miesiac;
		
		System.out.println("Podaj numer miesiaca:");
		miesiac = getInt();
		
		switch (miesiac){
			case 1:
			  System.out.println("Styczen");
			  break;
			case 2:
			  System.out.println("Luty");
			  break;
			case 3:
			  System.out.println("Marzec");
			  break;
			case 4:
			  System.out.println("Kwiecien");
			  break;
			case 5:
			  System.out.println("Maj");
			  break;
			case 6:
			  System.out.println("Czerwiec");
			  break;
			case 7:
			  System.out.println("Lipiec");
			  break;
			case 8:
			  System.out.println("Sierpien");
			  break;
			case 9:
			  System.out.println("Wrzesien");
			  break;
			case 10:
			  System.out.println("Pazdziernik");
			  break;
			case 11:
			  System.out.println("Listopad");
			  break;
			case 12:
			  System.out.println("Grudzien");
			  break;
			default:
			  System.out.println("Nie ma takiego miesiaca!");			
		}
	}
	
	public static int getInt() {
		return new Scanner(System.in).nextInt();
	}
}