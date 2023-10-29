public class Gwiazdki{
	public static void main (String[] args){
		gwiazdki(14);
		gwiazdki(2);
		gwiazdki(6);
	}
	
	public static void gwiazdki(int x) {
		for(int i = 0; i <= x; i++){
			System.out.print("*");
		}
		System.out.println();
	}	
}