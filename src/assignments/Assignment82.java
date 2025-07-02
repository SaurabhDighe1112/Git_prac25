/*
 * WAP to remove all duplicate occurrence of Krishna apart from first occurance
 * input: String[] arr ={"Hetal", "Techno", "Krishna", "Credits", "Krishna", "Techno", "Krishna", "Krishna", "Techno"};
 */

package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment82 {
	void removeFirstOccurenceFromArray(String str, String[] arr) {
		List<String> list = new ArrayList<String>(Arrays.asList(arr));
		while(list.indexOf(str)!=list.lastIndexOf(str)) {
			list.remove(list.lastIndexOf(str));
		}
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		String[] arr ={"Hetal", "Techno", "Krishna", "Credits", "Krishna", "Techno", "Krishna", "Krishna", "Techno"};
		new Assignment82().removeFirstOccurenceFromArray("Krishna", arr);
	}
}
