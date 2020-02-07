package test.normalTests;

import normal.ZeroMatrix;
import org.junit.Test;



public class ZeroMatrixTest {
    @Test
    public void test(){
        int[][] matrix = {{1,2,3,5,6,7,4},{4,5,6,23,4,5,5},{7,8,9,23,42,3,4}};
        ZeroMatrix.convert(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j = 0; j<matrix.length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }

}