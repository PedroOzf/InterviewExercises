package normal;

import java.util.Arrays;

public class ToCamel {
    public static String toCamelCase(String input) {
        String[] str = input.split("[-_]");
        return Arrays.stream(str,1,str.length).map(s -> s.substring(0,1).toUpperCase() + s.substring(1)).reduce(str[0],String::concat);
    }
}
