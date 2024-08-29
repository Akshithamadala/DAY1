public class FindCountWithDifference {
    public static int findCount(int arr[], int num, int diff) {
        int count = 0;
        for (int value : arr) {
            if (Math.abs(value - num) <= diff) count++;
        }
        return count > 0 ? count : -1;
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 14, 56, 77, 13};
        int num = 13, diff = 2;
        System.out.println("Output: " + findCount(arr, num, diff));
    }
}
