import java.util.ArrayList;

public class Anagram {

	public static boolean isAnagram(String string, String string2) {
		// TODO Auto-generated method stub
		ArrayList<Character> list1 = new ArrayList<>();
		ArrayList<Character> list2 = new ArrayList<>();
		for (char c : string.toCharArray()) {
			Character.toLowerCase(c);
			if (Character.isAlphabetic(c)) {
				list1.add(c);
			}

		}
		for (char c : string2.toCharArray()) {
			Character.toLowerCase(c);
			if (Character.isAlphabetic(c)) {
				list2.add(c);
			}

		}
		list2.sort(null);
		list1.sort(null);
		return list1.equals(list2);
	}

}
