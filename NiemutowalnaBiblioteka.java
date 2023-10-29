public class NiemutowalnaBiblioteka{
	private final NiemutowalnaKsiazka[] biblioteka;
	
	public NiemutowalnaBiblioteka(NiemutowalnaKsiazka[] biblioteka){
		this.biblioteka = new NiemutowalnaKsiazka[biblioteka.length];
		
		for (int i = 0; i <biblioteka.length; i++) {
			this.biblioteka[i] = biblioteka[i];
		}	
	}	
	
	public NiemutowalnaKsiazka[] getKsiazki(){
		NiemutowalnaKsiazka[] rezultat = new NiemutowalnaKsiazka[biblioteka.length];
			for (int i = 0; i <biblioteka.length; i++) {
				rezultat[i] = biblioteka[i];
		}	
		
		
		return rezultat;
	}
	
	public static void main(String[] args){
		NiemutowalnaKsiazka[] zbior = {
			new NiemutowalnaKsiazka ("Akademia Pana Kleksa", "Jan Brzechwa", 16.50),
			new NiemutowalnaKsiazka("To", "Stephen King", 34.99),
			new NiemutowalnaKsiazka("Harry Potter i kamien filozoficzny", "J.K. Rowling", 25.90)
		};

		NiemutowalnaBiblioteka biblioteka = new NiemutowalnaBiblioteka(zbior);
		
		System.out.println("Ksiazki w bibliotece: ");
		
		for(NiemutowalnaKsiazka ksiazka: biblioteka.getKsiazki()){
			System.out.println(ksiazka);
		}
	}	
}