package Arrays;

public class _0074_SearchA2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int len = m*n;

        int i = 0;
        while(i < len) {
            if(matrix[i][0] == target) {
                return true;

            }
        }



        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = { {1,3,5,7},{10,11,16,20},{23,30,34,60} };
        int target = 3;
        boolean ans = searchMatrix(matrix, target);
        System.out.println(ans);


    }
}
