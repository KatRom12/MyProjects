    import java.util.Scanner;
	
	public class WiekszaLiczba {
      public static void main(String[] args) {
        int a, b;
		
		System.out.println("Podaj pierwsza liczbe:");
		a = getInt();
		System.out.println("Podaj druga liczbe:");
		b = getInt();
		
		
		if (a > b) {
			System.out.println(a + " jest wieksze od " + b);
		} else if (a < b){
			System.out.println(b + " jest wieksze od " + a);
		} else {
			System.out.println("obie liczby sa sobie rowne");	
        }
      }
	  
	  public static int getInt(){
		  return new Scanner(System.in).nextInt();
	  }  
    }