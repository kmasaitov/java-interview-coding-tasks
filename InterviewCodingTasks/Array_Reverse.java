import java.util.Arrays;

public class Array_Reverse {
    /*
    write a function that can reverse an array
     */
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,1,2,3};
        System.out.println(Arrays.toString(reverse(num)));
        System.out.println(Arrays.toString(reverse(new int[] {1,1,2,2,3,4,5,4,5,6,7})));
        System.out.println(Arrays.toString(reverseChar(new char[] {'a','b','c'})));

    }
    public static int[] reverse(int[] arr){

        int[] result = new int[arr.length];

        for(int i = arr.length-1, j=0; i >= 0 ; i--, j++){
            result[j] = arr[i];
        }
        return result;
    }
    public static char[] reverseChar(char[] arr){

        char[] result = new char[arr.length];

        for(int i = arr.length-1, j=0; i >= 0 ; i--, j++){
            result[j] = arr[i];
        }

        return result;
    }



}
