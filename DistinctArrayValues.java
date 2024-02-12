import java.util.HashMap;
import java.util.Map;

public class DistinctArrayValues {

    public static void main (String []args){
        DistinctArrayValues myClass = new DistinctArrayValues();
        int []theArray = new int[] {1,2,3,4,4,5,1,5,6,7};
        System.out.println("The number of distinct values is"+myClass.solution(theArray));

    }
    private int solution(int []arrayOfValues){
       int uniqueCount = 0;
       Map<Integer, Integer> countMap = new HashMap<>();

        // Count the occurrences of each number
        for (int num : arrayOfValues) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Count the numbers that occur only once
        for (int num : countMap.keySet()) {
            if (countMap.get(num) == 1) {
                uniqueCount++;
            }
        }
        return uniqueCount;

    }
    
}
