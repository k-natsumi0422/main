package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// scnは配列のようなもの？　Scannerクラスにあるクラス変数とメソッドが代入されてる　それ以外はscnにはいらん		
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		String[] homeAppliance = scn.nextLine().split("、");
		
		for(String stock : homeAppliance) {
			// 入力された値が配列に該当する商品のみ出力→全部出力出来たらループ終わり
			int stockCount = rnd.nextInt(11);
			
			switch(stock) {
			// ①"パソコン" , "冷蔵庫" , "扇風機", "洗濯機" , "加湿器"のときは在庫数だけ表示
			// ②テレビかディスプレイのとき　テレビは在庫数　ディスプレイは11からランダムの数引いたときの数	
			// ③入力された値が上記配列以外の時はエラーメッセージ出す
				case "パソコン" , "冷蔵庫" , "扇風機", "洗濯機" , "加湿器":
					System.out.println(stock + "の残り台数は" + stockCount + "台です\n");
					break;
				case "テレビ" , "ディスプレイ":
					System.out.println(
						stock + "の残り台数は" 
						+ (stock.equals("ディスプレイ") ? 11 - stockCount : stockCount)
						+ "台です\n"
					);
					break;
				default:
					System.out.println("『" + stock + "』は指定の商品ではありません\n");
			}
			
		}
		
		scn.close();
	}
}
