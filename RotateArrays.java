import java.util.ArrayList;
import java.util.Collections;

class RotateArrays {
     /*
     * Check: Description from Codility in readme:
     * rotateArraysByIndex:rotating as per index/position of char 
     */
    public int[] rotateArraysByIndex(int[] A, int K) {
        //convert A to arrayList
        ArrayList<Integer> myList = new ArrayList<>();
        for (int num : A) {
            myList.add(num);
        }

        //this does the rotation magic.

        Collections.rotate(myList, K);
        //our return type is a bummer though, revert or comply :)
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            result[i] = myList.get(i);
        }

        return result;
    }
}
