package normal;

import java.util.ArrayList;
import java.util.List;

public class ZeroMatrix {
    public static void convert(int[][] matrix){
        List<Integer[]> lista = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    Integer[] patata = {i,j};
                    lista.add(patata);
                }
            }
        }
        for(Integer[] i:lista){
            setZero(matrix,i[0],i[1]);
        }
    }

    private static void setZero(int[][] matrix, int i, int j) {
        for(int x=0;x<matrix.length;x++){
            matrix[x][j] = 0;

        }
        for(int x=0;x<matrix[0].length;x++){
            matrix[i][x] = 0;

        }
    }

}
class Main{
    public static void main(String[] args) {
        int[][] mat = {{1,2,0,5,6,7,4},{4,5,6,23,4,5,5},{7,8,9,23,0,3,4}};
        ZeroMatrix.convert(mat);
        for(int i=0;i<mat.length;i++){
            for(int j = 0; j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
