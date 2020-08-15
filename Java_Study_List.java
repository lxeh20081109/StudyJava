package Study;

import java.util.HashMap;
import java.util.Map;

public class Java_Study_List {
		public static void main(String[] args){
			Map<String,String> map = new HashMap<String,String>();
			map.put("9984", "ソフトバンク");
			map.put("8473", "SBI");
			map.put("4755", "楽天");
			
			for(String key: map.keySet()){
				String value = map.get(key);
				System.out.println(key + "=" + value);
			}
		}
}
/*
 *8473=SBI
 *9984=ソフトバンク
 *4755=楽天 
 * 
 */


