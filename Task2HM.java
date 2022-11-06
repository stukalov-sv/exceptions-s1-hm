import java.util.Arrays;

public class Task2HM {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 2, 1};
        System.out.println(Arrays.toString(arraysElementsDiff(arr1, arr2)));
    }

    private static int[] arraysElementsDiff(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Different length of arrays");
        }
        for (int i = 0; i < arr1.length; i++) {
            res[i] = arr1[i] - arr2[i];
        }
        return res;
    }
}
