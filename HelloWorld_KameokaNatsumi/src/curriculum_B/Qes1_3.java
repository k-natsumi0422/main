package curriculum_B;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

//	問1.2
	public static void main(String[] args) {
		Scanner usurName =new Scanner(System.in);
		// Listクラスのインスタンス化		
		List<String> list1 = new ArrayList<>();
		// 初期値		
		String name = null;
		boolean flag = false;
			
		do {
			// list1の中身の消去		
			list1.clear();
			// 分岐に通ったときにフラグを立ててるからループの始まりでは必ずフラグを回収する必要がある			
			flag = false;
			name = usurName.nextLine();
			
			if(Objects.isNull(name) || name.isEmpty()) {
				list1.add("名前を入力してください");
				flag = true;
			}
			
			if(name.length() > 10) {
				list1.add("名前を10文字以内にしてください");
				flag = true;
			}
			
			if(!name.matches("^[A-Za-z0-9]+$")) {
				list1.add("半角英数字のみで名前を入力してください");
				flag = true;
			}
			list1.add("ユーザー名「" + name + "」を登録しました");
			System.out.println(list1.get(0));
			
		}while(flag);
		
		
		
//	問3
		// インスタンス化		
		Random random = new Random();
		// 定数化	
		final String[] STR = {"グー", "チョキ", "パー"};
		boolean flag2 = false;
		int count = 0;
		
		// 開始条件
		do {
			flag2 = false; 
			//int randomValue = random.nextInt(2)+1; 1～2の場合の描き方	＋1が開始を表してる	
			int me = random.nextInt(3);
			int you = random.nextInt(3);
			System.out.println(name + "の手は「" + STR[me] + "」");
			System.out.println("相手の手は「" + STR[you] + "」");
			
			
			if(
				(me == 0 && you == 1) || (me == 1 && you == 2) || (me == 2 && you == 0)) {
				System.out.println("やるやん。\n次は俺にリベンジさせて\n");
				count ++;
					
			} else if(me ==you) {
				System.out.println("DRAW あいこ もう一回しましょう！\n");
				flag2 = true;
				count ++;
				
			} else {
				switch (me) {
					case 0:
					System.out.println("俺の勝ち！\nなんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです\n");
					flag2 = true;
					count ++;
					break;
					
					case 1:
					System.out.println("俺の勝ち！\n負けは次につながるチャンスです！\nネバーギブアップ！\n");
					flag2 = true;
					count ++;
					break;
					
					case 2:
					System.out.println("俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ\n");
					flag2 = true;
					count ++;
					break;
				}
			}
		}while(flag2);
		System.out.println("勝つまでにかかった合計回数は" + count + "回です\n");
	}
	
//	public static String judgeRps(int me , int you) {
//		String result = ""; // 判定結果を保存する
//
//		switch (me) {
//		case 0: // ユーザの手が0「グー」の場合
//			switch (you) {
//			case 0:// コンピュータの手が0「グー」の場合
//				result = "DRAW あいこ もう一回しましょう！\n";
//				break;
//			case 1:// コンピュータの手が1「チョキ」の場合
//				result = "やるやん。\n次は俺にリベンジさせて\n";
//				break;
//			case 2:// コンピュータの手が2「パー」の場合
//				result = "俺の勝ち！\nなんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです\n";
//				break;
//			}
//			break;
//		case 1: // ユーザの手が1「チョキ」の場合
//			switch (you) {
//			case 0:// コンピュータの手が0「グー」の場合
//				result = "俺の勝ち！\n負けは次につながるチャンスです！\nネバーギブアップ！\n";
//				break;
//			case 1:// コンピュータの手が1「チョキ」の場合
//				result = "DRAW あいこ もう一回しましょう！\\n";
//				break;
//			case 2:// コンピュータの手が2「パー」の場合
//				result = "やるやん。\n次は俺にリベンジさせて\n";
//				break;
//			}
//			break;
//		case 2: // ユーザの手が2「パー」の場合
//			switch (you) {
//			case 0:// コンピュータの手が0「グー」の場合
//				result = "やるやん。\n次は俺にリベンジさせて\n";
//				break;
//			case 1:// コンピュータの手が1「チョキ」の場合
//				result = "俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ\n";
//				break;
//			case 2:// コンピュータの手が2「パー」の場合
//				result = "DRAW あいこ もう一回しましょう！\n";
//				break;
//			}
//			break; //ここにループの条件いれる？
//		}
//
//		// 勝敗結果を返す
//		return result;
//	}
//	
//	public static void showResult(int me, int you, String result) {
//		// 結果の表示
//		System.out.printf("あなたの手:%s\n相手の手:%s\n", janken[me], janken[you]);
//		System.out.printf(result);
//	}
}
