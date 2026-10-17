package moocfi;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
        System.out.println(search(arr, 999));
    }

    public static int search(ArrayList<Integer> arr, int target) {
        int start = 0;
        int end = arr.size() - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            int value = arr.get(middle);

            if (value == target) {
                return middle;
            } else if (value < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return -1;
    }
}
