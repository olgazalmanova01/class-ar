public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 0, -67, 33, 444444, -321, 98, 77};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}