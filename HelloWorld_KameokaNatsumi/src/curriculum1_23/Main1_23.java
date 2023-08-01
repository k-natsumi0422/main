package curriculum1_23;

public class Main1_23 {

	public static void main(String[] args) {
		// インスタンス化
		Handler1_23 handler1_23 = new Handler1_23();
		
		// セッターに値を代入
		handler1_23.setAnimal("ライオン");
		handler1_23.setHeight(2.1);
		handler1_23.setSpeed(80);
		
		// コンソール出力
		System.out.println(
			"動物名：" + handler1_23.getAnimal() 
			+ "\n体長：" + handler1_23.getHeight() + "m"
			+ "\n速度：" + handler1_23.getSpeed() + "km/h"
		);

	}

}
