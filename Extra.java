import jdk.swing.interop.SwingInterOpUtils;

public class Extra
{
    public static String str(int number)
    {
        return Integer.toString(number);
    }
    public static int int_(String cadena)
    {
        return Integer.parseInt(cadena);
    }

    public static void main(String[] args)
    {
        String cadena="9867";
        System.out.println(int_(cadena));
    }
}
