package curriculum_B;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	//	問1.2 ユーザーネームのエラーチェック
	public static void main(String[] args) {
		// インスタンス化		
		Scanner usurName = new Scanner(System.in);
		List<String> list1 = new ArrayList<>();
		
		String name = null;
		boolean errorFlag = false;
		
		// ユーザーネームのバリデーション
		do {
			errorFlag = false;
			// list1の中身の消去
			list1.clear();	
			name = usurName.nextLine();
			
			// nullチェック　空値チェック			
			if(Objects.isNull(name) || name.isEmpty()) {
				list1.add("名前を入力してください");
				errorFlag = true;
			}
			
			// 10文字以上チェック
			if(name.length() > 10) {
				list1.add("名前を10文字以内にしてください");
				errorFlag = true;
			}
			
			// 半角英数字チェック
			if(!name.matches("^[A-Za-z0-9]+$")) {
				list1.add("半角英数字のみで名前を入力してください");
				errorFlag = true;
			}
			
			// チェック終了
			list1.add("ユーザー名「" + name + "」を登録しました");
			System.out.println(list1.get(0));
			
		}while(errorFlag);
		
		
		
		//	問3 じゃんけんのシステム
		
		// インスタンス化		
		Random random = new Random();
		
		final String[] STR = {"グー", "チョキ", "パー"};
		boolean gameFlag = false;
		int count = 0;
		
		// 開始条件
		do {
			gameFlag = true;
			count ++;
			
			// じゃんけんの手の宣言、出力				
			int me = random.nextInt(3);
			int you = random.nextInt(3);
			System.out.println(name + "の手は「" + STR[me] + "」");
			System.out.println("相手の手は「" + STR[you] + "」");
			
			// 勝ち			
			if(
				(me == 0 && you == 1) || (me == 1 && you == 2) || (me == 2 && you == 0)) {
				System.out.println("やるやん。\n次は俺にリベンジさせて\n");
				gameFlag = false;
			
			// あいこ				
			} else if(me == you) {
				System.out.println("DRAW あいこ もう一回しましょう！\n");
			
			// 負け				
			} else {
				switch (STR[me]) {
					case "グー":
						System.out.println("俺の勝ち！\nなんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです\n");
						break;
					
					case "チョキ":
						System.out.println("俺の勝ち！\n負けは次につながるチャンスです！\nネバーギブアップ！\n");
						break;
					
					case "パー":
						System.out.println("俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ\n");
						break;
				}
			}
		}while(gameFlag);
		
		System.out.println("勝つまでにかかった合計回数は" + count + "回です\n");
		
		// スキャナー閉じる	
		usurName.close();
	}
}
