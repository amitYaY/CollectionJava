package com.collections.map.seven;

import java.util.Arrays;

public class SolutionService {

	public static void main(String[] args) {
		SolutionService service = new SolutionService();
		
		int[] inOrder =  {8,4,9,2,10,5,11,1,12,6,13,3,14,7,15};
		int[] preOrder = {1,2,4,8,9,5,10,11,3,6,12,13,7,14,15};
		
		System.out.println(Arrays.asList(service.getPostOrderForInOrder(inOrder)));
		System.out.println(Arrays.asList(service.getPostOrderForPreOrder(preOrder)));
	}

	private int[] getPostOrderForInOrder(int[] input) {
		
		int[] result = new int[input.length];
		
		for(int i=0; i<input.length; i++) {
			
		}

		return null;
	}

	private int[] getPostOrderForPreOrder(int[] input) {

		return null;
	}
	
	

}