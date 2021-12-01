public class Array_FindMaximum {
    /*
        Write a function that can find the maximum number from an int Array
     */
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,1,2,3};
        System.out.println(maxValue(num));
    }

    public static int maxValue(int[] n) {

        int max = Integer.MIN_VALUE;

        for (int each : n) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }


}
