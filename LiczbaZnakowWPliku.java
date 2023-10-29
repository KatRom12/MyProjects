import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class LiczbaZnakowWPliku {
	
	public static void main (String[] args){
		int liczbaZnakow = 0;
		File f = new File(PobierzLokalizacjePliku());
		
		try (FileReader fileReader = new FileReader(f)){
					
			while(fileReader.read() != -1){
				liczbaZnakow ++;
			}	
			System.out.println("W pliku jest: " + liczbaZnakow + " znakow.");
		} catch (FileNotFoundException e) {
			System.out.println("Podany plik nie istnieje.");
		} catch (IOException e) {
			System.out.println("Wystapil blad podczas odczytywania pliku: " + e.getMessage());
		}

		
	}
	
	public static String PobierzLokalizacjePliku(){
		String sciezkaPliku;
		
		while(true){
			System.out.println("Podaj lokalizacje pliku txt na dysku: ");
			sciezkaPliku = getString();
		
			if (!sciezkaPliku.endsWith(".txt")){
				System.out.println("Bledny format pliku!");
			} else {
				return sciezkaPliku;
			}
		}
	}	
	
	public static String getString(){
		return new Scanner(System.in).next();
	}	
}	