public class Main {
    public static void main(String[] args) {



    int[] ints = {1, 3, 5, 9, 13, 16, 19, 22, 33, 48, 56};
        System.out.println(binarySearch(1, ints));
        System.out.println(binarySearch(19, ints));
        System.out.println(binarySearch(16, ints));
        System.out.println(binarySearch(13, ints));
        System.out.println(binarySearch(48, ints));
        System.out.println(binarySearch(56, ints));
}



    //Binary search
    public static int binarySearch (int search, int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {

            int middle = (start + end) / 2;

            if (search < array[middle]) {
                end = middle - 1;
            }

            if (search > array[middle]) {
                start = middle + 1;
            }

            if (search == array[middle]) {
                return middle;
            }

        }return -1;
    }
}







