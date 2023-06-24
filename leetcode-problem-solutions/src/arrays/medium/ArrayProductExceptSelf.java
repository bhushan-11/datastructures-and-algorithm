package arrays.medium;

public class ArrayProductExceptSelf {

    public static void main ( String args[]) {

        int [] input = new int[] { 1,2,3,4};

        int result [] = new int [input.length];

        result = findProduct(input);

        for(int i =0 ;i<result.length;i++){
            System.out.println(result[i]);
        }
    }

    private static int[] findProduct(int[] nums) {

        int left[] = new int[nums.length];
        int right [] = new int [nums.length];
          int result [] = new int[nums.length];
        left[0]= 1;

        for(int i =1; i<left.length;i++){
            left[i]= nums[i-1] * left[i-1];
        }
        right[right.length-1] =1;

        for(int i = right.length-2 ; i>=0;i--){

          right[i] = right[i+1] * nums[i+1];
        }

        for(int i=0;i<nums.length;i++){
            result[i]= left[i]*right[i];
        }


        return result;
    }
}
