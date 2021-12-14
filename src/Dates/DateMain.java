package Dates;

import java.lang.annotation.Native;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateMain {

    private static final int MILLION = 1000000;

    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
    }

    private static void Task1(){
        System.out.println("--------Task1----------");
        Developer dev = new Developer("Bezlepkin");
        dev.passTask();
        System.out.println("Developer name is " + dev.getLastName());
        System.out.println("Developer took task at 21:25:15 13/12/2021");
        System.out.println("Developer pass task at " + dev.getLastPassingTime());

    }

    private static void Task2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Task2----------");
        System.out.print("Введите дату в формате dd/mm/yyyy: ");
        //String[] dateArr = sc.nextLine().split("/");
        String[] dateArr = "24/11/2021".split("/");
        if (dateArr.length != 3){
            System.out.println("Вы ввели неккоректную запись");
        }
        else{
            try{
                int day = Integer.parseInt(dateArr[0]);
                int month = Integer.parseInt(dateArr[1]);
                int year = Integer.parseInt(dateArr[2]);

                Calendar userCal = Calendar.getInstance();
                userCal.set(Calendar.DAY_OF_MONTH, day);
                userCal.set(Calendar.MONTH, month-1);
                userCal.set(Calendar.YEAR, year);

                Calendar currentCal = Calendar.getInstance();

                String pattern = "dd/MM/yyyy";

                SimpleDateFormat sdf = new SimpleDateFormat(pattern);

                System.out.println("Текущая дата: " + sdf.format(currentCal.getTime()));
                System.out.println("Введеная дата: " + sdf.format(userCal.getTime()));

                if(currentCal.compareTo(userCal) == 0){
                    System.out.println("Даты равны");
                }
                else if (currentCal.compareTo(userCal) > 0){
                    System.out.println("Текущая дата больше введеной");
                }
                else{
                    System.out.println("Введеная дата больше текущей!");
                }
            }catch (NumberFormatException e){
                System.out.println("Неправильно ввели числа!");
            }
        }
    }

    private static void Task3(){
        System.out.println("--------Task3----------");
        Calendar birthCal = Calendar.getInstance();
        birthCal.set(Calendar.DAY_OF_MONTH, 4);
        birthCal.set(Calendar.MONTH, 7);
        birthCal.set(Calendar.YEAR, 1887);

        Student student = new Student(4, "Bezlepkin", 4.5, birthCal.getTime());
        System.out.println("Краткий формат: " + student.getBirthDay(Student.DATE_BRIEF));
        System.out.println("Средний формат: " + student.getBirthDay(Student.DATE_MEDIUM));
        System.out.println("Полный формат: " + student.getBirthDay(Student.DATE_FULL));
    }

    private static void Task4(){
        Scanner sc = new Scanner(System.in);

        System.out.println("--------Task4----------");
        System.out.println("Введите дату и время в формате <Год> <Месяц> <Число> <Час> <Минуты>");
        //String[] dateTimeArr = sc.nextLine().split(" "); //Ввод с консоли
        String[] dateTimeArr = "2021 11 20 14 27".split(" "); //Значение по умолчанию
        if (dateTimeArr.length != 5){
            System.out.println("Вы ввели неправильно");
        }
        else{
            int year = Integer.parseInt(dateTimeArr[0]);
            int month = Integer.parseInt(dateTimeArr[1]);
            int day = Integer.parseInt(dateTimeArr[2]);
            int hours = Integer.parseInt(dateTimeArr[3]);
            int minutes = Integer.parseInt(dateTimeArr[4]);

            String pattern = "'year: 'yyyy', month: 'MM', day: 'dd', hours: 'H', minutes: 'mm";
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            Calendar cal = createCalendar(year, month, day, hours, minutes);
            Date date = createDate(year, month, day, hours, minutes);

            System.out.println("Calendar: " + sdf.format(cal.getTime()));
            System.out.println("Date: " + sdf.format(date));
        }
    }

    private static Calendar createCalendar(int year, int month, int day, int hours, int minutes){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.HOUR_OF_DAY, hours);
        cal.set(Calendar.MINUTE, minutes);

        return cal;
    }

    @Deprecated
    private static Date createDate(int year, int month, int day, int hours, int minutes){
        return new Date(year-1900, month-1, day, hours, minutes);
    }

    private static void Task5(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("--------Task5----------");
        fillListsAndMeasure(arrayList, linkedList);
        measureInsertTime(arrayList, linkedList);
        measureSearchTime(arrayList, linkedList);
        measureDeleteTime(arrayList, linkedList);
    }

    private static void fillListsAndMeasure(ArrayList<Integer> arrayList, LinkedList<Integer> linkedList){
        System.out.println("========Добавление========");
        System.out.println("---Добавление " + DateMain.MILLION + " элементов---");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < DateMain.MILLION; i++){
            arrayList.add(i);
        }
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("ArrayList: " + estimatedTime + "ms");

        startTime =  System.currentTimeMillis();
        for (int i = 0; i < DateMain.MILLION; i++){
            linkedList.add(i);
        }
        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("LinkedList: " + estimatedTime + "ms");
    }

    private static void measureInsertTime(ArrayList<Integer> arrayList, LinkedList<Integer> linkedList){
        System.out.println("========Вставка========");
        System.out.println("---Операция вставки в начало---");
        long startTime = System.currentTimeMillis();
        //System.nanoTime()
        arrayList.add(0, 1);
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("ArrayList: " + estimatedTime + "ms");
        startTime = System.currentTimeMillis();
        linkedList.add(0,1);
        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("LinkedList: " + estimatedTime + "ms");

        System.out.println("---Операция вставки в середину---");
        startTime = System.currentTimeMillis();
        arrayList.add(DateMain.MILLION /2, 1);
        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("ArrayList: " + estimatedTime + "ms");
        startTime = System.currentTimeMillis();
        linkedList.add(DateMain.MILLION /2,1);
        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("LinkedList: " + estimatedTime + "ms");

        System.out.println("---Операция вставки в конец---");
        startTime = System.currentTimeMillis();
        arrayList.add(DateMain.MILLION -1, 1);
        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("ArrayList: " + estimatedTime + "ms");
        startTime = System.currentTimeMillis();
        linkedList.add(DateMain.MILLION -1,1);
        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("LinkedList: " + estimatedTime + "ms");
    }

    private static void measureSearchTime(ArrayList<Integer> arrayList, LinkedList<Integer> linkedList) {
        System.out.println("========Нахождение========");
        System.out.println("---Операция нахождения первого элемента");
        long startTime = System.currentTimeMillis();
        arrayList.contains(0);
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("ArrayList: " + estimatedTime + "ms");
        startTime = System.currentTimeMillis();
        linkedList.contains(0);
        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("LinkedList: " + estimatedTime + "ms");

        System.out.println("---Операция нахождения элемента в середине");
        startTime = System.currentTimeMillis();
        arrayList.contains(DateMain.MILLION /2);
        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("ArrayList: " + estimatedTime + "ms");
        startTime = System.currentTimeMillis();
        linkedList.contains(DateMain.MILLION /2);
        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("LinkedList: " + estimatedTime + "ms");

        System.out.println("---Операция нахождения последнего элемента");
        startTime = System.currentTimeMillis();
        arrayList.contains(DateMain.MILLION -1);
        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("ArrayList: " + estimatedTime + "ms");
        startTime = System.currentTimeMillis();
        linkedList.contains(DateMain.MILLION -1);
        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("LinkedList: " + estimatedTime + "ms");
    }


    private static void measureDeleteTime(ArrayList<Integer> arrayList, LinkedList<Integer> linkedList){
        System.out.println("========Удаление========");
        System.out.println("---Операция удаления первого элемента");
        long startTime = System.currentTimeMillis();
        arrayList.remove(0);
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("ArrayList: " + estimatedTime + "ms");
        startTime = System.currentTimeMillis();
        linkedList.remove(0);
        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("LinkedList: " + estimatedTime + "ms");

        System.out.println("---Операция удаления элемента в середине");
        startTime = System.currentTimeMillis();
        arrayList.remove(DateMain.MILLION /2);
        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("ArrayList: " + estimatedTime + "ms");
        startTime = System.currentTimeMillis();
        linkedList.remove(DateMain.MILLION /2);
        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("LinkedList: " + estimatedTime + "ms");

        System.out.println("---Операция удаления последнего элемента");
        startTime = System.currentTimeMillis();
        arrayList.remove(DateMain.MILLION -1);
        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("ArrayList: " + estimatedTime + "ms");
        startTime = System.currentTimeMillis();
        linkedList.remove(DateMain.MILLION -1);
        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("LinkedList: " + estimatedTime + "ms");
    }
}
