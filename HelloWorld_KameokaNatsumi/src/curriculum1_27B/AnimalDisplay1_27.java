package curriculum1_27B;

import java.util.Scanner;

public class AnimalDisplay1_27 {
	
//	スキャナー split : ,いれる
//	入力項目を配列化
//	名前と学名　switch文
	
	public String[][] animalData() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("コンソールに文字を入力してください");
		
		String input = scanner.nextLine();
		// 動物ごとに分割
		String[] splitInput = input.split(",");
		// 動物名　体長　速度
		String[][] splitInput2 = new String[splitInput.length][2];
		
		// 動物の情報ごとに分割
		for(int i = 0; i < splitInput.length; i++) {
			splitInput2[i] = splitInput[i].split(":");
		}
		
		// スキャナー閉じる
		scanner.close();
		
		// 情報ごとに分割したものを返す
		return splitInput2;
	}
	
	public void animalStatus(String[][] splitInput2) {
	
		// 動物ごとの情報の取得
		for(String[] str : splitInput2) {
			System.out.print(
				"動物名：" + str[0]
				+ "\n体長：" + str[1] + "m"
				+ "\n速度：" + str[2] + "km/h"
				+ "\n学名："
			);
			
			// 学名
			switch(str[0]) {
				case"ライオン":
					System.out.println("パンテラ レオ\n");
					break;
				case"ゾウ":
					System.out.println("ロキソドンタ・サイクロティス\n");
					break;
				case"パンダ":
					System.out.println("アイルロポダ・メラノレウカ\n");
					break;
				case"チンパンジー":
					System.out.println("パン・トゥログロディテス\n");
					break;
				case"シマウマ":
					System.out.println("チャップマンシマウマ\n");
					break;
				default:
					System.out.println("不明\n");
			}	
		}
	}	
}
