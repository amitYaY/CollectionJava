package com.collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapService {

	public static void main(String[] args) {
		
		MapService mapService = new MapService();
		mapService.sortMapByKey();
		System.out.println("###############");
		mapService.sortMapByValue_1();
		System.out.println("###############");
		mapService.sortMapByValue_2();
		System.out.println("###############");
		mapService.sortMapByValue_1_Reverse();
		System.out.println("###############");
		mapService.sortMapByValue_2_Reverse();

	}
	
	private void sortMapByKey() {

		Map<String, Integer> input = new HashMap<>();
		input.put("First", 9);
		input.put("Second", 1);
		input.put("Third", 7);
		input.put("Forth", 5);
		input.put("Five", 6);
		
		input.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entry -> System.out.println(entry.getKey()));
		
	}
	
	private void sortMapByValue_1() {

		Map<String, Integer> input = new HashMap<>();
		input.put("First", 9);
		input.put("Second", 1);
		input.put("Third", 7);
		input.put("Forth", 5);
		input.put("Five", 6);
		
		input.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(entry -> System.out.println(entry.getValue()));
		
	}
	
	private void sortMapByValue_2() {

		Map<String, Integer> input = new HashMap<>();
		input.put("First", 9);
		input.put("Second", 1);
		input.put("Third", 7);
		input.put("Forth", 5);
		input.put("Five", 6);
		
		input.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).forEach(entry -> System.out.println(entry.getValue()));
	}
	
	private void sortMapByValue_1_Reverse() {

		Map<String, Integer> input = new HashMap<>();
		input.put("First", 9);
		input.put("Second", 1);
		input.put("Third", 7);
		input.put("Forth", 5);
		input.put("Five", 6);
		
		input.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(entry -> System.out.println(entry.getValue()));
		
	}
	
	private void sortMapByValue_2_Reverse() {

		Map<String, Integer> input = new HashMap<>();
		input.put("First", 9);
		input.put("Second", 1);
		input.put("Third", 7);
		input.put("Forth", 5);
		input.put("Five", 6);
		
		input.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder())).forEach(entry -> System.out.println(entry.getValue()));
	}

}
