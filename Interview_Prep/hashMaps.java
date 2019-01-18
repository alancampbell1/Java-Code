/*
	Hashmap in Java:
	A way of storing data using key value pairs, i.e. (key, value).
	To access a value one must know its key.
	HashMap is known as HashMap because it uses a technique called Hashing.
	Hashing is a technique of converting a large String to a small String that
	represents the same String.
	Shorter Strings mean indexing and faster searches.

	HashMap is part of the java.util.package.
	It does not allow duplicate keys but allows duplicate values. 
*/

import java.util.HashMap;
import java.util.Map;
public class hashMaps{
	public static void main(String [] args){
		
		//Declaring an empty HashMap
		//Similar to an ArrayList, you do not need to declare a size
		HashMap<String, Integer> myMap = new HashMap<>();
		//keys and values 'put' onto the HashMap
		myMap.put("Alan", 1);
		myMap.put("Niall", 2);
		myMap.put("Martina", 3);
		myMap.put("Grace", 4);

		//the size() method returns the size of the HashMap
		System.out.println("The size of this HashMap is " + myMap.size());

		//To print a specific value you use the get() method with the key
		System.out.println(myMap.get("Alan"));

		//To see all keys and values, you simply print the HashMap
		System.out.println(myMap);

		//use the remove() and specified key to remove key/value
		myMap.remove("Alan");
		System.out.println(myMap);

		//To update a specific value use the put() function and key name
		myMap.put("Grace", 5);
		System.out.println(myMap);

		/*
		NOTE: You cannot edit an existing key name. Instead, delete the 
		key/value and add it again with the updated new key name
		*/
	}
}