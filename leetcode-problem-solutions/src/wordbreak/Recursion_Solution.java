package wordbreak;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Recursion_Solution {
	
	
	
	public boolean wordBreak(String s,List<String> wordDict) {
		
		Set<String> dictSet = new HashSet<>();
		
		for(String s1:wordDict)
		{
			dictSet.add(s1);
		}
		
		return dfs(s,dictSet);
	
	}
	
	public boolean dfs(String s, Set<String> dict) {
		
		if(s.equals("")) {
			return true;
		}
		for(int i=1;i<s.length();i++)
		{
			if(dict.contains(s.substring(0,i)) && dfs(s.substring(i,s.length()), dict)){
				
				return true;
			}
		
		}
		return false;
	}
	
	
	public static void main(String args[]) {
		
		String inputString="leetcode";
		
		List<String> list = new ArrayList<>();
		list.add("leet");
		list.add("code");
		
		Recursion_Solution rSolution = new Recursion_Solution();
		
		System.out.print(rSolution.wordBreak(inputString,list));
	}
	

}
