package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		for(int i = 1; i <=  9 ; i++) {
			for(int j = 1; j <=  20 ; j++) {
				int result = i * j;
				String str = String.format("%03d * %03d = %03d", j ,i ,result);
				System.out.print(str + ((i < 10) ? (j == 20) ? "" : " || " : "\n")); 
				// 三項演算子でかく	
				if(j == 20) {
					System.out.print(str + "");
				} else if (i < 10) {
					System.out.print(str +" || ");
				} else {
					System.out.print(str +"\n");
				}
			}
			System.out.println("");
		}

	}

}
