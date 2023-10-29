public class PorownajArgumenty{
	public static void main (String[] args){
		System.out.println("Czy 3 = 5? " + czyIdentyczne(3, 5));
		System.out.println("Czy 3.14 = 3.14? " + czyIdentyczne(3.14, 3.14));
		System.out.println("Czy true = false? " + czyIdentyczne(true, false));
		System.out.println("Czy d = d? " + czyIdentyczne('d', 'd'));
		System.out.println("Czy bliskosc = dalekosc? " + czyIdentyczne("bliskosc", "dalekosc"));
		
		int [] tab1 = {2, 3, 4};
		int [] tab2 = {2, 3, 4, 5};
		int [] tab3 = {2, 3, 4};
		
		System.out.println("Czy tab1 = tab2? " + czyIdentyczne (tab1, tab2));
		System.out.println("Czy tab1 = tab3? " + czyIdentyczne (tab1, tab3));
		
		String [] babcia = {"barbelucha" + "Babci" + "Basi"};
		String[] babulenka = {"Barbelucha" + "Babci" + "Basi"};
		
		System.out.println("Czy 'barbelucha Babci Basi' = 'Barbelucha Babci Basi'? " + czyIdentyczne (babcia, babulenka));
	}
	
	public static boolean czyIdentyczne(int one, int two) {
		return one == two;
	}
	
	public static boolean czyIdentyczne(double one, double two) {
		return one == two;
	}

	public static boolean czyIdentyczne(boolean one, boolean two) {
		return one == two;
	}
	
	public static boolean czyIdentyczne(char one, char two) {
		return one == two;
	}

	public static boolean czyIdentyczne(String one, String two) {
		return one.equals(two);
	}

	public static boolean czyIdentyczne(int[] one, int[] two) {
		if(one.length != two.length){
			return false;
		} else {
		for (int i = 0; i < one.length; i ++){
			if (one[i] != two[i]) {
				return false;
			}
		}	
		return true;
		}
	}
	
	public static boolean czyIdentyczne(String[] one, String[] two) {
		if(one.length != two.length){
			return false;
		} else {
		for (int i = 0; i < one.length; i ++){
			if (!(one[i].equals(two[i]))) {
				return false;
			}
		}	
		return true;
		}
	}
}