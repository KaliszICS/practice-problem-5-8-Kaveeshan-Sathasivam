/* File: Practice Problem 5.8
Author: Kaveeshan
Date Created: May 19 2026
Date Last Modified: May 19 2026
*/




import java.util.ArrayList;
import java.util.HashMap;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static HashMap<String, Integer> combineParallelArrays(String[] names, int[] ages) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < names.length; i++) {
			map.put(names[i], ages[i]);
		}

		return map;
	}

	public static void increaseAge(HashMap<String, Integer> map, String name) {
		if (map.containsKey(name)) {
			int age = map.get(name);
			map.put(name, age + 1);
		}
	}

	public static void replaceName(HashMap<String, Integer> map, String oldName, String newName) {
		if (map.containsKey(oldName)) {
			int value = map.get(oldName);
			map.remove(oldName);
			map.put(newName, value);
		}
	}

}
