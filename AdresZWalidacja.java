class NieprawidlowyAdresException extends Exception{
	public NieprawidlowyAdresException(String message){
		super(message);
	}
}	

public class AdresZWalidacja{
	
	private String ulica;
	private int numerDomu;
	private String kodPocztowy;
	private String miasto;
	
	public AdresZWalidacja (String ulica, int numerDomu, String kodPocztowy, String miasto) throws NieprawidlowyAdresException{
		if (ulica == null) {
			throw new NieprawidlowyAdresException("Ulica nie moze byc nullem.");
		} 
		
		this.ulica = ulica;
		
		if (numerDomu <= 0){
			throw new NieprawidlowyAdresException("Numer domu musi byc dodatni.");
		}

		this.numerDomu = numerDomu;
		
		if (kodPocztowy == null){
			throw new NieprawidlowyAdresException("Kod pocztowy nie moze byc nullem.");
		}

		this.kodPocztowy = kodPocztowy;
		
		if (miasto == null) {
			throw new NieprawidlowyAdresException("Miasto nie moze byc nullem.");
		}	
	
		this.miasto = miasto;
	}

	public static void main (String[] args){
			try{
				AdresZWalidacja adres1 = new AdresZWalidacja("Targowa", 15, "03-727", "Warszawa");
				System.out.println(adres1);
			}catch (NieprawidlowyAdresException e){
				System.out.println(e.getMessage());
			}	
			try {
				AdresZWalidacja adres2 = new AdresZWalidacja("Targowa", -15, "03-727", "Warszawa");
				System.out.println(adres2);
			}catch (NieprawidlowyAdresException e){
				System.out.println(e.getMessage());
			}		
			try{
				AdresZWalidacja adres3 = new AdresZWalidacja(null, 15, "03-727", "Warszawa");
				System.out.println(adres3);
			}catch (NieprawidlowyAdresException e){
				System.out.println(e.getMessage());
			}		
			try{
				AdresZWalidacja adres4 = new AdresZWalidacja("Targowa", 15, null, "Warszawa");
				System.out.println(adres4);
			}catch (NieprawidlowyAdresException e){
				System.out.println(e.getMessage());
			}		
			try{
				AdresZWalidacja adres5 = new AdresZWalidacja("Targowa", 15, "03-727", null);
				System.out.println(adres5);
			}catch (NieprawidlowyAdresException e){
				System.out.println(e.getMessage());
			}
	}
		
}