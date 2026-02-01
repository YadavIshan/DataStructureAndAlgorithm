package BinarySearch;

public class CeilAndFloor {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;    
        findCeilAndFloor(arr, target);
    }

    public static void findCeilAndFloor(int[] arr, int target) {
        int ceil = -1  , floor = -1;

        int start = 0 , end = arr.length - 1;

        while(start <= end ){
            int middle = start + (end-start) / 2;

            if(arr[middle]==target){
                ceil = floor = arr[middle];
                break;
            }else if(arr[middle]> target   ){
                ceil = arr[middle];
                end = middle - 1;
            }else{
                floor = arr[middle];
                start = middle + 1;
            }
        }

        System.out.println("Ceil: " + ceil);
        System.out.println("Floor: " + floor);
    }
}
