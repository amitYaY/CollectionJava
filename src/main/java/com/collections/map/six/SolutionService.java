package com.collections.map.six;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SolutionService {
	
	private static int[] INPUT_1 = { 1, 2, 3, 4 };
	
	private static int[] INPUT_2 = { 5, 6, 7 };

	public static void main(String[] args) {
		SolutionService service = new SolutionService();
		int result = service.removeMinimalCommonElements(INPUT_1, INPUT_2);
		System.out.println("Minimum Count: "+result);

	}
	
	private int removeMinimalCommonElements(int[] arr1, int[] arr2) {
		
		int result = 0;
		
		Map<Integer, Integer> map1 = new HashMap<>();
		Map<Integer, Integer> map2 = new HashMap<>();
		
		int len1 = arr1.length;
		int len2 = arr2.length;
		
		for(int i=0; i<len1; i++) {
			if (map1.containsKey(arr1[i])) {
				map1.put(arr1[i], map1.get(arr1[i])+1);
			} else {
				map1.put(arr1[i], 1);
			}
		}
		
		for(int i=0; i<len2; i++) {
			if (map2.containsKey(arr2[i])) {
				map2.put(arr2[i], map2.get(arr2[i])+1);
			} else {
				map2.put(arr2[i], 1);
			}
		}
		
		Set<Integer> keySet = map1.keySet().size() > map2.keySet().size() ? map2.keySet() : map1.keySet();
		
		for (Integer i : keySet) {
			Integer count1 = map1.get(i);
			Integer count2 = map2.get(i);
			if (count1 != null && count2 != null ) {
				int diff = count1 - count2;
				if(diff == 0) {
					result += count1;
				} else if (diff > 0) {
					result += count2;
				} else {
					result += count1;
				}
			}
		}
		return result;
	}

}
