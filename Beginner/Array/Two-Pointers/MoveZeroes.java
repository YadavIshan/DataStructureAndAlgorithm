public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        System.out.println("Before:");
        printArray(arr);

        moveZeroes(arr);

        System.out.println("\nAfter:");
        printArray(arr);
    }

    public static void moveZeroes(int[] arr) {
        int movingPointer = 0 , zeroPointer =0 ;

        while(movingPointer < arr.length && zeroPointer < arr.length){
            //My moving pointer is dealing with non zero values 
            if(arr[movingPointer] != 0){
                swap(arr , movingPointer , zeroPointer);
                //Intuition ye hai ki mera moving pointer ya toh zero hoga ya value hoga, agar nonzero hai toh
                //mai use swap krdunga zero se 
                //AB mujhe kese pata chal raha hai ki zero pointer par zero hi hai , toh catch ye hai ki maine
                //dono ko sath move krna start kia hai and mujhe us index pr ya toh value milegi ya zero , agar 0 hai toh mai move kr nahi raha
                //and non zero hai toh automatically move hojayega
                zeroPointer++;
            }
            movingPointer++;
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
