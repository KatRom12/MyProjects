import java.util.Scanner;

public class SilniaII{
	public static void main (String[] args){
	
		int[] liczby = new int[5];
		
		
		
		for (int i = 0; i < liczby.length; i++){
			System.out.print("Podaj " + (i+1) + " liczbe: ");
			liczby[i] = getInt();
		}

		for (int i = 0; i < liczby.length; i++){
			
			if (liczby[i] < 0) {
				
				System.out.println(
				"Nie mozna policzyc silni! Pomijam liczbe."
				);
			} else {
				int silnia = 1;
				for (int j = 1; j <= liczby[i]; j++){
					silnia *= j;
				}
				System.out.println(liczby[i] + "! wynosi " + silnia);
			}	
		}
	}
	
	public static int getInt(){
		return new Scanner(System.in).nextInt();
	}

}