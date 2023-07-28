package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		// 二桁目
		for(int i = 1; i <=  9 ; i++) {
			// 一桁目
			for(int j = 1; j <=  20 ; j++) {
				
				// 解
				int result = i * j;
				String str = String.format("%03d * %03d = %03d", j ,i ,result);
				
				// 区切りの分岐
				System.out.print(str + ((i < 10) ? (j == 20) ? "" : " || " : "\n")); 
				
			}
		System.out.println("");
		}

	}

}
