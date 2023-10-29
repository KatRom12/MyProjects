public class Osoba{
	
	private int wiek;
	private String imie;
	private String nazwisko;
	
	public void ustawWiek(int wartoscWieku){
		wiek = wartoscWieku;
	}

	public void ustawImie (String imieOsoby) {
		imie = imieOsoby;
	}

	public void ustawNazwisko (String nazwiskoOsoby) {
		nazwisko = nazwiskoOsoby;
	}
	
	public String toString(){
		return "Oto " + imie + " " + nazwisko + ", ktora/y jest w wieku " + wiek + ".";
	}	
	
	public static void main (String[] args){
		Osoba kasia = new Osoba();
		
		kasia.ustawImie("Kasia");
		kasia.ustawNazwisko("Romanowska");
		kasia.ustawWiek(35);
		
		System.out.println(kasia);
	}
	
}