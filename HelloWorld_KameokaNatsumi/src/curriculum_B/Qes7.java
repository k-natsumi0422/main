package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// インスタンス化
		Scanner scn = new Scanner(System.in);
		String[] subjects = {"英語" , "数学" , "理科" , "社会"};
		int subject = subjects.length;
		double sum2 = 0;
		
		System.out.print("生徒の人数を入力してください(2以上):");
		int student = scn.nextInt();
		
		// 生徒の人数　教科数
		int[][] scores = new int[student] [subject];
		
		
		// 点数入力
		for(int i =0; i < student; i++) {
			for(int j =0; j < subject; j++) {
				System.out.print((i + 1) + "人目の『" + subjects[j] + "』の点数を入力してください：");
				scores[i][j]= scn.nextInt();
			}
		}
		
		// 1人ずつの平均点の表示	
		for(int i = 0; i < student; i++) {
			double sum = 0;
			
			for(int j : scores[i]) {
				sum += j;
			}
			
			String avg = String.format("%.2f",(sum / subject));
			System.out.println((i+1) +  "人目の平均点は" + avg + "点です。");
				
			// 人数分の平均点の格納
			sum2 += sum / subject;
		}
		
		System.out.println();
		
		// 各教科の平均点の表示
		for(int i = 0; i < subject; i++) {
			double sum = 0;
			
			for(int j = 0; j < student; j++) {
				sum += scores[j][i];
			}
			
			String avg = String.format("%.2f",(sum / student));
			System.out.println(subjects[i] +  "の平均点は" + avg + "点です。");
		}
		

		// 全体の平均点の表示
		String avg = String.format("%.2f",(sum2 / student));
		System.out.println("全体の平均点は" + avg + "点です。");
		
		// スキャナー閉じる
		scn.close();
		}
		
}
