import java.util.Scanner;

public class TestSprawdzenieZnaku{
	public static void main(String[] arg){
	
		sign_pierwszaUjemna_zwrociMinusJeden();
		sign_zero_zwrociZero();
		sign_pierwszaDodatnia_zwrociJeden();
		sign_liczbaUjemna_zwrociMinusJeden();
		sign_liczbaDodatnia_zwrociJeden();	
	
	}
	
	public static int sign (int numb) {
		if (numb > 0) {
			return 1;
		} else if (numb == 0){	
			return 0;
		} else {
			return -1;
		}	
	}

	public static int getInt(){
		return new Scanner(System.in).nextInt();
	}

	public static void sign_pierwszaDodatnia_zwrociJeden() {
		assertEquals(1, sign(1));
	}

	public static void sign_pierwszaUjemna_zwrociMinusJeden() {
		assertEquals(-1, sign(-1));
	}
	
	public static void sign_liczbaDodatnia_zwrociJeden() {
		assertEquals(1, sign(15));
	}
	
	public static void sign_liczbaUjemna_zwrociMinusJeden(){
		assertEquals(-1, sign(-15));
	}
	
	public static void sign_zero_zwrociZero() {
		assertEquals(0, sign(0));
	}
		
	public static void assertEquals	(int expected, int actual){
		if(expected != actual) {
			System.out.println("Spodziewano sie " + actual +
		", ale otrzymano: " + expected);
		}
	}	
		
}	