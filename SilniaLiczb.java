import java.util.Scanner;

public class SilniaLiczb{
	public static void main (String[] args){
	
		int[] liczby = new int[5];
		
		for (int i = 0; i < liczby.length; i++){
			System.out.print("Podaj liczbe: ");
			liczby[i] = getInt();
		}

		for(int numb: liczby){
			if (numb < 0){
				System.out.println("Nie można policzyć silni!" + "Pomijam liczbę " + numb);
			} else {
				int silnia = 1;
				for (int i = 1; i <= numb; i++){
					silnia = silnia * i;
				}
				System.out.print(silnia + ", ");
			}
				
		}
		
		
	}
	
	public static int getInt(){
		return new Scanner(System.in).nextInt();
	}

}