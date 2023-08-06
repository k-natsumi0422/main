package curriculum1_27B;

public class Handler1_27_super {
	
//	フィールド変数の宣言
//	ゲッターセッター
//	（コンストラクター）
	
	
	// フィールド変数の宣言
	private String name;
	private double height;
	private int speed;
	public String scientificName;
	
	
	/**
	 * ゲッターの生成
	 * @return　フィールド変数
	 */
	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}
	public int getSpeed() {
		return speed;
	}
	public String getScientificName() {
		return scientificName;
	}
	
	// セッター
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

}
