package Array.Two_Pointers;
public class Sort01 {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 0, 1, 0, 1 };
        sort01(arr);
    }

    public static void sort01(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while( i < j ) {
            if(arr[i] == 1 && arr[j] == 0){
                swap(arr, i, j);
            }
            if(arr[i] == 0){
                i++;
            }
            if(arr[j] == 1){
                j--;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
