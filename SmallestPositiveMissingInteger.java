import java.util.HashSet;

public class SmallestPositiveMissingInteger {
    public static int smallestPositiveMissingInteger(int[] A) {
        HashSet<Integer> positiveIntegers = new HashSet<>();

        // Iterate through A and add positive integers to the set
        for (int num : A) {
            if (num > 0) {
                positiveIntegers.add(num);
            }
        }

        // Check for the smallest positive integer missing
        int missingInteger = 1;
        while (positiveIntegers.contains(missingInteger)) {
            System.out.println("missingInteger" + missingInteger);
            missingInteger++;
        }

        return missingInteger;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 6, 4, 1, 2};
        System.out.println(smallestPositiveMissingInteger(arr1));  // Output: 5

        int[] arr2 = {1, 2, 3};
        System.out.println(smallestPositiveMissingInteger(arr2));  // Output: 4

        int[] arr3 = {-1, -3};
        System.out.println(smallestPositiveMissingInteger(arr3));  // Output: 1
    }
}
