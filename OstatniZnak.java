public class OstatniZnak{
	public static void main (String[] args){
		ostatniZnak("lalka");
		ostatniZnak("pies");
	}
	
	public static void ostatniZnak(String word) {
		char last = word.charAt(word.length() - 1);
		
		System.out.println(last);
	}	
}