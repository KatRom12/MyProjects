public class CoDrugaWartosc{
	public static void main (String[] args){
	
		String[] slowa = {"ala", "ma", "rudego", "kota"};
		int[] liczby = {13, 16, 20, 21, 29};
	
		for (int i = 0; i < slowa.length; i += 2){
			System.out.print(slowa[i] + " ");	
		}
		
		System.out.println();
		
		for (int i = 0; i < liczby.length; i += 2){
			System.out.print(liczby[i] + " ");
		}
	}
}