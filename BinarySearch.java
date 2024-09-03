public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 12, 23, 34, 45, 56, 67, 78 };
        int target = 67;
        int res = binarySearch(arr, target);
        System.out.println("Here is the founded index is : " + res);

    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        System.out.println(end);

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
