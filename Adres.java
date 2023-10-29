public class Adres{
	private String miejscowosc, kodPocztowy, nazwaUlicy;
	private int nrDomu;
	
	public Adres(String miejscowosc, String kodPocztowy, String nazwaUlicy, int nrDomu){
		this.miejscowosc = miejscowosc;
		this.kodPocztowy = kodPocztowy;
		this.nazwaUlicy = nazwaUlicy;
		this.nrDomu = nrDomu;
	}

	public String toString (){
		return "Podany adres to: " + miejscowosc + " " + kodPocztowy + " ul. " + nazwaUlicy + " " + nrDomu;
	}
	
	public static void main(String[] args) {
		Adres mojAdres = new Adres("Warszawa", "02-943", "Limanowskiego", 30);
	
		System.out.println(mojAdres);
	}	
}	