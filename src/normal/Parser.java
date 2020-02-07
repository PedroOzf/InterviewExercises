package normal;

import java.util.Stack;

public class Parser {
    public static boolean parsear(String s) {
        Stack<Character> stack = new Stack();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' ||c == '{'){
                stack.push(c);
            }else if (c == ']' || c == ')' ||c == '}'){
                char cima = stack.pop();
                switch (c){
                    case ']':
                        if(cima!='[') return false;
                        break;
                    case ')':
                        if(cima!='(') return false;
                        break;
                    case '}':
                        if(cima!='{') return false;
                        break;
                }

            }
        }
        return true;
    }
}
