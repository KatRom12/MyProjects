public class CzyPalindrom{
	public static void main (String[] args){
		System.out.println(czyPalindrom("lalka"));
		System.out.println(czyPalindrom("kajak"));
	}
	
	public static boolean czyPalindrom(String word) {
		String lowLetters = word.toLowerCase();
		int dlugoscSlowa = word.length();
		
		for (int i = 0; i < dlugoscSlowa / 2; i++){
			if (lowLetters.charAt(i) != lowLetters.charAt(word.length() - 1 - i)){
				return false;
			}
		}	
		return true;
	}	
}