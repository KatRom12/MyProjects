public class Najwieksza{
	public static void main (String[] args){
	
		int[] liczby = {13, 16, 20, 21, 29};
		int najwieksza = liczby[0];
		
		for (int i = 0; i < liczby.length; i ++){
			if (liczby[i] > najwieksza){
				najwieksza = liczby[i];
			}	
			
		}
		
		System.out.println(najwieksza);
		
	}
}