import java.util.ArrayList;
import java.util.Arrays;

public class Array_RemoveDuplicates {

    /*
    Write a function that can remove the duplicates from an array of integers
     */
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,1,2,3};

        System.out.println(Arrays.toString(removeDuplicates(num)));
        System.out.println(Arrays.toString(removeDuplicates(new int[] {1,1,2,2,3,4,5,4,5,6,7})));

        System.out.println(Arrays.toString(removeDuplicates2(num)));
    }

    // solution 1
    public static int[] removeDuplicates(int[] array){
        return Arrays.stream(array).distinct().toArray();
    }


    //solution 2
    public static int[] removeDuplicates2(int[] array){
        ArrayList<Integer> list = new ArrayList<>();
        for(int each: array){
            if(!list.contains(each)){
                list.add(each);
            }
        }

        array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;

    }





}
