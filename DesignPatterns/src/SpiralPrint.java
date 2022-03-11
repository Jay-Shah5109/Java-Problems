public class SpiralPrint {

    public static void spiralPrint(int squareSize) {

        int temp = squareSize, start = 1;
        int[][] storeMatrix = new int[squareSize][squareSize];
        int dir = 1, rowNum = 0, colNum = 0; // default directions: 1: right, 2: down, 3: left, 4: up
        while (squareSize > 0) {
            // print in right direction
            if (dir == 1 && start <= temp*temp) {
                for (int i = 1; i <= squareSize; i++) {
                    storeMatrix[rowNum][colNum] = start;
                    System.out.println(storeMatrix[rowNum][colNum]+" entered into matrix by "+dir+" at " +
                            "position " +
                            ""+rowNum+ " "+colNum);
                    colNum++; start++;
                }
                dir = 2; colNum--; rowNum++;
            }
            // print in down direction
            if (dir == 2 && start <= temp*temp) {
                for (int i = 1; i <= squareSize - 1; i++) {
                    storeMatrix[rowNum][colNum] = start;
                    System.out.println(storeMatrix[rowNum][colNum]+" entered into matrix by "+dir+" at " +
                            "position "+
                            rowNum+ " "+colNum);
                    rowNum++; start++;
                }
                dir = 3; rowNum--; colNum--;
            }
            // print in left direction
            if (dir == 3 && start <= temp*temp) {
                for (int i = 1; i <= squareSize - 1; i++) {
                    storeMatrix[rowNum][colNum] = start;
                    System.out.println(storeMatrix[rowNum][colNum]+" entered into matrix by " +dir+" at " +
                            "position "+
                            rowNum+ " "+colNum);
                    colNum--; start++;
                }
                dir = 4; colNum++; rowNum--;
            }
            // print in up direction
            if (dir == 4 && start <= temp*temp) {
                for (int i = 1; i <= squareSize - 2; i++) {
                    storeMatrix[rowNum][colNum] = start;
                    System.out.println(storeMatrix[rowNum][colNum]+" entered into matrix by" + dir+" at " +
                            "position "+
                            rowNum+ " "+colNum);
                    rowNum--; start++;
                }
                dir = 1; rowNum++; colNum++;
            }
            squareSize = squareSize - 2;
        }
        // Print the matrix
        for (int i = 0 ; i < temp ; i++) {
            for (int j = 0 ; j < temp ; j++) {
                System.out.print(storeMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        spiralPrint(n);
    }
}
