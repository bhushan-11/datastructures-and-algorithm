package twopointers;

public class IsSubsequence {


    public static void main (String args[]) {

        String s = "cef";
        String t = "abcdef";
        boolean result = isSubsequence (s,t);

        System.out.println("result is " + result);
    }

    private static boolean isSubsequence(String s, String t) {

        int j =0;
        for(int i=0 ; i<t.length() && j<s.length() ; i++){

            if(t.charAt(i) == s.charAt(j)){
                j++;
            }
        }

        return j==s.length();
    }
}
