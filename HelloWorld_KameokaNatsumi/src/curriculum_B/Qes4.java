package curriculum_B;


public class Qes4 {

	public static void main(String[] args) {
		// 一桁目		
		for(int i = 1; i <=  9 ; i++) {
			// 二桁目
			for(int j = 1; j <=  9 ; j++) {
				
				// 解
				int result = i * j;
				String str = String.format("%02d * %02d = %02d", i , j , result);
				
				// 区切りの分岐		
				System.out.print(str + ((j == 9) ? "" : " || " ));
			}
		System.out.println("");
		}

	}

}
