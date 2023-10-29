public class Obliczenia{
	
	public static int silnia(int liczba) {
		int silnia = 1;
		for (int i = 1; i<=liczba; i++){
			silnia *= liczba;
		}
		return silnia;
	}	
	
	public static int sumaLiczb(int[] tablica){
		int suma = 0;
		
		for (int i: tablica){
			suma += i;
		}	
		
		return suma;
	}	
	
	
}