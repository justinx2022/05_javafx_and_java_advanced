package com.adse2509.sess01_java_util_apis;
import java.util.ArrayList;
import java.util.List;


/**
 * Java class that demonstrates some of the concrete classes that implement
 * the list interface from the java.util package and some of its methods
 * 
 * @author odhia
 */
public class ListDemo {
	
	public static void main(String[] args) {
	// Create a list of fruits
	List<String> fruits = new ArrayList<>();
	
	// Add Fruits to the fruits list
	fruits.add("Avocado");
	fruits.add("Watermelon");
	fruits.add("Banana");
	fruits.add("Apple");
	fruits.add("PawPaw");
	fruits.add("Pineapple");
	fruits.add("Kiwi");
	fruits.add("Mango");
	fruits.add("Passion");
	fruits.add("Grapes");
	fruits.add("Guava");
	fruits.add("Strawberries");
	fruits.add("Orange");
	fruits.add("Lemon");
	fruits.add("Apricot");
	fruits.add("Dragon Fruit");
	fruits.add("Thorn Melon");
	fruits.add("Sweet Melon");
	fruits.add("Blueberries");
	fruits.add("Cherries");
	fruits.add("Peaches");
	fruits.add("Pomegranet");
	
	// Display the above fruits using for loop
	for (String fruit: fruits)
		System.out.println(fruit);
	
	}
	
	// Create a list of students from the classes package
	List<Student> javaStudents= new ArrayList<>();
	
	// Enroll Students to the Java class
}
