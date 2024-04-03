public class LinearSearch {
    public static void main (String args[]){
        LinearSearch myclass = new LinearSearch();
        int[] a = {31,2,10,4,05,16,87};
        int n = 4;
        myclass.findItem(a,n);
    }
    public int findItem(int a[],int n){
        int x= -1;

        for (int i: a){
            if (i==n){
                x = i;
                System.out.println(x);
            }
        }
        return x;
    }
}
