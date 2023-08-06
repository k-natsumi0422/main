package curriculum1_25B;

public class Status1_25_super {
	// フィールド変数の宣言(カプセル化)
	private String name;
	private int hp;
	private int mp;
	private int power;
	private int speed;
	private int defence;
	
	// コンストラクタの生成
	public Status1_25_super() {
	}
	
	/**
	 * ゲッターの生成
	 * 空白なし 10文字以内 半角英数字
	 * @return　フィールド変数
	 */
	public String getName() {
		return name;
	}

	/**
	 * ゲッターの生成
	 * ランダム整数の設定
	 * @return　フィールド変数
	 * hp mp power speed defence
	 */
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

	/**
	 * セッターの生成
	 * 空白なし 10文字以内 半角英数字
	 * @return　フィールド変数 受け取り
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * セッターの生成
	 * ランダム整数の設定
	 * @return　フィールド変数 受け取り
	 * hp mp power speed defence
	 */
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
