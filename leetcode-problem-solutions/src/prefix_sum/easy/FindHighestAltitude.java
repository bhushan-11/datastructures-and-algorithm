package prefix_sum.easy;

public class FindHighestAltitude {

    public static void main (String args[]){

        int result = finHighestAltitude(new int[] {-5,1,5,0,-7});

        System.out.println("result is " + result);

    }

    private static int finHighestAltitude(int[] gain) {

        int[] newarray= new int[gain.length+1];
        newarray[0]=0;
        int current_max = newarray[0];
        for(int i=1;i<gain.length;i++){
            newarray[i]= newarray[i-1] + gain[i-1];
            current_max = Math.max(current_max, newarray[i]);
        }
        return current_max;
    }
}
