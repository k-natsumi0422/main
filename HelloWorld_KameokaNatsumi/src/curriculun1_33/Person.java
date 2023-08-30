package curriculun1_33;

class Person{
	// インスタンスフィールドを定義
	public static int count;
	public String firstName;
	public String lastName;
	public int age;
	public double height;
	public double weight;
	
	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String firstName, String lastName, int age, double height, double weight) {
		Person.count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// オーバーロード
	public Person(String lastName) {
		Person.count++;
		this.lastName = lastName;
	}

	// fullNameメソッドの定義
	public String fullName(){
		return this.firstName + this.lastName;
	}
	
	// bmiメソッドの定義
	public double bmi() {
		return this.weight / (height * height);
	}
	
	// printメソッドの定義
	public void print() {
		// コンソール出力
		System.out.println(
				"名前は" + this.fullName() + "です\n"
				+ "年は" + this.age + "です\n"
				+ "BMIは" + String.format("%.1f" , this.bmi()) + "です\n"
		);
	}

	// printCountメソッドの定義
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です\n");
	}
}
