    import java.util.Scanner;
	
	public class WiekszaLiczbaZTrzech {
      public static void main(String[] args) {
        int a, b, c;
		
		System.out.println("Podaj pierwsza liczbe:");
		a = getInt();
		System.out.println("Podaj druga liczbe:");
		b = getInt();
		System.out.println("Podaj trzecia liczbe:");
		c = getInt();
		
		if (a > b) {
			if (a > c) {
				System.out.println(a + " jest najwieksza liczba");
			} else {
				System.out.println(c + " jest najwieksza liczba");	
			}	
		} else if (a < b){
			if (b > c){
				System.out.println(b + " jest najwieksza liczba");
		    } else {
			System.out.println(c + " jest najwieksza liczba");	
			}
        }
      }
	  
	  public static int getInt(){
		  return new Scanner(System.in).nextInt();
	  }  
    }