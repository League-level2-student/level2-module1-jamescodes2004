package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		
		ArrayList<String> names = new ArrayList<String>();
		//2. Add five Strings to your list
		names.add("Arman Dahi");
		names.add("Graham Winter");
		names.add("James Ward");
		names.add("Tom Brady");
		names.add("Joe Mama");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < names.size(); i++) {
			String s = names.get(i);
			System.out.println(s);
		}
		//4. Print all the Strings using a for-each loop
		for (String s: names) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < names.size(); i++) {
			if(i%2==0) {
			String s = names.get(i);
			System.out.println(s);}
		}
		//6. Print all the Strings in reverse order.
			for (int j = names.size()-1; j >= 0; j--) {
			String s = names.get(j);
			System.out.println(s);
			}
		//7. Print only the Strings that have the letter 'e' in them.
			for (int i = 0; i < names.size(); i++) {
				String s = names.get(i);
				if(s.contains("e")) {
				System.out.println(s);}
			}
}
}