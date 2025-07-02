/*
 * WAP to return 3rd Highest number from given array
 */

package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Assignment87 {
	//Using Collections FW considering duplicates not allowed
	int thirdHighestNumByCollectionwithoutDuplicates(Integer[] arr) {
		Set<Integer> list = new TreeSet<Integer>(Arrays.asList(arr));
		List<Integer> ls1 = new ArrayList<Integer>();
		ls1.addAll(list);
		
		return (ls1.get(ls1.size()-3));
	}
	
	//Using Arraylist and removing duplicates method
	int thirdHighestNumByCollectionwithDuplicates(Integer[] arr) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		Collections.sort(list);
		for(int i=0; i<list.size();i++) {
			if(list.indexOf(list.get(i))!=list.lastIndexOf(list.get(i)))
				list.remove(list.lastIndexOf(list.get(i)));
		}
		
		return list.get(list.size()-3);
	}
	
	public static void main(String[] args) {
		Integer[] arr = {10,20,4,8,2,88,99,56,77,99,88};
		Assignment87 assignment87 = new Assignment87();
		System.out.println(assignment87.thirdHighestNumByCollectionwithoutDuplicates(arr));
		System.out.println(assignment87.thirdHighestNumByCollectionwithDuplicates(arr));		
	}
}
