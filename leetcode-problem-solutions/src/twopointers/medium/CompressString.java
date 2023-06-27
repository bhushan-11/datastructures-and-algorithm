package twopointers.medium;

public class CompressString {

    public static void main(String args[]) {

        int result = compressString(new char[]{'a', 'a', 'b', 'c', 'c','c','c'});

        System.out.println("result is :" + result);
    }

    private static int compressString(char[] chars) {

        int i = 0, res = 0;
        while (i < chars.length) {

            int groupLength = 1;
            while (i + groupLength < chars.length && chars[i] == chars[i + groupLength])
                groupLength++;

            chars[res++] = chars[i];
            if (groupLength > 1) {
                for (char c : Integer.toString(groupLength).toCharArray()) {
                    chars[res++] = c;
                }
            }
            i=i+groupLength;
        }
   for(int j=0; j<chars.length; j++)
        System.out.println("result array : " + chars[j]);

        return res;
    }
}
