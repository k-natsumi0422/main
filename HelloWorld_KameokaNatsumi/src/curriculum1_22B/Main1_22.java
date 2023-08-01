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
		Handler1_22 theme1 = new Handler1_22(checks);
		
		// SimpleDateFormatクラスを使用してフォーマットを指定
		SimpleDateFormat dateTime = new SimpleDateFormat("'今の現在日時は'yyyy/MM/dd HH:mm:ss'です'");

		// コンソール出力
		System.out.println(
			theme1.getGreeting() + "ここは" + theme1.getCountry() + "です！\n"
			+ "この" + theme1.getFood() + "はうまい\n"
			+ theme1.getFood() + "は" + theme1.getFoodType() + "です\n"
			+ dateTime.format(new Date())
		);

	}

}
