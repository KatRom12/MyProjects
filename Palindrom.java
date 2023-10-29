    import java.util.Scanner;
	
	public class Palindrom {
      public static void main(String[] args) {
        String wyraz;
		int i, j;
		
		System.out.println("Podaj wyraz:");
		wyraz = getString();
		j = 1;
		boolean czyPalindrom = false;
		
		for (i = 0; i < wyraz.length(); i ++){
			if (wyraz.charAt(i) != wyraz.charAt(wyraz.length() - j)){
				czyPalindrom = false;
				break;
			} else {
				j++;
				czyPalindrom = true;
			}
		}
		
		System.out.println(wyraz + " jest palindromem: " + czyPalindrom);	
			
      }
	  
	  public static String getString(){
		  return new Scanner(System.in).next();
	  }  
    }