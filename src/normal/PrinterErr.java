package normal;

public class PrinterErr {
    public static String printerError(String cadena) {
         return cadena.replaceAll("[a-m]","").length() + "/" + cadena.length();
    }
}
