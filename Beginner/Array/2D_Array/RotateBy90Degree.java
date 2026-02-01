package Array.TwoD_Array;

public class RotateBy90Degree {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        rotate(arr);
    }

    public static void rotate(int[][] arr) {
        //00 01 02 // 02 12 22

        int [][] rotated = new int[arr.length][arr[0].length];
       for(int row = 0 ; row < arr.length ; row++){
            for(int col = 0 ; col < arr[0].length ; col++){
                rotated[col][arr.length - 1 - row] = arr[row][col];
            }
       }

       print(rotated);
    }

    public static void rotateInPlace(int[][] arr) {
        // Step 1: Transpose the matrix (swap arr[i][j] with arr[j][i])
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = arr[i].length - 1;

            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
        
        System.out.println("Rotated In-Place:");
        print(arr);
    }

    public static void print(int[][] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}