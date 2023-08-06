package curriculum1_27A;

import curriculum1_27B.Handler1_27_sub;

public class Main1_27 {

	public static void main(String[] args) {
		Handler1_27_sub handler1_27_sub = new Handler1_27_sub();
		System.out.println("コンソールに文字を入力してください");
		handler1_27_sub.animalData();
		
		System.out.println(
				"動物名：" + handler1_27_sub.getName()
				+ "\n体長：" + handler1_27_sub.getHeight() + "m"
				+ "\n速度：" + handler1_27_sub.getSpeed() + "km/h"
				+ "\n学名：" + handler1_27_sub.getScientificName()
				
		);
		
//		handler1_27_super.setName();
//		handler1_27_super.setHeight(Double.parseDouble());
//		handler1_27_super.setSpeed((int) Double.parseDouble());
//		handler1_27_super.setScientificName("");
		
	}

}
