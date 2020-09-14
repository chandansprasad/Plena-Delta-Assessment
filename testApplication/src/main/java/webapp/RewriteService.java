package webapp;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class RewriteService {
	// function to rewrite the string based on the occurence 
	public String rewrite(String name2) {
		String res = "";
		

		String name = name2.toLowerCase();

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < name.length(); i++) {
			map.put(name.charAt(i), map.getOrDefault(name.charAt(i), 0) + 1);
		}
		
		char[][] st = new char[name.length()][2];
		int j = 0;
		for (int i = 0; i < name2.length(); i++) {
			char im = name2.charAt(i);
			st[i][0] = im;
			st[i][1] = (char) (map.get(Character.toLowerCase(im)) + '0');
		}

		Arrays.sort(st, (a, b) -> a[1] - b[1]);
		
		for (int i = 0; i < st.length; i++) {

			res = res + st[i][0];

		}
		return res;
	}
	
	
	// function to find the first non repeating char
	public String first(String name) {
		String res = "";
		char firstChar = 0;

		name = name.toLowerCase();

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < name.length(); i++) {
			map.put(name.charAt(i), map.getOrDefault(name.charAt(i), 0) + 1);
		}
		for (int i = 0; i < name.length(); i++) {
			if (map.get(name.charAt(i)) == 1) {
				firstChar = name.charAt(i);
				break;
			}
		}
		res = res + firstChar;
		return res;

	}

}
