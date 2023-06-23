package twopointers.medium;

public class ContainerMaxWater {

    public static void main (String args[]) {

        int max = maxArea(new int[] { 1,8,6,2,5,4,8,3,7});

        System.out.println("result is "+ max);
    }

    private static int maxArea(int[] height) {

        int left =0;
        int right = height.length-1;
        int max_area =0;

        while (left < right){

            int width = right -left;
            int heights = Math.min(height[left], height[right]);

            int area = width * heights;
            max_area = Math.max(max_area, area);

            if(height[left] < height[right]) {
                left++;
            }
            else if (height[right] <height[left]){
                right--;
            }else {
                left++;
                right--;
            }
        }

        return max_area;
    }
}
