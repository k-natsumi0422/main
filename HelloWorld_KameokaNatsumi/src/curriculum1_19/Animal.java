package curriculum1_19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog animals = new Dog("犬" , 4); 
		System.out.println(animals.animalName + "\n" + animals.numberOfAnimal);
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		System.out.println(time.format(new Date()));
	}
}
