package Sorts;

public class Student implements Comparable<Student>{
    private int iDNumber;
    private double GPA;

    public Student(int iDNumber) {this.iDNumber = iDNumber;}
    public Student(double GPA) {this.GPA = GPA;}
    public Student(int iDNumber, double GPA) {
        this.iDNumber = iDNumber;
        this.GPA = GPA;
    }

    public double getGPA() {return GPA;}

    public void setGPA(int GPA) {this.GPA = GPA;}

    public int getIDNumber() {
        return iDNumber;
    }

    public void setIDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    @Override
    public int compareTo(Student o) {
        if (this.iDNumber == o.iDNumber) {
            return 0;
        } else if (this.iDNumber < o.iDNumber) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Student [iDNumber= " + iDNumber + ", GPA= " + GPA + "]";
    }
}