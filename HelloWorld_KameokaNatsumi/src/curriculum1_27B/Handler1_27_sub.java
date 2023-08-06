package curriculum1_27B;

import java.util.Scanner;

public class Handler1_27_sub extends Handler1_27_super {
	
//	スキャナー split : ,いれる
//	入力項目を配列化
//	名前と学名　switch文
	
	public void animalData() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] splitInput = input.split(":");
		
		super.setName(splitInput[0]);
		super.setHeight(Double.parseDouble(splitInput[1]));
		super.setSpeed((int) Double.parseDouble(splitInput[2]));
		
		scanner.close();
	}
	
	public void animalStatus() {
		super.setScientificName("");
	
			switch(super.setName(splitInput[0])) {
				case"ライオン":
					super.scientificName = "パンテラ レオ";
					break;
				case"ゾウ":
					super.scientificName = "ロキソドンタ・サイクロティス";
					break;
				case"パンダ":
					super.scientificName = "アイルロポダ・メラノレウカ";
					break;
				case"チンパンジー":
					super.scientificName = "パン・トゥログロディテス";
					break;
				case"シマウマ":
					super.scientificName = "チャップマンシマウマ";
					break;
				default:
					super.scientificName = "不明";
			}
	}	
}
