package curriculum1_22A;

// 処理用
public class Handler1_22 {
	// フィールド変数の宣言(カプセル化)
	private String greeting;
	private String country;
	private String food;
	private String foodType;
	
	/**
	 * Handler1_22メソッド
	 * 引数を2倍にして返す
	 * @param　checks 文字列型 配列
	 */
	public Handler1_22(String[] checks) {
		for(int i = 0; i < checks.length; i++) {
			// Nullチェック
			if(checks[i] == null) {
				System.exit(0);
			}
		}
		// インスタンス変数の参照
		this.greeting = checks[0];
		this.country = checks[1];
		this.food = checks[2];
		this.foodType = checks[3];
	}

	/**
	 * ゲッターの生成
	 * @return　フィールド変数
	 */
	public String getGreeting() {
		return greeting;
	}

	public String getCountry() {
		return country;
	}

	public String getFood() {
		return food;
	}

	public String getFoodType() {
		return foodType;
	}
	
}
