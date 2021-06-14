package com.collections.map.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolutionService {

	//private static int[] INPUT = { 1, 2, 3, 4, 5, 6, 7, 8, 9, -9, -10, 19 }; // sum = 18
	private static int[] INPUT = { 6,6,6,6 };
	
	private static List<List<Integer>> result;

	private static Map<Integer, List<Pair>> map = new HashMap<>();

	public static void main(String[] args) {
		SolutionService service = new SolutionService();
		Arrays.sort(INPUT);
		service.createCountMap(INPUT);
		result = new ArrayList<>();
		service.getQuadrupletsForSum(INPUT, 24, 0, new ArrayList<>());
		System.out.println(result);
		result = new ArrayList<>();
		service.getQuadrupletsForSumBetter(INPUT, 24);
		System.out.println(result);
	}
	
	private void getQuadrupletsForSum(int[] input, int sum, int start, List<Integer> quadruplets) {

		int size = input.length;

		for (int i = start; i < size; i++) {
			List<Integer> quadrupletsTemp = new ArrayList<>(quadruplets);
			quadrupletsTemp.add(input[i]);
			int diff = sum - input[i];
			if (diff == 0 && quadrupletsTemp.size() == 4) {
				result.add(quadrupletsTemp);
				continue;
			} else if((diff == 0 && quadrupletsTemp.size() < 4)  || quadrupletsTemp.size() > 4) {
				
			}
			getQuadrupletsForSum(input, diff, i + 1, quadrupletsTemp);
		}
		return;
	}

	private void createCountMap(int[] input) {
		for (int i=0; i<input.length; i++) {
			for (int j=i+1; j<input.length; j++) {
                if(map.containsKey(input[i]+input[j])) {
                    map.get(input[i]+input[j]).add(new Pair(i, j));
                } else {
                    List<Pair> list = new ArrayList<>();
                    list.add(new Pair(i, j));
				    map.put(input[i]+input[j], list);
                }
			}
		}
	}

	private void getQuadrupletsForSumBetter(int[] input, int sum) {

		int size = input.length;

        Map<String, Integer> temp = new HashMap<>();
        
		for (int i = 0; i < size; i++) {
			for (int j = i+1; j < size; j++) {
				
				Integer diff = sum - (input[i] + input[j]);
				if (map.containsKey(diff)) {
					List<Pair> lookups = map.get(diff);
                    
                    for (Pair lookup : lookups) {
					    List<Integer> ans = new ArrayList<>();
            
                        if (lookup.x != i && lookup.x != j && lookup.y != i && lookup.y != j) {
                            ans.add(input[i]);
					        ans.add(input[j]);
					        ans.add(input[lookup.x]);
					        ans.add(input[lookup.y]);
                            Collections.sort(ans);
                            String key = ans.toString();
                            if(!temp.containsKey(key)) {
					            result.add(ans);
                                temp.put(key, 1);
                            }
                      }
                    }
				}
			}
		}
		return;
	}
	
	private static class Pair {
		
		private int x;
		
		private int y;
		
		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}
