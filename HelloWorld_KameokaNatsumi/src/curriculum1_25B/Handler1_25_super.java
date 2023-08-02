package curriculum1_25B;

public class Handler1_25_super {
	// フィールド変数の宣言(カプセル化)
	private String name;
	private int hp;
	private int mp;
	private int power;
	private int speed;
	private int defence;
	
	// コンストラクタの生成
	public Handler1_25_super() {
	}
	
	/**
	 * ゲッターの生成
	 * @return　フィールド変数
	 */
	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public int getMp() {
		return mp;
	}

	public int getPower() {
		return power;
	}

	public int getSpeed() {
		return speed;
	}

	public int getDefence() {
		return defence;
	}

	// セッター
	public void setName(String name) {
		this.name = name;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}
	
	
	
	
}
