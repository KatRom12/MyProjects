    import java.util.Scanner;
	
	public class RokPrzestepny {
      public static void main(String[] args) {
        int a;
		boolean dorosly;
		
		System.out.println("Podaj rok:");
		a = getInt();
		
		if((a % 4 == 0 && a % 100 != 0) || a % 400 == 0){
			System.out.println(a + " jest rokiem przestepnym");
		} else {
			System.out.println(a + " nie jest rokiem przestepnym");	
		}	
      }
	  
	  public static int getInt(){
		  return new Scanner(System.in).nextInt();
	  }  
    }