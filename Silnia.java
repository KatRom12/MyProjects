import java.util.Scanner;

public class Silnia{
	public static void main (String[] args){
		
		System.out.println("Podaj liczbe: ");
		
		int numb = getInt();
		
		
		if (numb < 0) {
			System.out.println("Nie mozna policzyc silni z liczby ujemnej");
		} else if (numb >= 0) {
			int silnia = 1;
			for (int i = 1; i<= numb; i++){
				silnia *= i;
			}
			System.out.println(numb + "! = " + silnia);
		}
		
	}
	
	public static int getInt (){
		return new Scanner(System.in).nextInt();
	}	
}	