package WaitingLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class WaitList<E> implements IWaitList<E>{
    protected LinkedList<E> components;

    public WaitList(){
        components = new LinkedList<>();
    }
    public WaitList(Collection<E> collection){
        components = new LinkedList<>(collection);
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "components=" + components +
                '}';
    }

    @Override
    public void add(E element) {
        components.add(element);
    }

    @Override
    public E remove() {
        if(isEmpty()) throw new IllegalStateException("Очередь пуста!");
        return components.remove();
    }
    @Override
    public boolean contains(E element) {
        boolean result = false;
        for(int i = 0; i < components.size(); i++){
            E el = components.remove();
            if(el.equals(element))
                result = true;
            components.add(el);
        }
        return result;
    }

    @Override
    public boolean containsAll(Collection<E> collection) {
        ArrayList<E> al = new ArrayList<>(collection);
        for(int i = 0; i < collection.size(); i++){
            boolean result = false;
            for(int j = 0; j < components.size(); j++){
                E el = components.remove();
                if(el.equals(al.get(i)))
                    result = true;
                components.add(el);
            }
            if(!result) return false;
        }
        return true;
    }
    @Override
    public boolean isEmpty() {
        return components.isEmpty();
    }
}