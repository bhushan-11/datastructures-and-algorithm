package sliding_window.easy;

public class MaxAverageSubArray {

    public static void main(String args[]) {

        double result = maxAverage(new int [] {1,12,-5,-6,50,3}, 4);

        System.out.print("result is :"+result);
    }

    private static double maxAverage(int[] nums , int k) {

        int current_max=0;

        for(int i =0;i<k;i++){

            current_max += nums[i];
        }

        int temp = current_max;

        for(int i=k;i<nums.length;i++){
            temp = temp+nums[i] - nums[i-k];

            current_max = Math.max(current_max, temp);
        }

        return current_max*1.0/k;
    }
}
