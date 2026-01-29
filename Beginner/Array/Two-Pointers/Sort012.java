public class Sort012 {
    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 1, 0, 1, 2, 0 };
        System.out.println("Before Sort:");
        printArray(arr);

        sort012(arr);

        System.out.println("\nAfter Sort:");
        printArray(arr);
    }

    public static void sort012(int[] arr) {
        int start = 0, end = arr.length - 1, mid = 0;
        while (mid <= end) {
            if (arr[mid] == 0) {
                swap(arr, start, mid);
                start++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, end);
                end--;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
