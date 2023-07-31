package curriculum_New_question;

import java.util.Arrays;
import java.util.Random;

public class Curriculum_New_1_18{
	
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	void q1(String  str, int i){
		System.out.println("Hello JavaSE 11");
	}
	
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	void q2(int i) {
		System.out.println(i * i);
	}
		
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	void q3(int[] i) {
		System.out.println(Arrays.toString(i));
	}
			
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	void q2(double d , double d2) {
		System.out.println(d + d2);
	}
		
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して(35)
	// 格納した値を順番に(34)コンソールで出力後(36)、格納した値を返す(39)メソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	int[] q5(int i) {
		Random random = new Random();
		int[] num = new int[i];
		
		for(int i2 = 0; i2 < i; i2++) {
			num[i2] = random.nextInt(99)+1;
			System.out.println(num[i2]);
		}
		
		return num;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	double q6(int[] nums) {
		int sum = 0;
		for(int num : nums) {
			sum += num;
		}
		
		double avg = (double) sum / nums.length;
		System.out.println(avg);
		
		return avg;
	}
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	boolean q7(double avg) {		
		return avg >= 50 ? true : false;
	}
	
	
	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください
		
		// インスタンス化
		Curriculum_New_1_18 c_n_118 = new Curriculum_New_1_18();
		
		// 引数の用意
		int i = 3;
		int[] num = {1, 2, 3, 4, 5};
		
		// Q1
		c_n_118.q1(null, 0);
		// Q2 
		c_n_118.q2(i);
		// Q3
		c_n_118.q3(num);
		// Q4
		c_n_118.q2(0.2 , 0.3);
//		// Q5
		int[] q5 = c_n_118.q5(i);
//		// Q6
		double q6 = c_n_118.q6(q5);
//		// Q7
		System.out.println(c_n_118.q7(q6));
//		
	}
}