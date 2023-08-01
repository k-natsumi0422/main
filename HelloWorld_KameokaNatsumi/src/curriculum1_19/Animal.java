package curriculum1_19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		// インスタンスの生成
		Dog dog = new Dog();
		
		// 犬
		System.out.println(dog.animalName);
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		// インスタンスの生成
		Dog dog2 = new Dog(4);
		
		//　4
		System.out.println(dog2.numberOfAnimal);
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		// SimpleDateFormatクラスを使用してフォーマットを指定
		SimpleDateFormat dateTime = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		
		// 現在時刻
		System.out.println(dateTime.format(new Date()));
	}
}
