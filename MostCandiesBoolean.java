import java.util.ArrayList;
import java.util.Arrays;

public class MostCandiesBoolean {

    public static  void  main (String [] args){

        findTheBoolean(new Integer[]{2, 3, 5, 1, 3}, 3);

    }
    public static ArrayList<Boolean> findTheBoolean(Integer[] candies, Integer extraCandies){
        Boolean isSmaller = false;
        int maxCandies = 0;
        int max = candies[0];
        ArrayList<Boolean> result = new ArrayList<>();

        for(int i = 0,  n=candies.length ; i<n && (2<=n && n<=100)  && 1<=  candies[i] && candies[i]<=100 ; i++) {
            if (candies[i] > max)
                max = candies[i];
        }
        System.out.println("Max candy is" + max);

        int n = candies.length ;

        for( int i = 0;  i<n  ; i++) {
            System.out.println(candies[i]);
            maxCandies = candies[i] + extraCandies;
            if((2<=n && n<=100)  && (1<=  candies[i] && candies[i]<=100)) {
                if (extraCandies > 0 && extraCandies <= 50) {
                    if (maxCandies >= max) {
                        System.out.println(candies[i] +" when added "+extraCandies+" is "+  maxCandies+" are greater than or equal to " +max+" candies, we assign true");
                        result.add(true);
                    } else {
                        System.out.println(candies[i] +" when  added "+extraCandies+" is "+maxCandies+" are less than " +max +" candies, we assign false");

                        result.add(false);
                    }
                }
            }
        }

        return  result;

    }
}
