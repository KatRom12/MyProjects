public class SumaLiczbWTablicy{
	public static void main (String[] args){
		int[] tablica = {1, 7, 20, 100};
		
		System.out.println("Suma tych liczb to: " + sumaLiczb(tablica));
		
	}
	
	public static int sumaLiczb(int[] tab) {
		int suma = 0;
		
		for (int i: tab){
			suma += i;
			}
			
		return suma;
	}	
}