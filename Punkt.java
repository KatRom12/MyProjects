public class Punkt{
	private int x, y;
	
	public void setX (int x) {
		this.x = x;
	}

	public int getX (){
		return x;
	}

	public void setY (int y){
		this.y = y;
	}

	public int getY(){
		return y;
	}

	public String toString (){
		return "Punkt ma współrzędne (x, y): (" + x + ", " + y + ")";
	}
	
	public static void main(String[] args) {
		Punkt p = new Punkt();
		p.setX(3);
		p.setY(12);
		
		System.out.println(p);
	}	
}	