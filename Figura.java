import java.util.Arrays;

public class Figura{
	
	private PunktII[] wierzcholki;
	
	public Figura (PunktII[] wierzcholki) {
		this.wierzcholki = wierzcholki;
	}

	public boolean equals(Object o) {
		if (this == o){
			return true;
		}

		if (o == null || this.getClass() != o.getClass()){
			return false;
		}	
		
		Figura other = (Figura) o;
		
		return Arrays.equals(this.wierzcholki, other.wierzcholki);
	}	
		
	
	public static void main (String[] args){
		Figura kwadrat = new Figura(new PunktII[] {
			new PunktII(0, 0),
			new PunktII(10, 0),
			new PunktII(10, 10),
			new PunktII(0, 10)
		});
		
		Figura podobnyKwadrat = new Figura(new PunktII[] {
			new PunktII(0, 0),
			new PunktII(10, 0),
			new PunktII(10, 10),
			new PunktII(0, 10)
		});
		
		Figura innyKwadrat = new Figura(new PunktII[] {
			new PunktII(2, 2),
			new PunktII(4, 2),
			new PunktII(4, 4),
			new PunktII(2, 4)
		});
		
		Figura trojkat = new Figura(new PunktII[] {
			new PunktII(10, 10),
			new PunktII(20, 20),
			new PunktII(10, 30)
		});
		
		System.out.println(kwadrat.equals(podobnyKwadrat));
		System.out.println(kwadrat.equals(innyKwadrat));
		System.out.println(kwadrat.equals(trojkat));
		System.out.println(kwadrat.equals("Witaj!"));
		System.out.println(kwadrat.equals(null));
		System.out.println(kwadrat.equals(kwadrat));
	}
	
}