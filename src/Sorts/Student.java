package Sorts;

public class Student implements Comparable<Student>{
    private int idNumber;
    public Student(int idNumber) {
        this.idNumber = idNumber;
    }

    private double GPA;
    public Student(double GPA) {
        this.GPA = GPA;
    }

    public Student(int idNumber, double GPA) {
        this.idNumber = idNumber;
        this.GPA = GPA;
    }


    public double getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }


    @Override
    public int compareTo(Student o) {
        if (this.idNumber == o.idNumber) {
            return 0;
        } else if (this.idNumber < o.idNumber) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Student [iDNumber=" + idNumber + ", GPA=" + GPA + "]";
    }
}