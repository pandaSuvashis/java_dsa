import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    // Row sum
    static void RowSum(int arr[][]) {
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            li.add(sum);
        }

        System.out.println("Row Sum " + li);
    }

    // column sum
    static void ColSum(int arr[][]) {
        List<Integer> li = new ArrayList<>();
        int col = arr[0].length;
        int row = arr.length;
        for (int j = 0; j < col; j++) {
            int sum = 0;
            for (int i = 0; i < row; i++) {
                sum += arr[i][j];
            }
            li.add(sum);
        }

        System.out.println("COl sum " + li);
    }

    // wave form matrix

    static List<Integer> wave(int[][] arr) {
        List<Integer> res = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;

        for(int col =0; col<n ; col ++){
            if(col % 2 == 1){
                for(int row = m-1; row >=0; row--){
                    res.add(arr[row][col]);
                }
            }
            else{
                for(int row = 0 ; row<m ;row++){
                    res.add(arr[row][col]);
                }
            }
        }
        return res;
    }


    //Transpose of the array
    static void Tran(int arr[][]){
        int rows = arr.length;
        int cols = arr[0].length;        
        
        int[][] arr2 = new int[cols][rows];
        
        for(int row= 0; row < rows ; row++){
            for(int col = 0 ; col<cols ; col++ ){
                
                arr2[col][row] =arr[row][col];
            }
        }
        //print array
        for(int row= 0; row < arr2.length ; row++){
            for(int col = 0 ; col<arr2[row].length ; col++ ){
            System.out.print(arr2[row][col]+" ");
            }
            System.out.println();
        }
    }



    public static void main(String args[]) {
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        RowSum(arr);
        ColSum(arr);
        System.out.println();
        System.out.println(wave(arr));
        System.out.println();
        Tran(arr);
    }
}