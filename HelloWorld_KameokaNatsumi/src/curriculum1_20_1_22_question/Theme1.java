package curriculum1_20_1_22_question;

// 処理用
public class Theme1 {
	// フィールド変数の宣言(カプセル化)
	private String greeting;
	private String country;
	private String food;
	private String foodType;
	
	// コンストラクタ
	public Theme1(String greeting, String country, String food, String foodType) {
		this.greeting = greeting;
		this.country = country;
		this.food = food;
		this.foodType = foodType;
	}

	// ゲッター
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
