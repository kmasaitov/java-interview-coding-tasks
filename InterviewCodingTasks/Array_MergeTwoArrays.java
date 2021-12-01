import java.util.Arrays;

public class Array_MergeTwoArrays {
    /*
    Write a return method that can concat two arrays
     */
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        System.out.println(Arrays.toString(concatTwoArrays(arr1, arr2)));

//2nd way of concatenating to arrays
        int[] arr3 = Array_MergeTwoArrays.concatTwoArrays(arr1,arr2);
        System.out.println("arr3 = " + Arrays.toString(arr3));
    }

    public static int[] concatTwoArrays(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;
        }

        return result;

    }

}
