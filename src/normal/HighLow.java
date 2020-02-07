package normal;

public class HighLow {
    public static String highAndLow(String str) {
        String[] a = str.split(" ");
        int[] numeros = new int[a.length];
        for(int i = 0;i<a.length;i++){
            numeros[i] = Integer.parseInt(a[i]);
        }
        for(int x = 0; x < numeros.length ; x++){
            for(int y =0; y<numeros.length - 1 -x; y++){
                if(numeros[y]>numeros[y+1]){
                    int tmp = numeros[y+1];
                    numeros[y+1] = numeros[y];
                    numeros[y] = tmp;
                }
            }
        }

        return numeros[numeros.length-1] + " " + numeros[0];

    }
}
