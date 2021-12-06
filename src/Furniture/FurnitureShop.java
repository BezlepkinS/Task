package Furniture;
import java.util.Scanner;

public class FurnitureShop{
    public static void main (String args []) {
        System.out.println("Добро пожаловать в магазин мебели!" + "\n" +  "Напишите что хотите приобрести:");
        Scanner in = new Scanner(System.in);
        String fur = in.next();

        switch (fur){
            case ("Стол"):
                System.out.println("Введите желаемый цвет");
                Scanner in1 = new Scanner(System.in);
                String color = in1.nextLine();
                System.out.println("Введите желаемый размер стола");
                Scanner in3 = new Scanner(System.in);
                String size = in3.nextLine();
                Table t1 = new Table(color, size, 20000);
                t1.furnitureInfo();
                break;
            case ("Стул"):
                System.out.println("Введите желаемый цвет");
                Scanner in2 = new Scanner(System.in);
                String color1 = in2.nextLine();
                System.out.println("Введите желаемый размер стула");
                Scanner in4 = new Scanner(System.in);
                String size1 = in4.nextLine();
                Chair c1 = new Chair(color1, size1, 10000);
                c1.furnitureInfo();
                break;
        }
    }
}
