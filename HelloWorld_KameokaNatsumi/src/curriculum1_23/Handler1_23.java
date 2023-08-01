package curriculum1_23;

public class Handler1_23 {
	// フィールド変数の宣言(カプセル化)
	private String animal;
	private double height;
	private int speed;
	
	/**
	 * ゲッターの生成
	 * @return　フィールド変数
	 */
	public String getAnimal() {
		return animal;
	}
	public double getHeight() {
		return height;
	}
	public int getSpeed() {
		return speed;
	}
	
	// セッター
	void setAnimal(String animal) {
		this.animal = animal;
	}
	void setHeight(double height) {
		this.height = height;
	}
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
