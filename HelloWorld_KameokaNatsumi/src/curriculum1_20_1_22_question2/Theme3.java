package curriculum1_20_1_22_question2;

import java.text.SimpleDateFormat;
import java.util.Date;

import curriculum1_20_1_22_question.Theme1;

//実行用
public class Theme3 {

	public static void main(String[] args) {
		// インスタンス化してコンストラクタ起動
		Theme1 theme1 = new Theme1("こんにちは！", "日本", "寿司", "和食");
		SimpleDateFormat time = new SimpleDateFormat("'今の現在日時は'yyyy/MM/dd HH:mm:ss'です'");

		// コンソール出力
		System.out.println(
			theme1.getGreeting() + "ここは" + theme1.getCountry() + "です！\n"
			+ "この" + theme1.getFood() + "はうまい\n"
			+ theme1.getFood() + "は" + theme1.getFoodType() + "です\n"
			+ time.format(new Date())
		);

	}

}
