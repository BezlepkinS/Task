package Exception;

import java.util.Scanner;

public class Exception2 {

    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);

        try {
            System.out.println(2 / i);
        } catch (Exception e0)  {
            System.out.println("Этот catch будет перехватывать ПЕРВЫМ все проверяемые иссключения");
        /*  } catch (NumberFormatException e1) {
            System.out.println("Format <i> is unknown");
        } catch (ArithmeticException e2) {
            System.out.println("Attempted division by zero"); */
        } finally {
            System.err.println("Дружба - это чудо!");
        }
    }
}
