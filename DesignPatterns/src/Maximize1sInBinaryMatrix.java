public class Maximize1sInBinaryMatrix {

    // This method will flip all the bits inside the matrix
    public static int[][] flipBitsInMatrix(int mat[][], int n, int flippedRowCol) {

        int row=n, col=n, onesCount=0;
        System.out.println("At start:");
        for (int i = 0 ; i < row; i++){
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Processing...");
        // flip ones in row
        for (int i = 0 ; i < row; i++) {
            for (int j = 0 ; j < col ; j++) {
                if( i == flippedRowCol && mat[i][j] == 1 ) {
                    mat[i][j]=0;
                    System.out.println("Flipping element: "+i+" "+j); }
                else if( i == flippedRowCol && mat[i][j] == 0 ) {
                    mat[i][j]=1;
                    System.out.println("Flipping element: "+i+" "+j); }
                else
                    continue;
            }
        }
        // flip ones in column
        for (int i = 0 ; i < row; i++) {
            for (int j = 0 ; j < col ; j++) {
                if( j == flippedRowCol && mat[i][j] == 1 ) {
                    mat[i][j]=0;
                    System.out.println("Flipping element: "+i+" "+j); }
                else if( j == flippedRowCol && mat[i][j] == 0 ) {
                    mat[i][j]=1;
                    System.out.println("Flipping element: "+i+" "+j); }
                else
                    continue;
            }
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        for (int i = 0 ; i < row; i++){
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        return mat;
    }

    // This method will count ones inside the matrix
    public static int countOnesInMatrix(int mat[][], int n, int flippedRowCol) {
        int row=n, col=n, onesCount=0;
        for (int i = 0 ; i < row; i++) {
            for (int j = 0 ; j < col ; j++) {
                if(mat[i][j] == 1) {
                    onesCount++;
                }
            }
        }
        System.out.println("Count: "+onesCount);
        //flipBitsInMatrix(mat,n,flippedRowCol);
        return onesCount;
    }

    // This is the parent function that will handle the function of maximizing ones
    public static int maximizeOnes(int mat[][], int n) {
        int max=0;
        for (int i = 0; i < n ; i++) {
            flipBitsInMatrix(mat,n,i);
            int onesExtract = countOnesInMatrix(mat,n,i);
            System.out.println("Flipping again to get original matrix");
            flipBitsInMatrix(mat,n,i);
            if (onesExtract > max) {
                max = onesExtract;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[][] mat = {{1, 0, 1}, {0, 1, 0}, {1, 0, 0}};
        System.out.println(maximizeOnes(mat,3));


    }

}
