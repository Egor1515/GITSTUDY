public class diagonalSum {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(diagonalSum(arr));
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for (int i = 0; i < mat.length; i++) {
            sum+=mat[i][i];
            sum+=mat[n-1-i][i];
        }

        if(n%2!=0){
            sum-=mat[n/2][n/2];
        }
        return sum;
    }
}
