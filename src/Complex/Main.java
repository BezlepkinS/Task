package Complex;

import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int real = scanner.nextInt();
        int image = scanner.nextInt();
        Complex complex = createConcreteByFactory(real, image);
        System.out.println(complex.getReal() + "+" + complex.getImage() + ("i") );
    }

    static Complex createConcreteByFactory(int real, int image) {
        ConcreteFactory factory = new ConcreteFactory();
        if(real == 0 && image == 0) {
            return factory.createComplex();
        } else return factory.CreateComplex(real, image);
    }
}
