package curriculum1_23;

public class Main1_23 {

	public static void main(String[] args) {
		// インスタンス化
		Handler1_23 theme5 = new Handler1_23();
		
		// セッターに値を代入
		theme5.setAnimal("ライオン");
		theme5.setHeight(2.1);
		theme5.setSpeed(80);
		
		// コンソール出力
		System.out.println(
			"動物名：" + theme5.getAnimal() 
			+ "\n体長：" + theme5.getHeight() + "m"
			+ "\n速度：" + theme5.getSpeed() + "km/h"
		);

	}

}
