/**
 * Given an array of elements, return the String that has two values separated
 * by commans. The first value is the sum of all the elements except minimum
 * and the second value is the sum of all the elements except the maximum.
 * Input : {1,2,3,4,5};
 * Output : 14,10
 * Input : {1,2}
 * Output : 2,1
 * @author Siva Sankar
 */
final class MiniMaxSum {
    /**.
     * dummy constructor
     */
    private MiniMaxSum() {

    }
    /**
     * This method returns the minimum element in the array.
     * @param arr contains the elements in arr.
     * @return the minimum element in the arr. If there are no elements, then
     * it should return -1.
     */
    public static int min(final int[] arr) {
        //  Your code goes here...
        int min1 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min1 > arr[i]) {
                min1 = arr[i];
            }
        }
        return min1;
    }

    /**
     * This method returns the maximum element in the array.
     * @param arr contains the elements in arr.
     * @return the maximum element in the arr. If there are no elements, then
     * it should return -1.
     */
    public static int max(final int[] arr) {
        //  Your code goes here...
        int max1 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max1 < arr[i]) {
                max1 = arr[i];
            }
        }
        return max1;
    }

    /**
     * This method returns the sum of all the elements in the array.
     * @param arr contains the elements in arr.
     * @return the sum of all the elements in the arr. returns -1 if there are
     * no elements.
     */
    public static int sum(final int[] arr) {
        //  Your code goes here...
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
         }
         return s;
    }
    /**
     * Make use of the functions defined for finding the minimum element, maxim
     * um element and the sum of all the elements of teh array arr.
     * @param arr the input array.
     * @return the string version of maxSum and minSum separated by commas.
     */
    public static String miniMaxSum(final int[] arr) {
        //  Your code goes here...
        int min1 = min(arr);
        int max1 = max(arr);
        int s = sum(arr);
        return ((s - min1) + "," + (s - max1));
    }
}
