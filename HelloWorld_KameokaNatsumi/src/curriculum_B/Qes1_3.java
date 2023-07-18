package curriculum_B;

import java.util.Scanner;

public class Qes1_3 {

//	問1.2
	public static void main(String[] args) {
		Scanner usurName =new Scanner(System.in);
		String name = usurName.nextLine();
		
		
		if(name == null || name.isEmpty()) {
			System.out.println("名前を入力してください");
		}else if(name.length() > 10) {
			System.out.println("名前を10文字以内にしてください");
		}else if (! name.matches("^[A-Za-z0-9]+$")){
			System.out.println("半角英数字のみで名前を入力してください");
		}else {
			System.out.println("ユーザー名「" + name + "」を登録しました");
		}	
	
//	問3
//	public static void main2(String[] args) {
		int me = myHand();
		int you = yourHand();
		String result = judgeRps(me, you);
		showResult(me, you, result);
	}
		
	public static int myHand() {
		String[] str = {"グー", "チョキ", "パー"};
		//乱数をnumへ代入
		 int num =  (int) (Math.random() * (str.length));
		return num;
	}
	
	public static int yourHand() {
		String[] str = {"グー", "チョキ", "パー"};
		// Mathクラスを利用して乱数をもとめる
		int num2 = (int)(Math.random() * (str.length));
		return num2;
	}

	
	public static String judgeRps(int me , int you) {
		String result = ""; // 判定結果を保存する

		switch (me) {
		case 0: // ユーザの手が0「グー」の場合
			switch (you) {
			case 0:// コンピュータの手が0「グー」の場合
				result = "DRAW あいこ もう一回しましょう！\n";
				break;
			case 1:// コンピュータの手が1「チョキ」の場合
				result = "やるやん。\n次は俺にリベンジさせて\n";
				break;
			case 2:// コンピュータの手が2「パー」の場合
				result = "俺の勝ち！\nなんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです\n";
				break;
			}
			break;
		case 1: // ユーザの手が1「チョキ」の場合
			switch (you) {
			case 0:// コンピュータの手が0「グー」の場合
				result = "俺の勝ち！\n負けは次につながるチャンスです！\nネバーギブアップ！\n";
				break;
			case 1:// コンピュータの手が1「チョキ」の場合
				result = "DRAW あいこ もう一回しましょう！\\n";
				break;
			case 2:// コンピュータの手が2「パー」の場合
				result = "やるやん。\n次は俺にリベンジさせて\n";
				break;
			}
			break;
		case 2: // ユーザの手が2「パー」の場合
			switch (you) {
			case 0:// コンピュータの手が0「グー」の場合
				result = "やるやん。\n次は俺にリベンジさせて\n";
				break;
			case 1:// コンピュータの手が1「チョキ」の場合
				result = "俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ\n";
				break;
			case 2:// コンピュータの手が2「パー」の場合
				result = "DRAW あいこ もう一回しましょう！\n";
				break;
			}
			break; //ここにwループの条件いれる？
		}

		// 勝敗結果を返す
		return result;
	}
	
	public static void showResult(int me, int you, String result) {
		// じゃんけんの手を配列で定義
		String[] janken = { "グー", "チョキ", "パー" }; 
		// 結果の表示
		System.out.printf("あなたの手:%s\n相手の手:%s\n", janken[me], janken[you]),"」";
		System.out.printf(result);
	}
}
