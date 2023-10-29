public class NiemutowalnaKsiazka{
	private final String tytul;
	private final String autor;
	private final double cena;
	
	public NiemutowalnaKsiazka(String tytul, String autor, double cena){
		this.tytul = tytul;
		this.autor = autor;
		this.cena = cena;
	}	
	
	public String toString(){
		return "'" + tytul + "'" + " napisana przez " + autor + ", cena " + cena;
	}
}