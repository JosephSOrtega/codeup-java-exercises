package grades;

import java.util.ArrayList;

public class Student {
    String name;
    ArrayList grades;

    public Student(String name, ArrayList grades) {
        this.name = name;
        this.grades = grades;
    }
    // returns the student's name
    public String getName() {
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        this.grades;
    }


    public static void main(String[] args) {
        ArrayList<String> gradeList = new ArrayList<>();

    }
}
