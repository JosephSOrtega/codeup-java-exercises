package grades;

import java.util.ArrayList;

public class Student {
    String name;
    ArrayList grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Double>();
    }

    // returns the student's name
    public String getName() {
        System.out.println(this.name);
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(double grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double total = 0;

        for (Object num : this.grades) {
            double nums = (double) num;
            total += nums;
        }
        total /= this.grades.size();
        System.out.println(total);
        return total;

    }




    public static void main(String[] args) {

        Student example = new Student("namesHere");
        example.getName();
        example.addGrade(5);
        example.addGrade(4);
        example.addGrade(5);
        example.addGrade(3);
        example.addGrade(5);
        example.getGradeAverage();
    }

}
