import java.util.ArrayList;

class BinaryGaps {
    public int solution(int N) {
        String number = Integer.toBinaryString(N);
        int binaryGap = findMaxBinaryGap(number);
        return binaryGap;
    }
    /*
     * Check: Description from Codility in readme:
     *   findMaxBinaryGap caculates the binary gap and accepts binary number of type String as an argument       
     */
    private int findMaxBinaryGap(String binaryString){
       ArrayList<Integer> binaryGaps = new ArrayList<>();
        int maxGap = 0;
        int currentGap = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            char bitInCharPositionI= binaryString.charAt(i);
            if (bitInCharPositionI == '0') {
                //if we are here, we encountered a zero bit and that is all we know, lets increment currentGap
                currentGap++;
            } else {
                //if we are here, means we found a one bit, but we need further checks to confirm if we are still in current gap check mode (there was a zero before this iteration).
                if (currentGap > 0) {
                    //yaay! we found a bin gap!!
                    binaryGaps.add(currentGap);
                    //lets use Math.max to check if it is bigger than the previous.
                    maxGap = Math.max(maxGap, currentGap);
                    currentGap = 0;
                }
            }
        }
        //end of loop, returing maximum binary gap
        return maxGap;
    }
        
}
