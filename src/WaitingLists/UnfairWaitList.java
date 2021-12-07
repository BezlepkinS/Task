package WaitingLists;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {
        super();
    }

    public void remove(E element) {
// components.remove(element)
        // boolean removed = false;
        for (int i = 0; i < components.size(); i++) {
            E el = components.get(i);
            if (el.equals(element)) {
                if (i == 0)
                    System.err.println("Удаляемый элемент не может быть первым в очереди!");
                else {
                    components.remove(components.get(i));
                }
            }
        }
    }

        public void moveToBack(E element){
            int prevSize = components.size();
            remove(element);
            if (components.size() < prevSize) {
                components.add(element);
            }
        }
    }