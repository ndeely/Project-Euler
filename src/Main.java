import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String val = "";

        while (!val.equals("e")) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Problem Number or type 'e' to exit:");

            val = input.nextLine();
            if (val.equals("e")) {
                System.exit(0);
            }

            try {
                invokeMethod("Problem" + val);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    private static void invokeMethod(String methodName) throws Exception {
        Class c = Class.forName(methodName);
        c.newInstance();
    }
}
