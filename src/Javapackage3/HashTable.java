package Javapackage3;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {

	public static void main(String[]ars) {
		Hashtable <Integer,String> T=new Hashtable <Integer, String>();
		
		T.put(101,"Ram");
		T.put(102, "Krishna");
		T.put(103,"Dinesh");
		T.put(104,"Raj");
		
		System.out.println(T);  //{104=Raj, 103=Dinesh, 102=Krishna, 101=Ram}
		System.out.println(T.get(103));   //Dinesh
		System.out.println(T.containsKey(102)); //true
		System.out.println(T.contains(105)); //false
		System.out.println(T.containsValue("Raj")); //true
		System.out.println(T.containsValue("Sham"));  //false 
		System.out.println(T.isEmpty()); //it return true if data present  else false
		System.out.println(T.keySet()); // it return all keys from table
		System.out.println(T.values()); // it return  all values
		
		//Entry specific method
		
		for(Map.Entry entry:T.entrySet()) {
			System.out.println(entry.getKey()+ "  "+entry.getValue());
		}
	}
}
