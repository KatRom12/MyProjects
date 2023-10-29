class BlednaWartoscDlaSilniException extends Exception {
	public BlednaWartoscDlaSilniException(String message){
		super(message);
	}
}	


public class SilniaZUjemnymi{
	
	public static int silnia (int liczba) throws BlednaWartoscDlaSilniException{
		if (liczba < 0){
			throw new BlednaWartoscDlaSilniException("Nie mozna policzyc silnii dla liczb ujemnych");
		}

		int silnia = 1;
		
		for (int i =1;i <= liczba; i++){
			silnia *= i;
		}

		return silnia;
	}	
	
	public static void main (String[] args) {
		try{
			System.out.println(silnia(3));
			System.out.println(silnia(4)); 
			System.out.println(silnia(0));
			System.out.println(silnia(-3));
		} catch(BlednaWartoscDlaSilniException e) {
			System.out.println("Nieprawidlowa liczba! " + e.getMessage());
		}	
	}
}

