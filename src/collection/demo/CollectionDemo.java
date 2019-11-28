package collection.demo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionDemo {

	
	
	public static void main(String[] args) {
		
		//Way1
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		//Way2
		List<Integer> list2 = Arrays.asList(10,20,30);
		
		//Way3
		List<Integer> list3 = new ArrayList<Integer>(){{
			add(10);
			add(20);
			add(30);
		}};
	}
}
