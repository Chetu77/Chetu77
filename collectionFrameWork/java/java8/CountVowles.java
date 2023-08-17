package java8;

import java.util.HashSet;
import java.util.Iterator;


class AlphaMethod {
	public static int uniqueVowel(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				count++;
				System.out.println(count);
			}
		}
		return count;
	}
	// count=>e,o,e->3

	public static int uniqueConsonant(String str) {

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o'
					&& str.charAt(i) != 'u' && str.charAt(i) != ' ') {

				count++;
			}
		}
		return count;
	}
	// count->w,l,c,m->4

	public static String uniqueCharacters(String str) {
		String uniqString = "";
		HashSet<Character> set = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		System.out.println("Set: "+set);
		Iterator<Character> itr = set.iterator();
		while (itr.hasNext()) {
			uniqString += itr.next();
		}
		return uniqString;
	}
}

public class CountVowles {
	public static void main(String[] args) {
		String str = "welcome tooo Javavava";
		int vowelCount = AlphaMethod.uniqueVowel(AlphaMethod.uniqueCharacters(str));
		System.out.println("Vowel in the string are : " + vowelCount);

		int consonantCount = AlphaMethod.uniqueConsonant(AlphaMethod.uniqueCharacters(str));
		System.out.println("Consonant in the string are : " + consonantCount);
	}
	
	
}