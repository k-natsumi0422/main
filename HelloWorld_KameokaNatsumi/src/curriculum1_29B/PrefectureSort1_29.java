package curriculum1_29B;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class PrefectureSort1_29 {
	public int[] Number() {
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("コンソールに文字を入力してください");
	
		// String型からint型に変更して数字ごとに分割
		int[] input = Stream.of(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
		
		// 昇順でソート
		Arrays.sort(input);
		
		return input;
	}
	
	public int[] Sort(int[] input) {
		// 降順でソート
		Arrays.stream(input).boxed().sorted(Collections.reverseOrder()).toArray(Integer[]::new);
		
		return input;
		
		
	}
}
