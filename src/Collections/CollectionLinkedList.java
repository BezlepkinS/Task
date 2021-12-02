package Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionLinkedList {
    public static void main(String[] args) {
        LinkedList<Person> list = new LinkedList<>();

        Person person1 = new Person("Russia");
        Person person2 = new Person("China");
        Person person3 = new Person("USA");
        Person person4 = new Person("UK");

        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);

        System.out.println("Коллекция в начале работы программы: ");
        for (Person name : list) {

            System.out.println(name);
        }
        System.out.println("\n");

        Person person5 = new Person("Japan");
        Person person6 = new Person("Egypt");
        Person person7 = new Person("Ukrain");

        list.addLast(person5);
        list.addFirst(person6);
        list.add(1, person7);

        System.out.println("Коллекция после добавленния трёх элементов к текущим: ");
        System.out.printf("В списке %d элементов \n", list.size());
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("\n");

        Person person8 = new Person("Aphganistan");

        System.out.println("Выведем второе значение в консоль: ");
        System.out.println(list.get(1));
        System.out.println("\n");

        list.set(1, person8);
        System.out.println("Новая коллекция: ");
        for (Person name : list) {

            System.out.println(name);
        }
        System.out.println("\n");

        System.out.println(list.isEmpty());
        if (list.contains(person7)) {
            System.out.println("Список содержит государство Украина");
        } else {  System.out.println("Список не содержит государство Украина"); }
        System.out.println("\n");

        list.remove(person7);
        list.removeFirst();
        list.removeLast();

        System.out.println("Выведем коллекцию без удаленных элементов: ");
        for (Person value : list) {

            System.out.println(value.getName());
        }
        System.out.println("\n");

        Person first = list.getFirst();
        System.out.println(first.getName());
        System.out.println("\n");

        System.out.println("Удалим все элементы коллекции: ");
        Iterator<Person> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            iterator2.next();
            iterator2.remove();
        }
        for (Person name : list) {

            System.out.println(name);
        }
        System.out.println(list.isEmpty());
    }
}