package Sorts;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student>{

    @Override
    public int compare(Student object1, Student object2) {
        return Double.compare(object1.getGPA(), object2.getGPA());
    }
}