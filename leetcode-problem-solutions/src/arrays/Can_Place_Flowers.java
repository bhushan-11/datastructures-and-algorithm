package arrays;

public class Can_Place_Flowers {

    public static void main(String args[]){

       boolean result = canPlanceFlowers(new int [] {0,0,1,0,1,0,1}, 1);

        System.out.println("result is : "+ result);

    }

    private static boolean canPlanceFlowers(int[] flowerbed, int n) {

        if(n == 0){
            return true;
        }

        for(int i=0; i<flowerbed.length;i++){
            if(flowerbed[i] ==0){

                boolean emptyLeftPocket =  i==0|| (flowerbed[i-1] == 0) ;
                boolean emptyRightPocket = i== flowerbed.length-1 || flowerbed[i+1] ==0;

                if(emptyLeftPocket && emptyRightPocket ){
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return n <=0;
    }
}
