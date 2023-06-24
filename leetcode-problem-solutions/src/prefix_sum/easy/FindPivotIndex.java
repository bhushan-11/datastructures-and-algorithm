package prefix_sum.easy;

public class FindPivotIndex {

    public static void main (String args[]) {

        int result = findPivot(new int[] { 1,7,3,6,5,6});

        System.out.println("result is " + result);
    }

    private static int findPivot(int[] nums) {

        int sum =0;
        for(int num:nums){
            sum += num;
        }

        int prefixSum = 0;
        for(int i =0; i<nums.length;i++){
            if(prefixSum *2 == sum-nums[i]) return i;
            prefixSum += nums[i];
        }
        return -1;
    }
}
