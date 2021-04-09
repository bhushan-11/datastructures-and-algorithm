package hashtable;

import java.util.HashMap;

public class TwoSum {
	
	//return the value of indices from an array that gets the target sum
	
	public int [] targetSum(int input[], int target) {
		
		// for example : target =9 , input array = [2,7,11,15]
		int n = input.length;
		
		HashMap< Integer, Integer> hashMap= new HashMap<>();
		
		for(int i=0;i<n;i++) {
			hashMap.put(input[i],i);
		}
		
		for(int i=0;i<n;i++) {
			int complement= target-input[i];
			
			if(hashMap.containsKey(complement)&& hashMap.get(complement)!=i) {
				
				return new int [] {i,hashMap.get(complement)};
				
			}
		}
		
		return null;
	}

	
	public static void main(String args[]) {
		
		TwoSum tSum = new TwoSum();
		
		int [] input = new int [] {2,7,11,15};
		
		int [] output = tSum.targetSum(input, 13);
		
		for(int i=0 ;i<output.length;i++) {
			System.out.println(output[i]);
		}
		
		
		
		}
}
