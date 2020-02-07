package normal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Breadcrumb {
    public static String generate_bc(String s, String s1) {
        s = s.replace("https://","");
        String[] str = s.split("/");
        str[2] = str[2].replaceAll("-"," ");
        StringBuilder sb = new StringBuilder();
        sb.append("<a href=\"/\">HOME</a>");
        sb.append(s1);
        if(!str[2].contains("index") ){
         sb.append("<a href=\"/");
         sb.append(str[1] + "/\">");
         if(str[1].length()>30){
             String a = convert(str[1]);
             sb.append(a);
         }else{
             String b = toMayus(str[1]);
             sb.append(b);
         }
         sb.append("</a>");

         if(!str[2].contains("index.")){
             sb.append(s1);
             sb.append("<span class=\"active\">");
             str[2] = check(str[2]);
             sb.append(toMayus(str[2]));
             sb.append("</span>");
         }
     }
     if (str[2].contains("index")) {
         sb.append("<span class=\"active\">");
         sb.append(toMayus(str[1]));
         sb.append("</span>");

     }


     return sb.toString();
    }

    private static String check(String s) {
        int a = 0;
        if(s.contains(".")) a = s.indexOf(".");
        if(s.contains("?")) a = s.indexOf("?");
        if(a!=0)s = s.substring(0,a);
        return s;
    }

    private static String toMayus(String s) {
        return s.toUpperCase();
    }

    private static String  convert(String s) {
        String[] del = {"the","of","in","from","by","with","and", "or", "for", "to", "at", "a"};
        List<String> list =  new LinkedList<String>(Arrays.asList(s.split("-")));
        for(int i=0;i<del.length;i++){
            if(list.contains(del[i])) list.remove(del[i]);
        }
        StringBuilder sb = new StringBuilder();
        for(int j =0;j<list.size();j++){
            sb.append(Character.toUpperCase(list.get(j).charAt(0)));
        }
        return sb.toString();
    }
}
