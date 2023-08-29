package curriculum1_32;

class Person{
	// インスタンスフィールドを定義
	public static int count;
	public String name;
	public int age;
	public double height;
	public double weight;
	
	// bmiメソッドの定義
	public double bmi() {
		return this.weight / (height * height);
	}
	
	// printメソッドの定義
	public void print() {
		// コンソール出力
		System.out.println(
				"名前は" + this.name + "です\n"
				+ "年は" + this.age + "です\n"
				+ "BMIは" + String.format("%.1f" , this.bmi()) + "です\n"
		);
		
	}
	
	// printCountメソッドの定義
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です\n");
	}

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight) {
		Person.count++;
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
}
