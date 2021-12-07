package WaitingLists;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Element2");
        al.add("Element3");

        WaitList<String> wl = new WaitList<>();
        wl.add("Element1");
        wl.add("Element2");
        wl.add("Element3");

        System.out.println(wl);
        System.out.println(wl.remove());
        System.out.println(wl);
        System.out.println(wl.isEmpty());
        System.out.println(wl.contains("Element1"));
        System.out.println(wl.containsAll(al));

        BoundedWaitList<String> bwl = new BoundedWaitList<>(3);
        bwl.add("Element1");
        bwl.add("Element2");
        bwl.add("Element3");
        System.out.println(bwl);
        try{
            bwl.add("Element4");
        }catch (Exception exception){
            exception.printStackTrace();
        }
        System.out.println(bwl);
        System.out.println(bwl.getCapacity());

        bwl = new BoundedWaitList<String>(al);
        System.out.println(bwl.getCapacity());

        try{
            bwl.add("Element4");
        }catch (Exception e){
            e.printStackTrace();
        }

        UnfairWaitList<Integer> uwl = new UnfairWaitList<>();
        uwl.add(1);
        uwl.add(2);
        uwl.add(4);
        uwl.add(5);
        uwl.add(5);
        uwl.add(6);
        System.out.println(uwl);

        uwl.remove(5);
        System.out.println(uwl);
        uwl.moveToBack(4);
        System.out.println(uwl);
    }
}
