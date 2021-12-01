public class Array_FirstUniqueElementR {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 2, 9, 4};
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
        System.out.println("firstDuplicated = " + firstDuplicated);

        int[] array2 = {1, 2, 3, 4, 5, 2, 1, 4, 3};
        int firstunique = 0;

        for (int each : array2) {
            int frequency2 = 0;
            for (int each2 : array2) {
                if (each == each2)
                    frequency2++;
            }
            if (frequency2 == 1) {
                firstunique = each;
                break;
            }

        }
        System.out.println("firstDuplicated2 = " + firstunique);
    }
}
