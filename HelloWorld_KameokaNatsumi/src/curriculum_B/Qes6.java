package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		
		// インスタンス化
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		
		String[] homeAppliance = scn.nextLine().split("、");
		
		
		// 入力された値が配列に該当する商品のみ出力
		for(String stock : homeAppliance) {
			int stockCount = rnd.nextInt(11);
			
			switch(stock) {
			
				// ①パソコン,冷蔵庫,扇風機,洗濯機,加湿器のとき 在庫数だけ表示
				case "パソコン" , "冷蔵庫" , "扇風機", "洗濯機" , "加湿器":
					System.out.println(stock + "の残り台数は" + stockCount + "台です\n");
					break;
					
				// ②テレビ,ディスプレイのとき	
				case "テレビ" , "ディスプレイ":
					// テレビは在庫数　ディスプレイは11からランダムの数引いたときの数を表示
					System.out.println(
						stock + "の残り台数は" 
						+ (stock.equals("ディスプレイ") ? 11 - stockCount : stockCount)
						+ "台です\n"
					);
					break;
					
				// ③入力された値が上記配列以外のとき エラーメッセージ出す
				default:
					System.out.println("『" + stock + "』は指定の商品ではありません\n");
			}
		}
		
		// スキャナー閉じる
		scn.close();
	}
}
