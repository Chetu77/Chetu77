package java8;

import java.util.HashMap;

public class HashMapEx2 {

	public static void main(String[] args) {
		char arr[] = { 'a', 's', 'd', 'f', 'a', 'd', 'e', 'a', 's', 'a' };
		HashMap<Character, Integer> hm = countChar(arr);
		System.out.println(hm);

	}

	static HashMap<Character, Integer> countChar(char ar[]) {
		HashMap<Character, Integer> hm = new HashMap<>();
		for (char c : ar) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1); // if same key comes,count increment by 1
			} else
				hm.put(c, 1);
		}
		return hm;

	}
}
