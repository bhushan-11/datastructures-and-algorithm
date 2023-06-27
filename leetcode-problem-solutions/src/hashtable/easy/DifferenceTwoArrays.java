package hashtable.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DifferenceTwoArrays {


    public static void main(String args[]) {


        int[] nums1 = new int[]{1, 3, 2};
        int[] nums2 = new int[]{3, 4, 6};

        List<List<Integer>> result = findDifference(nums1, nums2);

        System.out.print("result is :"+ result);

    }
    private static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        return Arrays.asList(findElementsNotInFirst(nums1,nums2), findElementsNotInFirst(nums2,nums1));
    }

    private static List<Integer> findElementsNotInFirst(int[] nums1, int[] nums2) {

        HashSet<Integer> onlyInFirstList = new HashSet<>();

        List<Integer> resultList = new ArrayList<>();

        for(int num:nums2){
            onlyInFirstList.add(num);
        }

        for(int num:nums1){
            if(!onlyInFirstList.contains(num)){
                resultList.add(num);
            }
        }


        return resultList;
    }

}
