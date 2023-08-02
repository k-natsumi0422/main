package curriculum1_25A;

import curriculum1_25B.Handler1_25_sub;

public class Main1_25 {

	public static void main(String[] args) {
		// インスタンス化
		Handler1_25_sub handler1_25_sub = new Handler1_25_sub();
		handler1_25_sub.name();
		handler1_25_sub.status();
		
		// コンソール出力
		System.out.println(
			"ステータス"
			+ "\nHP：" + handler1_25_sub.getHp()
			+ "\nMP：" + handler1_25_sub.getMp()
			+ "\n攻撃力：" + handler1_25_sub.getPower()
			+ "\n素早さ：" + handler1_25_sub.getSpeed()
			+ "\n防御力：" + handler1_25_sub.getDefence()
			+ "\n\nさあ冒険に出かけよう！"
		);

	}

}
