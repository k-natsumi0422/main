package curriculum1_22B;

import java.text.SimpleDateFormat;
import java.util.Date;

import curriculum1_22A.Handler1_22;

//実行用
public class Main1_22 {

	public static void main(String[] args) {
		// Nullチェックのために配列を生成
		String[] checks = {"こんにちは！", "日本", "寿司", "和食"};
		
		// インスタンス化してコンストラクタ起動
		Handler1_22 handler1_22 = new Handler1_22(checks);
		
		// SimpleDateFormatクラスを使用してフォーマットを指定
		SimpleDateFormat dateTime = new SimpleDateFormat("'今の現在日時は'yyyy/MM/dd HH:mm:ss'です'");

		// コンソール出力
		System.out.println(
				handler1_22.getGreeting() + "ここは" + handler1_22.getCountry() + "です！\n"
			+ "この" + handler1_22.getFood() + "はうまい\n"
			+ handler1_22.getFood() + "は" + handler1_22.getFoodType() + "です\n"
			+ dateTime.format(new Date())
		);

	}

}
