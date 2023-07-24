package curriculum_B;


public class Qes4 {

	public static void main(String[] args) {
		for(int i = 1; i <=  9 ; i++) {
			for(int j = 1; j <=  9 ; j++) {
				int result = i * j;
				String str = String.format("%02d * %02d = %02d", i , j , result);
				System.out.print(str);
				if (j == 9) {
                    System.out.print("");
                } else {
                    System.out.print(" || ");
                }
			}
		System.out.println("");
		}

	}

}
