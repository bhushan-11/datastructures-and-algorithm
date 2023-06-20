package arrays;

import java.util.ArrayList;
import java.util.List;

public class Kids_Greatest_Candies {

    public static void main(String args[]){

        List<Boolean> firstResult = new ArrayList<>();

        firstResult = kidsWithCandies(new int[] {4,2,1,1,2} , 1);

        System.out.println("result = " + firstResult );


    }

    public static List<Boolean> kidsWithCandies(int [] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();
        int current_max = candies[0];
        result.add(true);

        for(int i =1 ; i< candies.length ; i++ ){
            if(candies [i] + extraCandies >= current_max){
                current_max = Math.max(candies[i], current_max);
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}
