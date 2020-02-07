package normal;

public class PathFinder {
    public static boolean find(String maze) {

        String a = maze.replace("\n","");
        if(a.length()==1) return true;
        int cont=0;
        int dimensions = (int) Math.sqrt(a.length());
        char[][] matr = new char[dimensions][dimensions];

        for(int i =0;i<dimensions;i++){
            for (int j =0;j<dimensions;j++,cont++){
                matr[i][j] = a.charAt(cont);
            }
        }
        char[][] sol = matr;
        neighbors(matr,0,0,sol);
        return thePath(sol);
    }

    private static boolean thePath(char[][] sol) {
        for(int i=0;i<sol.length;i++){
            for(int j=0;j<sol.length;j++){
                if(sol[i][j]=='.') return false;
            }
        }
        return true;
    }

    private static void neighbors(char[][] matr, int i, int j, char[][] sol) {
        if(matr[i][j]=='W'){
            sol[i][j] = 'x';
        }
        if(sol[i][j]=='x') return;
        check(matr,i,j,sol); //There are 6 exceptions
        if (i == 0 && j==0) {
            neighbors(matr, i + 1, j, sol);
            neighbors(matr, i, j + 1, sol);
        }else if (i == 0 && j==matr.length-1) {
            neighbors(matr, i + 1, j, sol);
            neighbors(matr, i, j - 1, sol);
        }else if(i==0) {
            neighbors(matr, i + 1, j, sol);
            neighbors(matr, i, j - 1, sol);
            neighbors(matr, i, j + 1, sol);
        }else if (i == matr.length-1 && j!=matr.length-1 && j!=0) {
            neighbors(matr, i -1 , j, sol);
            neighbors(matr, i, j +1, sol);
            neighbors(matr, i, j -1, sol);
        }else if (j==0 && i == matr.length-1) {
            neighbors(matr, i -1 , j, sol);
            neighbors(matr, i, j +1, sol);
        }else if (j==matr.length-1 && i == matr.length-1) {
            neighbors(matr, i -1 , j, sol);
            neighbors(matr, i, j -1, sol);
        }else if (j==0) {
            neighbors(matr, i -1 , j, sol);
            neighbors(matr, i+1, j, sol);
            neighbors(matr, i, j +1, sol);
        }else if (j==matr.length-1){
            neighbors(matr, i -1 , j, sol);
            neighbors(matr, i+1, j, sol);
            neighbors(matr, i, j -1, sol);
        }else {
            neighbors(matr, i -1 , j, sol);
            neighbors(matr, i+1, j, sol);
            neighbors(matr, i, j -1, sol);
            neighbors(matr, i, j +1, sol);
        }
    }

    private static void check(char[][] matr, int i, int j, char[][] sol) {
        if(matr[i][j]=='.') sol[i][j]='x';
    }
}
