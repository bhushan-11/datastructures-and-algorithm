package twopointers.easy;

public class MoveZeroes {

    public static void main (String args[]){
        //nums = [0,1,0,3,12] , result nums = [1,3,12,0,0]
         int [] nums = new int[] { 1,2,12,3,0,0};
        moveZeroes(nums);

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    private static void moveZeroes(int[] nums) {

        int start =0;
        int end =nums.length-1;

        while (start < end){
            if(nums[start] ==0){

                for(int i=start +1 ; i<=end ; i++){
                    nums[i-1]= nums[i];
                }
                nums[end] =0;
                end --;
            }
            start++;
        }
    }
}
