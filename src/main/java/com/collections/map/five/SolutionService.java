package com.collections.map.five;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolutionService {

	private static Integer[] INPUT = { 1, 2, 3, 4, 5, 6, 7, 8, 9, -9, -10, 19 };
	//private static Integer[] INPUT = { 6,6,6,6 };
	
	private List<List<Integer>> result = new ArrayList<>();

	private static Map<Integer, Integer> map = new HashMap<>();

	public static void main(String[] args) {
		SolutionService service = new SolutionService();
		service.createCountMap(INPUT);
		service.getQuadrupletsForSum(INPUT, 18, 0, new ArrayList<>());
		System.out.println(service.result);
	}

	private void createCountMap(Integer[] input) {
		for (Integer in : input) {
			if (!map.containsKey(in)) {
				map.put(in, 1);
			} else {
				map.put(in, map.get(in) + 1);
			}
		}
	}

	private void getQuadrupletsForSum(Integer[] input, int sum, int start, List<Integer> quadruplets) {

		int size = input.length;

		for (int i = start; i < size; i++) {
			List<Integer> quadrupletsTemp = new ArrayList<>(quadruplets);
			quadrupletsTemp.add(input[i]);
			int diff = sum - input[i];
			if (diff == 0 && quadrupletsTemp.size() == 4) {
				System.out.println(quadrupletsTemp);
				result.add(quadrupletsTemp);
				continue;
			} else if((diff == 0 && quadrupletsTemp.size() < 4)  || quadrupletsTemp.size() > 4) {
				
			}
			getQuadrupletsForSum(input, diff, i + 1, quadrupletsTemp);
		}
		return;
	}

}
