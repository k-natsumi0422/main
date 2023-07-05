package curriculum_A;

public class Qes1_13 {
	public static void main(String[] args) {
		
		// 問1.2 変数の宣言と初期化
		byte b = 0;
		short s = 0;
		int i = 0;
		long l = 0;
		float f = 0;
		double d = 0;
		char c = 0;
		String text = null;
		boolean type = false;
		
		// 問3 値の代入
		b = 10;
		s = 100;
		i = 1000;
		l = 10000l;
		f = 9.5f;
		d = 10.5;
		c = 'a';
		text = "ハロー";
		type = true;
		
		// 問4 上記変数を使用し、コンソール出力
		System.out.println(
			  // 出力結果
			  // 11110
			  (b + s + i + l) + "\n"
			  // 20
			+ (b * 2) + "\n"
			  // aハローtrue
			+ c + text + type + "\n"
			  // 11130
			+ (int)(b + s + i + l + f + d) + "\n"
			  // 10000000000
			+ (b * s * i * l) + "\n"
			  // 0.105
			+ (d / s) + "\n"
			  // -90
			+ (b - s) + "\n"
		);
		
		//問5 修正問題 String型からint型へ修正
		String num = "20";
		int num1 = 23;
		System.out.println("ハローJAVA" + (num1 + Integer.parseInt(num)) + "\n");
		
		//問6 変数宣言 初期化 値の代入 
		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		String food = "寿司";
		
		// コンソール出力
		System.out.println(
				// 山田太郎
				  "初めまして" + name + "です" + "\n"
				// 18
				+ "年齢は" + age + "歳です" + "\n" 
				// 170.5
				+ "身長は" + height + "cmです" + "\n" 
				// 62.2
				+ "体重は" + weight + "kgです" + "\n" 
				// 寿司
				+ "好きな食べ物は" + food + "です" + "\n"
				);
		
		//問7 上記変数を使用しBMI変数を宣言し演算結果を出力
		double bmi = weight / ((height / 100) * (height / 100));
		System.out.println("BMIは" + bmi + "です" + "\n");
		
		//問8 変数を再代入しコンソール出力
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		food = "オムライス";
		bmi = weight / ((height / 100) * (height / 100));
		
		// コンソール出力
		System.out.println(
				// 鈴木一郎
				  "初めまして" + name + "です" + "\n"
				// 24
				+ "年齢は" + age + "歳です" + "\n" 
				// 168.5
				+ "身長は" + height + "cmです" + "\n" 
				// 64.2
				+ "体重は" + weight + "kgです" + "\n" 
				// オムライス
				+ "好きな食べ物は" + food + "です" + "\n"
				// 22.6
				+ "BMIは" + String.format("%.1f", bmi) + "です" + "\n"
				);
		
		//問10 問8の年齢が25歳以上でtrueを表示
		boolean age2 = (age >= 25);
		System.out.println(age2 + "\n");
				
		//問11 問8の年齢・身長・体重を文字列型に型変換 
		String string_Age = String.valueOf(age);
		String string_Height = String.valueOf(height);
		String string_Weight = String.valueOf(weight);
		
		// コンソール出力 24 168.5 64.2
		System.out.println(string_Age + " " + string_Height + " " + string_Weight);
		
		//問12 問11の年齢・身長を整数型に型変換
		int int_Age = Integer.parseInt(string_Age);
		double double_height = Double.parseDouble(string_Height);
		int int_height = (int)double_height;
		
		// コンソール出力
		System.out.println(
				// 24
				int_Age + "\n" 
				// 168
				+ int_height + "\n"
				);
		
		//問13 問11で年齢が25もしくは身長が160cm以上でtrueを表示
		boolean age_height = (age >= 25 || height >= 160);
		System.out.println(age_height + "\n");
		
		//問9 問8変数の数値を和算で自己代入
		name = "鈴木一郎";
		age += age;
		height += height;
		weight += weight;
		food = "オムライス";
		bmi = weight / ((height / 100) * (height / 100));
		
		// コンソール出力
		System.out.println(
			// 鈴木一郎
			  "初めまして" + name + "です" + "\n" 
			// 48
			+ "年齢は" + age + "歳です" + "\n"
			// 337.0
			+ "身長は" + height + "cmです" + "\n" 
			// 128.4 
			+ "体重は" + weight + "kgです" + "\n" 
			// オムライス
			+ "好きな食べ物は" + food + "です" + "\n" 
			// 11.31
			+ "BMIは" + String.format("%.2f", bmi) + "です" + "\n"
		);
		
		
	}

}
