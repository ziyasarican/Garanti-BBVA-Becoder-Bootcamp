package transpoze_hafta2;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                        {1,2,3,5},
                        {4,5,6,7}
                        };
        printMatrix(matrix);

        transpoze(matrix);


    }

    public static void transpoze(int[][] matrix){
        int[][] transpozeMatrix = new int [matrix[0].length][matrix.length];
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[0].length; cols++) {
                transpozeMatrix[cols][rows] = matrix[rows][cols];
            }
            
        }
        printMatrix(transpozeMatrix);
    }
    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
            
        }
    }
}
