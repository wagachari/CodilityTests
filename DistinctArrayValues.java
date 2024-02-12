import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class DistinctArrayValues {

    public static void main (String []args){
        DistinctArrayValues myClass = new DistinctArrayValues();
        int []theArray = new int[] {1,2,3,4,4,5,1,5,6,7};
        System.out.println("The number of distinct values is"+myClass.solution(theArray));

    }
    private int solution(int []arrayOfValues){
        int numberOfNonUnique = 0;
        Set<Integer> setOfNumbers = new HashSet<>();
        Queue<Integer> uniqueSetOfNumbers = new LinkedList<>();

        for(int a:arrayOfValues){
            setOfNumbers.add(a);
        }
        for(int i=0; i < arrayOfValues.length;i ++) {
            System.out.println("i is "+arrayOfValues[i]);
            if(!uniqueSetOfNumbers.contains(arrayOfValues[i])){
                uniqueSetOfNumbers.add(arrayOfValues[i]);
            }else{
                numberOfNonUnique +=1;
            }            
        }
        int uniqueValues = setOfNumbers.size() - numberOfNonUnique;
        return uniqueValues;

    }
    
}
