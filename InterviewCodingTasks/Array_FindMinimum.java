public class Array_FindMinimum {

    /*
    Write a function that can find the maximum number from an int Array
     */
    public static void main(String[] args) {
        int[] num = {2,3,4,5,6,7,8,2,3};
        System.out.println(maxValue(num));
    }


    public static int maxValue(int[] n) {

        int min = Integer.MAX_VALUE;

        for (int each : n) {
            if (each < min) {
                min = each;
            }
        }

        return min;

    }


}