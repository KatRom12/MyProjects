public class TestZwracaniaIndeksu{
	public static void main(String[] arg){
		indeksElementu_liczbaJestPierwszymElementem_zwrociZero();
		indeksElementu_liczbaJestOstatnimElementem_zwrociTrzy();
		indeksElementu_ZbiorJestPusty_zwrociMinusJeden(); 
		indeksElementu_liczbaJestElementem_zwrociDwa();
		indeksElementu_liczbaJestDwaRazy_zwrociDwa();
		indeksElementu_liczbaNieMa_zwrociMinusJeden();
	}
	
	public static int indeks (int[] numbs, int numb) {
		for (int i = 0; i < numbs.length; i++) {
			if (numbs[i] == numb){
				return i;
			} 
		}	
			
		return -1;
	
	}

	public static void indeksElementu_liczbaJestPierwszymElementem_zwrociZero() {
		int numb = 15;
		int [] numbs = {15, 20, 25, 30};
		
		int ind = indeks(numbs, numb);
		
		assertEquals(0, ind);
	}

	public static void indeksElementu_liczbaJestOstatnimElementem_zwrociTrzy() {
		int numb = 15;
		int [] numbs = {6, 20, 25, 15};
		
		int ind = indeks(numbs, numb);
		
		assertEquals(3, ind);
	}
	
	public static void indeksElementu_ZbiorJestPusty_zwrociMinusJeden() {
		int numb = 15;
		int [] numbs = {};
		
		int ind = indeks(numbs, numb);
		
		assertEquals(-1, ind);
	}
	
	public static void indeksElementu_liczbaJestElementem_zwrociDwa() {
		int numb = 25;
		int [] numbs = {15, 20, 25, 30};
		
		int ind = indeks(numbs, numb);
		
		assertEquals(2, ind);
	}
	
	public static void indeksElementu_liczbaJestDwaRazy_zwrociDwa() {
		int numb = 25;
		int [] numbs = {15, 20, 25, 25};
		
		int ind = indeks(numbs, numb);
		
		assertEquals(2, ind);
	}
	
	public static void indeksElementu_liczbaNieMa_zwrociMinusJeden() {
		int numb = 125;
		int [] numbs = {15, 20, 25, 25};
		
		int ind = indeks(numbs, numb);
		
		assertEquals(-1, ind);
	}
		
	public static void assertEquals	(int expected, int actual){
		if(expected != actual) {
			System.out.println("Spodziewano sie " + actual +
		", ale otrzymano: " + expected);
		}
	}	
		
}	