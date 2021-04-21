package SeleniumSessionsMarch30;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

public class HashMapConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		// collection - dynamic
		// stores the value in Key and value format
		// can have only one null key.
		// can have any number of null values in it.

		Map<String, String> empMap = new HashMap<String, String>();

		empMap.put("name", "Tom");   //keyset
		empMap.put("ID", "101");
		empMap.put("city", "Bangalore");
		empMap.put("country", "India");
		empMap.put(null, "selenium");
		empMap.put(null, "QTP");
		empMap.put("phone", null);
		empMap.put("address", null);
		empMap.put("name", "Lisa");


		System.out.println(empMap.get("name"));
		System.out.println(empMap.get(null));
		System.out.println(empMap.get("phone"));

		//to iterate the hashmap:
		//entryset: to fetch all key-values.
		for(Map.Entry<String, String> entry: empMap.entrySet()) {
			System.out.println("Key = " + entry.getKey() + "value =" +entry.getValue() );
		}
		
		
		//keyset(): for getting the keys
		for(String s : empMap.keySet()) {
			System.out.println("Key = " + s);
		}
		
		
		//values() ; for getting the values
		
		for(String v : empMap.values()) {
			System.out.println("values = "+ v);
		}
		
		//Lambda
		empMap.forEach((k,v) -> System.out.println("key = " + k + " value = " + v));
		
		
		
		Map<String, Integer> map1 = new HashMap<String, Integer>();

		map1.put("A", 1);
		map1.put("B", 2);
		map1.put("C", 3);

	}

}
