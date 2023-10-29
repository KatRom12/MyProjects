    import java.util.Scanner;
	
	public class LiczbaPodzielnaPrzez {
      public static void main(String[] args) {
        int liczba;
		
		System.out.println("Podaj liczbe:");
		
		liczba = getInt();
		
		if (liczba%3 == 0) {
			System.out.println("Liczba " + liczba + " jest podzielna przez 3");
		} else {
			System.out.println("Liczba " + liczba + " nie jest podzielna przez 3");
		}	
        
      }
	  
	  public static int getInt(){
		  return new Scanner(System.in).nextInt();
	  }  
    }