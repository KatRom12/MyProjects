public class PunktII{
	
	private int x, y;
	
	public PunktII (int x, int y) {
		this.x= x;
		this.y = y;
	}

	public boolean equals(Object o) {
		if (this == o){
			return true;
		}

		if (o == null || this.getClass() != o.getClass()){
			return false;
		}	
		
		PunktII other = (PunktII) o;
		
		if (this.x != other.x) {
			return false;
		}
		
		return this.y == other.y;
	}	
		
	
	public static void main (String[] args){
		PunktII a = new PunktII (2,7);
		PunktII b = a;
		PunktII c = new PunktII(2,7);
		PunktII d = new PunktII(3,8);
		
		System.out.println("a rowne b?" + a.equals(b));
		System.out.println("a rowne c?" + a.equals(c));
		System.out.println("b rowne c?" + b.equals(c));
		System.out.println("a rowne d?" + a.equals(d));
		System.out.println("a rowne null?" + a.equals(null));	
	}
	
}