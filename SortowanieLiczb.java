import java.util.Scanner;

public class SortowanieLiczb{
	public static void main (String[] args){
	
		int[] liczby = new int[8];
		
		for (int i = 0; i < liczby.length; i++){
			System.out.print("Podaj liczbe: ");
			liczby[i] = getInt();
		}

		for (int i = 1; i < liczby.length; i++){
			int nowaLiczba = liczby[i];
			
			int j = i - 1;
			
			while (j >= 0 && liczby[j] > nowaLiczba){
				liczby [j+1] = liczby [j];
				j--;
			}

			liczby [j+1] = nowaLiczba;	
		
		}
		System.out.print("Posortowane liczby: ");
		
		for( int numb: liczby){
			System.out.print(numb + ", ");
		}
	}
	
	public static int getInt(){
		return new Scanner(System.in).nextInt();
	}
}