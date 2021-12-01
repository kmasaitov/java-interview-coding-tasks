public class Array_firstDuplicatedElement {
    public static void main(String[] args) {
         int[] num = {1,2,3,4,5,6,7, 4};
        System.out.println(firstDuplicatedElement(num));
    }
    /*
    write a program that can find the first duplicated element from the array
     */

    public static int firstDuplicatedElement(int[] array) {
        int firstDuplicated = 0;

        for (int each : array) {
            int frequency = 0;
            for (int each2 : array) {
                if (each == each2)
                    frequency++;
            }

            if (frequency > 1) {
                firstDuplicated = each;
                break;
            }

        }

        return firstDuplicated;

    }

}
