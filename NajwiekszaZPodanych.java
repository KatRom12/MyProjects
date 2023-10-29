import java.util.Scanner;

public class NajwiekszaZPodanych{
	public static void main (String[] args){
		
		System.out.println("Podaj liczbe: ");
		int numb = getInt();
		
		while (true){
			System.out.println("Chcesz kontynuowac ? t/n");
			String koniec = getString();
			
			if (koniec.equals("n")){
				break;
			}	
			
			System.out.println("Podaj kolejna liczbe: ");
			int compare = getInt();
			
			if (compare > numb) {
				numb = compare;
			}	
		}
		
		System.out.println("Najwieksza z podanych liczb to: " + numb);
		
	}
	
	public static int getInt (){
		return new Scanner(System.in).nextInt();
	}	
	
	public static String getString(){
		return new Scanner(System.in).next();
	}	
}	