package wordbreak;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class DP_wordbreak {
	
	public static void main ( String args[]) {
		
		String string = "leetcode";
		
		List <String> list = new ArrayList<String>();
		list.add("leet");
		list.add("code");
		
		DP_wordbreak wbDp_wordbreak = new DP_wordbreak();
		
		System.out.println(wbDp_wordbreak.wordBreak(string, list));
	
	}
	
	public boolean wordBreak(String string , List<String> list) {
		
		Set<String> stringset = new HashSet<>(list);
		
		int n = string.length();
		
		boolean dp []= new boolean[n+1];
		
		dp[0]= true;
		
		for(int len =1 ; len <= n; len++) {
			
			for (int i=0; i< len;i++) {
				
				if(dp[i] && stringset.contains(string.substring(i, len))) {
					
					dp[len]=true;
					break;
				}
			}
		}
		
		return dp[n];
	}

}
