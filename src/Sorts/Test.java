package Sorts;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        Student[] Students1 = new Student[4];
        Students1[0] = new Student (12, 7);
        Students1[1] = new Student (14, 12);
        Students1[2] = new Student (76, 4);
        Students1[3] = new Student (3, 11);

        Student[] Students2 = new Student[5];
        Students2[0] = new Student(213, 3);
        Students2[1] = new Student(12, 9);
        Students2[2] = new Student(142, 18);
        Students2[3] = new Student(7234, 9);
        Students2[4] = new Student(4, 5);

        Student[] currentStudents = new Student[Students1.length + Students2.length];
        System.out.println("Insertion sort by iDNumber: ");
        for (int i = 1; i < Students1.length; i++) {
            Student current = Students1[i];
            int j = i-1;
            for(; j >= 0 && current.compareTo(Students1[j]) < 0; j--) {
                Students1[j+1] = Students1[j];
            }
            Students1[j+1] = current;
        }
        for (Student student : Students1) {
            System.out.println(student);
        }

        SortingStudentsByGPA gpaComparator = new SortingStudentsByGPA();
        quickSort(Students1, 0, Students1.length-1, gpaComparator);

        System.out.println("\nQuick sort by GPA: ");
        for (Student s : Students1) {
            System.out.println(s);
        }

        System.out.println("\nMerged array: ");
        merge(Students1, Students2, currentStudents, gpaComparator);
        for (Student s : currentStudents) {
            System.out.println(s);
        }

        System.out.println("\nSorted merged array by GPA: ");
        mergeSort(currentStudents, 0, currentStudents.length-1, gpaComparator);
        for (Student l : currentStudents) {
            System.out.println(l);
        }

    }

    private static void quickSort(Student[] source, int leftBorder, int rightBorder, Comparator<Student> c) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student pivot = source[(leftMarker + rightMarker) / 2];
        do {

            while (c.compare(source[leftMarker], pivot) > 0) {
                leftMarker++;
            }

            while (c.compare(source[rightMarker], pivot) < 0) {
                rightMarker--;
            }

            if (leftMarker <= rightMarker) {

                if (leftMarker < rightMarker) {
                    Student tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }

                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);


        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder, c);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker, c);
        }
    }

    public static void merge(Student[] a, Student[]b, Student[]c, Comparator<Student> d){
        int cursorA = 0,cursorB = 0,cursorC = 0;
        int sizeA = a.length;
        int sizeB = b.length;

        while(cursorA < sizeA && cursorB < sizeB){
            if (d.compare(a[cursorA], b[cursorB]) > 0){
                c[cursorC++] = a[cursorA++];
            }else{
                c[cursorC++] = b[cursorB++];
            }
        }
        while(cursorA < sizeA){
            c[cursorC++] = a[cursorA++];
        }
        while(cursorB < sizeB){
            c[cursorC++] = b[cursorB++];
        }
    }

    public static void mergeSort(Student[] array, int low, int high, Comparator<Student> d) {
        if (high <= low) return;

        int mid = (low+high)/2;
        mergeSort(array, low, mid, d);
        mergeSort(array, mid+1, high, d);
        mergeMerge(array, low, mid, high, d);
    }

    public static void mergeMerge(Student[] array, int low, int mid, int high, Comparator<Student> d ) {

        Student[] leftStudent = new Student[mid - low + 1];
        Student[] rightStudent = new Student[high - mid];

        for (int i = 0; i < leftStudent.length; i++)
            leftStudent[i] = array[low + i];
        for (int i = 0; i < rightStudent.length; i++)
            rightStudent[i] = array[mid + i + 1];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = low; i < high + 1; i++) {

            if (leftIndex < leftStudent.length && rightIndex < rightStudent.length) {
                if (d.compare(leftStudent[leftIndex], rightStudent[rightIndex]) < 0) {
                    array[i] = leftStudent[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightStudent[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftStudent.length) {
                array[i] = leftStudent[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightStudent.length) {
                array[i] = rightStudent[rightIndex];
                rightIndex++;
            }
        }
    }
}