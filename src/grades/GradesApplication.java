package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        students.put("JosephSOrtega", new Student("Joseph"));
        students.get("JosephSOrtega").addGrade(5);
        students.get("JosephSOrtega").addGrade(5);
        students.get("JosephSOrtega").addGrade(4);

        students.put("JohnDoe", new Student("John"));
        students.get("JohnDoe").addGrade(5);
        students.get("JohnDoe").addGrade(4);
        students.get("JohnDoe").addGrade(4);

        students.put("JaneDoe", new Student("Jane"));
        students.get("JaneDoe").addGrade(5);
        students.get("JaneDoe").addGrade(3);
        students.get("JaneDoe").addGrade(5);

        students.put("DaveDudeman", new Student("Dave"));
        students.get("DaveDudeman").addGrade(2);
        students.get("DaveDudeman").addGrade(3);
        students.get("DaveDudeman").addGrade(2);

        System.out.println(students.get("JosephSOrtega").getGradeAverage());
        System.out.println(students.get("JohnDoe").getGradeAverage());
        System.out.println(students.get("JaneDoe").getGradeAverage());
        System.out.println(students.get("DaveDudeman").getGradeAverage());



    }
}
