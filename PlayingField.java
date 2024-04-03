import java.util.Arrays;

public class PlayingField {
    public  static void main (String args[])
    {
        int[] a = {4,14,4,13,10,11};
        someTest(a);

    }
    public static int someTest (int [] a){
//        Arrays.sort(a);
//        for(int i: a){
//            System.out.println(i);
//
//        }
       int foundItem = Arrays.binarySearch(a, 4);
        System.out.println(foundItem);
        return  1;
    }
}
