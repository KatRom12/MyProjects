    import java.util.Scanner;
	
	public class BudowaTrojkata {
      public static void main(String[] args) {
        int a, b, c;
		
		System.out.println("Podaj dlugosc pierwszego boku:");
		a = getInt();
		System.out.println("Podaj dlugosc drugiego boku:");
		b = getInt();
		System.out.println("Podaj dlugosc trzeciego boku:");
		c = getInt();
		
		if (a + b > c &&
			a + c > b &&
			b + c > a) {
			System.out.println("Mozna zbudować trojkat o podanych bokach");
		} else {
			System.out.println("Nie mozna zbudowac trojkata o podanych bokach");
		}	
        
      }
	  
	  public static int getInt(){
		  return new Scanner(System.in).nextInt();
	  }  
    }