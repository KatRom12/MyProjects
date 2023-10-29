public class LiczbaZnakowWSlowie{
	public static void main (String[] args){
		int ileRazy = ileZnakow("Ala ma kota", 'a');
		int tyleRazy = ileZnakow("Barbelucha Babci Basi", 'b');
		
		System.out.println(ileRazy);
		System.out.println(tyleRazy);
	}
	
	public static int ileZnakow(String wyraz, char ca) {
		int sumaZnakow = 0;

		for (int i = 0; i < wyraz.length(); i++){
			if(wyraz.charAt(i) == ca) {
				sumaZnakow ++;
			}
		}	
		return sumaZnakow;
	}	
}