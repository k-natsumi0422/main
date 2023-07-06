package curriculum_A;

public class Qes1_13 {
	public static void main(String[] args) {
		
		// 問1 変数の宣言
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		char c;
		String text;
		boolean type;
		
		// 問2 変数の初期化
		b    = 0;
		s    = 0;
		i    = 0;
		l    = 0L;
		f    = 0.0f;
		d    = 0.0d;
		c    = '\u0000';
		text = null;
		type = false;
		
		// 問3 値の代入
		b    = 10;
		s    = 100;
		i    = 1000;
		l    = 10000L;
		f    = 9.5f;
		d    = 10.5d;
		c    = 'a';
		text = "ハロー";
		type = true;
		
		// 問4 上記変数を使用し、コンソール出力
		// 11110
		System.out.println(b + s + i + l);
		// 20
		System.out.println(b * 2);
		// aハローtrue
		System.out.println(c + text + type);
		// 11130
		System.out.println((int)(b + s + i + l + f + d));
		// 10000000000
		System.out.println(b * s * i * l);
		// 0.105
		System.out.println(d / s);
		// -90
		System.out.println(b - s + "\n");
		
		
		// 問5 修正問題 String型からint型へ修正
		String num  = "20";
		int    num1 = 23;
		
		// コンソール出力 ハローJAVA43
		System.out.println("ハローJAVA" + (num1 + Integer.parseInt(num)) + "\n");
		
		// 問6 変数宣言 初期化 値の代入 
		String name   = "山田太郎";
		int    age    = 18;
		double height = 170.5;
		double weight = 62.2;
		String food   = "寿司";
		
		// コンソール出力
		System.out.println(
			  // 山田太郎
			  "初めまして" + name + "です\n"
			  // 18
			+ "年齢は" + age + "歳です\n" 
			  // 170.5
			+ "身長は" + height + "cmです\n" 
			  // 62.2
			+ "体重は" + weight + "kgです\n" 
			  // 寿司
			+ "好きな食べ物は" + food + "です\n"
		);
		
		// 問7 上記変数を使用しBMI変数を宣言し演算結果を出力
		double bmi = weight / ((height / 100) * (height / 100));
		
		// コンソール出力 21.4
		System.out.printf("BMIは%.1fです\n\n" , bmi);
		
		// 問8 変数を再代入しコンソール出力
		name   = "鈴木一郎";
		age    = 24;
		height = 168.5;
		weight = 64.2;
		food   = "オムライス";
		// BMIの計算
		bmi    = weight / ((height / 100) * (height / 100));
		
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
		
		// 問9 問8変数の数値を和算で自己代入
		name    = "鈴木一郎";
		food    = "オムライス";
		// 自己代入
		age    += age;
		height += height;
		weight += weight;
		// BMIの計算
		bmi     = weight / ((height / 100) * (height / 100));
				
		// コンソール出力
		System.out.println(
			  // 鈴木一郎
			  "初めまして" + name + "です\n" 
			  // 48
			+ "年齢は" + age + "歳です\n"
			  // 337.0
			+ "身長は" + height + "cmです\n" 
			  // 128.4 
			+ "体重は" + weight + "kgです\n" 
			  // オムライス
			+ "好きな食べ物は" + food + "です\n" 
			  // 11.31
			+ "BMIは" + String.format("%.2f", bmi) + "です\n"
		);
		
		// 問10 問8の年齢が25歳以上でtrueを表示
		age = 24;
		boolean age2 = (age >= 25);
		
		// コンソール出力 false
		System.out.println(age2 + "\n");
				
		// 問11 問8の年齢・身長・体重を文字列型に型変換
		height = 168.5;
		weight = 64.2;
		
		String stringAge = String.valueOf(age);
		String stringHeight = String.valueOf(height);
		String stringWeight = String.valueOf(weight);
		
		// コンソール出力 24 168.5 64.2
		System.out.println(stringAge + " " + stringHeight + " " + stringWeight);
		
		// 問12 問11の年齢・身長を整数型に型変換
		int intAge = Integer.parseInt(stringAge);
		double doubleHeight = Double.parseDouble(stringHeight);
		int intHeight = (int)doubleHeight;
		
		// コンソール出力
		// 24 168
		System.out.println(intAge + "\n" + intHeight + "\n");
		
		// 問13 問11で年齢が25もしくは身長が160cm以上でtrueを表示
		boolean ageHeight = (age >= 25 || height >= 160);
		// コンソール出力 true
		System.out.println(ageHeight + "\n");
		
		
	}

}
