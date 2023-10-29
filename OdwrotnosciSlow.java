import java.util.Scanner;

public class OdwrotnosciSlow{
	public static void main (String[] args){
	
		String[] slowa = new String[5];
		
		for (int i = 0; i < slowa.length; i++){
			System.out.print("Podaj slowo: ");
			slowa[i] = getString();
		}	
		
		
		for (int i = slowa.length - 1; i >= 0; i--){
			for(int j = slowa[i].length()-1; j >=0; j--){
				System.out.print(slowa[i].charAt(j));
			}
			System.out.println();
		}
	}
	
	public static String getString(){
		return new Scanner(System.in).next();
	}
}