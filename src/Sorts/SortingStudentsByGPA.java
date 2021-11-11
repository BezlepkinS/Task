package Sorts;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getGPA(), o2.getGPA());
    }
}