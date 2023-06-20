package arrays;

public class ReverseVowels {


    public static void main(String[] args){

        String s = "hello";
        String result = reverseVowels(s);
        System.out.println("in main method.............................................");

        System.out.println("result is "+ result);
    }

    private static String reverseVowels(String s) {

        if(s == null || s.length() ==0 ) return null;

        char [] schar = s.toCharArray();

        int start = 0;
        int end = s.length()-1;

        while(start < end){

            while (start < s.length() && !isVowel(s.charAt(start))){
                start ++;
            }
            while( end > 0 && !isVowel(s.charAt(end))){
                end --;
            }
            if(start > end){
                swap(schar, start, end);
            }
        }

        return new String(schar);
    }

    private static boolean isVowel(char c) {

        return c =='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u';
    }

    private static void swap(char[] chars, int x, int y){

        char temp = chars[x];
        chars[x]= chars[y];
        chars[y]= temp;
    }
}
