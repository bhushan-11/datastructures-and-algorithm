package arrays;

public class GCD_Strings {

    public static void main (String arsg[]){

      String result = gcdString("ABCABC", "ABC");

      System.out.println(result);
    }

    public static String gcdString(String str1, String str2) {

        if(!(str1+str2).equals(str2+str1)) {
            return "";
        }

        int gcd = gcdNumber(str1.length(), str2.length());
        return str1.substring(0,gcd);
    }

    public static int gcdNumber(int a, int b) {

        return b==0 ? a : gcdNumber(b, a%b);
    }

}
