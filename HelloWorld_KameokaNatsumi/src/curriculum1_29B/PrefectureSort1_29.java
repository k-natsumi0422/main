package curriculum1_29B;

import java.util.Arrays;
import java.util.Collections;

public class PrefectureSort1_29 {
	public Integer[] Number(int[] input) {
		// 昇順でソート
		Arrays.sort(input);
		Integer[] ascOrder = Arrays.stream(input).boxed().toArray(Integer[]::new);
		
		return ascOrder;
	}
	
	public Integer[] Sort(int[] input) {
		// 降順でソート
		Integer[] descOrder = Arrays.stream(input).boxed().toArray(Integer[]::new);
		Arrays.sort(descOrder, Collections.reverseOrder());
		
		return descOrder;
		
		
	}
}
