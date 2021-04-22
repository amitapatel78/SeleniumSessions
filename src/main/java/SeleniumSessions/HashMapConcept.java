package SeleniumSessions;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {
public static void main(String[] args) {

		
		//collection -- dynamic
		//stores values -K,V
		//can have only one null key
		//can have any number of null values
		
		Map<String, String> empMap = new HashMap<String, String>();
		empMap.put("name", "Tom");
		empMap.put("ID", "101");
		empMap.put("city", "Bangalore");
		empMap.put("Country", "IN");
		empMap.put(null, "selenium");
		empMap.put(null, "QTP"); // Only one Null key allowed so it will not give any error but as a result it will print latest value - ex= QTP
		empMap.put("phone", null);
		empMap.put("address", null);
		empMap.put("name", "Lisa");

		
		System.out.println(empMap.get("name"));// need to pass Key name
		System.out.println(empMap.get(null)); // will get 'Selenium'
		System.out.println(empMap.get("phone"));
		System.out.println(empMap.get("phone").length()); // will give you  nullpointer exception
		
//		Map<String, Integer> empMap1 = new HashMap<String, Integer>();
//		empMap1.put("A", 1);
//		empMap1.put("B", 1);
//		empMap1.put("C", 1);
		
		//to iterate map:
		//entryset: to fetch all key-values:
		for(Map.Entry<String, String> entry : empMap.entrySet()) {
			System.out.println("Key = " + entry.getKey() + " value = " + entry.getValue());
		}
		
		//keySet(): for getting the keys
		for(String s : empMap.keySet()) { 
			System.out.println("Key = " + s); // will print collection of all the keys
		}
		
		//values(): for getting the values
		for(String v : empMap.values()) {
			System.out.println("value = " +v); // will print collection of all the values
		}
		
		//Lambda:
		empMap.forEach((k,v) -> System.out.println("Key = " + k + " value = " +v));


		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("A", 1);
		map1.put("B", 2);
		map1.put("C", 3);
		
		

		
		
	}

}
