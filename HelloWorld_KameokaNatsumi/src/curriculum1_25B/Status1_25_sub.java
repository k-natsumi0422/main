package curriculum1_25B;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Status1_25_sub extends Status1_25_super {
	public void name() {
		Scanner scanner = new Scanner(System.in);
		List<String> list1 = new ArrayList<>();
		
		String name = "";
		boolean isValid = false;
		
		// ユーザーネームのバリデーション
		do {
			isValid = false;
			// list1の中身の消去
			list1.clear();	
			name = scanner.nextLine();
			
			// Nullチェック 空値チェック			
			if(Objects.isNull(name) || name.isEmpty()) {
				list1.add("名前を入力してください");
				isValid = true;
			}
			
			// 10文字以上チェック
			if(name.length() > 10) {
				list1.add("名前を10文字以内にしてください");
				isValid = true;
			}
			
			// 半角英数字チェック
			if(!name.matches("^[A-Za-z0-9]+$")) {
				list1.add("半角英数字のみで名前を入力してください");
				isValid = true;
			}
			
			// チェック終了
			list1.add("こんにちは「" + name + "」さん");
			System.out.println(list1.get(0));
			
		}while(isValid);
		setName(name);
		
		// スキャナー閉じる
		scanner.close();
	}
	
	/**
	 * セッター　ランダム整数の設定
	 * 引数に最大値の設定
	 */
	public void status() {
		Random random = new Random();
		
		super.setHp(random.nextInt(1000));
		super.setMp(random.nextInt(1000));
		super.setPower(random.nextInt(300));
		super.setSpeed(random.nextInt(300));
		super.setDefence(random.nextInt(50));
	}
}