import java.util.Scanner;

public class TestCzyParzysta{
	public static void main(String[] arg){
	
		czyParzysta_liczbaParzystaNieujemna_zwrociTrue();
		czyParzysta_liczbaParzystaUjemna_zwrociTrue();
		czyParzysta_liczbaNieparzystaNieUjemna_zwrociFalse();
		czyParzysta_liczbaNieparzystaUjemna_zwrociFalse();
		czyParzysta_liczbaZero_zwrociTrue();
	}
	
	public static boolean czyParzysta (int numb) {
		return numb % 2 == 0;
	}

	public static int getInt(){
		return new Scanner(System.in).nextInt();
	}

	public static void czyParzysta_liczbaParzystaNieujemna_zwrociTrue() {
		assertEquals(true, czyParzysta(20));
	}

	public static void czyParzysta_liczbaParzystaUjemna_zwrociTrue() {
		assertEquals(true, czyParzysta(-20));
	}
	
	public static void czyParzysta_liczbaNieparzystaNieUjemna_zwrociFalse() {
		assertEquals(false, czyParzysta(15));
	}
	
	public static void czyParzysta_liczbaNieparzystaUjemna_zwrociFalse() {
		assertEquals(false, czyParzysta(-15));
	}
	
	public static void czyParzysta_liczbaZero_zwrociTrue() {
		assertEquals(true, czyParzysta(0));
	}
		
	public static void assertEquals	(boolean expected, boolean actual){
		if(expected != actual) {
			System.out.println("Spodziewano sie " + actual +
		", ale otrzymano: " + expected);
		}
	}	
		
}	