package normal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DirRed {

    public static String[] optimizar(String[] direcciones) {
        Stack<String> pila = new Stack<>();
        String a ="";
        String op ="";

        for(int i =0;i<direcciones.length;i++){
            if(pila.isEmpty()){
                pila.push(direcciones[i]);
            }else{
                a = pila.peek();
                op = opposite(direcciones[i]);
                if(a!=op){
                    pila.push(direcciones[i]);
                }else {
                    pila.pop();
                }
            }
        }
        return pila.stream().toArray(String[]::new);

    }


    public static String opposite(String str){
        switch (str){
            case "NORTH":
                return "SOUTH";
            case "SOUTH":
                return "NORTH";
            case "EAST":
                return "WEST";
            case "WEST":
                return "EAST";
            default:
                return "";
        }
    }
}
