public class OsobaII{
	
	private final int rokUrodzenia;
	private String imie;
	private String nazwisko;
	private Adres adres;
	
	public OsobaII (String imie, String nazwisko, int rokUrodzenia, Adres adres){
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.rokUrodzenia = rokUrodzenia;
		this.adres = adres;
	}

	public OsobaII (String imie, String nazwisko, int rokUrodzenia, String miejscowosc, String kodPocztowy, String nazwaUlicy, int nrDomu){
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.rokUrodzenia = rokUrodzenia;
		this.adres = new Adres(miejscowosc, kodPocztowy, nazwaUlicy, nrDomu);
	}

	public String toString(){
		return "Oto " + imie + " " + nazwisko + ", urodzona w " + rokUrodzenia + " adres: " + adres + ".";
	}	
	
	public static void main (String[] args){
		Adres adres = new Adres("Warszawa", "00-681", "Hoza", 57);
		
		OsobaII kasia = new OsobaII("Kasia", "Romanowska", 1988, "Warszawa", "02-943", "Limanowskiego", 30);
		OsobaII marek = new OsobaII("Marek", "Romanowski", 1989, adres);
		
		System.out.println(kasia);
		System.out.println(marek);
	}
	
}