package curriculum1_25B;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Handler1_25_sub extends Handler1_25_super {
	public void name() {
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
			
			// Nullチェック 空値チェック			
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
			list1.add("こんにちは「" + name + "」さん");
			System.out.println(list1.get(0));
			
		}while(errorFlag);
		setName(name);
	}
	
	/**
	 * セッター　ランダム整数の設定
	 * 引数に最大値の設定
	 */
	public void status() {
		Random random = new Random();
		
		setHp(random.nextInt(1000));
		setMp(random.nextInt(1000));
		setPower(random.nextInt(300));
		setSpeed(random.nextInt(300));
		setDefence(random.nextInt(50));
	}
}