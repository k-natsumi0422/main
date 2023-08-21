package curriculum1_29B;

import java.util.HashMap;

public class PrefecturesData1_29 {
	public void InputData(Integer[] input) {
		
		// 都道府県データの定義
			HashMap<Integer, String[]> prefData = new HashMap<Integer, String[]>();
			prefData.put(0 , new String[] {"北海道" , "札幌市" , "83424"});
			prefData.put(1 , new String[] {"青森県" , "青森市" , "9646"});
			prefData.put(2 , new String[] {"岩手県" , "盛岡市" , "15275"});
			prefData.put(3 , new String[] {"宮城県" , "仙台市" , "7282"});
			prefData.put(4 , new String[] {"秋田県" , "秋田市" , "11638"});
			prefData.put(5 , new String[] {"山形県" , "山形市" , "9323"});
			prefData.put(6 , new String[] {"福島県" , "福島市" , "13784"});
			prefData.put(7 , new String[] {"茨城県" , "水戸市" , "6097"});
			prefData.put(8 , new String[] {"栃木県" , "宇都宮市" , "6408"});
			prefData.put(9 , new String[] {"群馬県" , "前橋市" , "6362"});
			prefData.put(10 , new String[] {"埼玉県" , "さいたま市" , "3798"});
		
		// コンソール出力
		for(int prefNum : input) {
			String[] prefInfo = prefData.get(prefNum);
			System.out.println(
				"都道府県名：" + prefInfo[0]
				+ "\n県庁所在地：" + prefInfo[1]
				+ "\n面積：" + (String.format("%.1f", Double.parseDouble(prefInfo[2]))) + "km2\n"
			);
		}
	}	
}
