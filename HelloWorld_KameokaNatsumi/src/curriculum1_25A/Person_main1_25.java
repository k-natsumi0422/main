package curriculum1_25A;

import curriculum1_25B.Status1_25_sub;

public class Person_main1_25 {

	public static void main(String[] args) {
		// インスタンス化
		Status1_25_sub status1_25_sub = new Status1_25_sub();
		status1_25_sub.name();
		status1_25_sub.status();
		
		// コンソール出力
		System.out.println(
			"ステータス"
			+ "\nHP：" + status1_25_sub.getHp()
			+ "\nMP：" + status1_25_sub.getMp()
			+ "\n攻撃力：" + status1_25_sub.getPower()
			+ "\n素早さ：" + status1_25_sub.getSpeed()
			+ "\n防御力：" + status1_25_sub.getDefence()
			+ "\n\nさあ冒険に出かけよう！"
		);

	}

}
