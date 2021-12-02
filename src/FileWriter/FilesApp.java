package FileWriter;
import java.io.*;
import java.util.Scanner;

public class FilesApp {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("C:\\Users\\Сергей\\IdeaProjects\\Task\\src\\FileWriter\\FileApp.txt", true);
        try {
            writer.write("Это простой пример,\nв котором мы осуществляем\nс помощью языка Java\nзапись в файл\nи чтение из файла\n");
            String text = "!!!Java круче C!!!";
            writer.write(text);

            writer.append('\n');
            writer.append('J');
            writer.append('\n');

            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            writer.write(name);
            writer.append('\n');
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        FileReader reader = new FileReader("C:\\\\Users\\\\Сергей\\\\IdeaProjects\\\\Task\\\\src\\\\FileWriter\\\\FileApp.txt");
        try {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileWriter writer2 = new FileWriter("C:\\\\Users\\\\Сергей\\\\IdeaProjects\\\\Task\\\\src\\\\FileWriter\\\\FileApp.txt", false)) {
            Scanner scanner1 = new Scanner(System.in);
            String name1 = scanner1.nextLine();
            writer2.write(name1);
            writer.append('\n');
            writer2.flush();
            writer2.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileWriter writer3 = new FileWriter("C:\\\\Users\\\\Сергей\\\\IdeaProjects\\\\Task\\\\src\\\\FileWriter\\\\FileApp.txt", true)) {
            Scanner scanner2 = new Scanner(System.in);
            String name2 = "Начало";
            while(!(name2.equals("Конец"))) {
                name2 = scanner2.nextLine();
                writer3.write('\n' + name2);
            }
            writer3.flush();
            writer3.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try(FileReader reader2 = new FileReader("C:\\\\Users\\\\Сергей\\\\IdeaProjects\\\\Task\\\\src\\\\FileWriter\\\\FileApp.txt"))
        {
            char [] arr = new char[200];
            reader2.read(arr);
            for(char value : arr)
                System.out.print(value);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

