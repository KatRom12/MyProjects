public class PorownanieTablicString{
	public static void main (String[] args){
	
		String[] slowaJeden = {"Jutro", "bedzie", "futro"};
		String[] slowaDwa = {"Jutro", "bedzie", "futro"};
		boolean czyTakieSame = false;
		
		if (slowaJeden.length == slowaDwa.length) {
			for(int i = 0; i < slowaJeden.length; i++) {
				czyTakieSame = false;
				if (!(slowaJeden[i].equals(slowaDwa[i]))){
					break;
				} else {
				    czyTakieSame = true;
				}	
			}
		}

		if (czyTakieSame) {
			System.out.println ("Te tablice sa takie same.");
		} else {
			System.out.println ("Te tablice sa takie same.");	
		}
	}
}