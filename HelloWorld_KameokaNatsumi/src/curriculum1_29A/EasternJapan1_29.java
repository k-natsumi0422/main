package curriculum1_29A;

import java.util.Scanner;

import curriculum1_29B.PrefectureSort1_29;
import curriculum1_29B.PrefecturesData1_29;

public class EasternJapan1_29 {

	public static void main(String[] args) {
		// インスタンス化
		PrefectureSort1_29 prefectureSort1_29 = new PrefectureSort1_29();
		PrefecturesData1_29 prefecturesData1_29 = new PrefecturesData1_29();
		Scanner scanner = new Scanner(System.in);
		
		// 入力した数値を格納
		int[] number = prefectureSort1_29.Number();
		
		System.out.println("昇順か降順を入力してください");
		String input = scanner.nextLine();
		
		// 昇順降順ソート
		switch(input) {
			case "昇順":
				prefecturesData1_29.InputData(number);
				break;
			case"降順":
				prefecturesData1_29.InputData(prefectureSort1_29.Sort(number));
				break;
		}
		
		// スキャナー閉じる
		scanner.close();
	}
}
