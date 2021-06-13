package com.collections.map.four;

public class TestCustomMap {

	public static void main(String[] args) {

		CustomMap<Integer, String> customMap = new CustomMap<>();
		System.out.println(customMap.put(1, "First"));
		System.out.println(customMap.put(1, "Second"));
		System.out.println(customMap.put(16, "Third"));
		System.out.println(customMap.put(17, "Fourth"));
		System.out.println("Value: " + customMap.get(1));
		System.out.println("Value: " + customMap.get(16));
		System.out.println("Value: " + customMap.get(17));

		System.out.println("###########################");

		CustomMap<String, String> customMapNew = new CustomMap<>();
		System.out.println(customMapNew.put("First", "First"));
		System.out.println(customMapNew.put("First", "Second"));
		System.out.println(customMapNew.put("Third", "Third"));
		System.out.println(customMapNew.put("Fourth", "Fourth"));
		System.out.println("Value: " + customMapNew.get("First"));
		System.out.println("Value: " + customMapNew.get("Third"));
		System.out.println("Value: " + customMapNew.get("Fourth"));
	}

}
