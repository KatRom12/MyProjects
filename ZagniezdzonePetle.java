public class ZagniezdzonePetle{
	public static void main (String[] args) {
		glowna_petla: for (int i = 1; i <= 10; i++) {
			if (i%2 !=0){
				continue;
			}
			for(int j = 1; j <= 10; j++) {
				System.out.print(j + " ");
				if (j > i){
					continue glowna_petla ;
				}
				
			}	
		}
	}
}	