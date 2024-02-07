public class FrogJumpWithLeaf{

    public static void main(String []args){
        int leaves[] = new int[]{1,3,1,4,2,3,5,4};
        int X = 5;
        int shortestTime=  findPosition(leaves, X);
        System.out.println("The shortest time that the flog can jump is"+ shortestTime);

    }

    /*
     * problem: find the earliest time when frog can jump
     * data input: position i.e int X falling leaves array  A of integers 
     * algorith: iterate through A until content of A[i] is equals to X
     * Expected time and space complexity O(n), O(1) respectively due to liner iteration in array without other iterations inside and costant space due to the fact that array size are fixed.
     */

     public static int findPosition(int[]A, int X ) throws ArithmeticException{
        int timeToJump = -1;
        for(int i =0; i<A.length;i++){
            if(A[i]==X){
                timeToJump = i;
            }
        }
        return timeToJump;
     }

}