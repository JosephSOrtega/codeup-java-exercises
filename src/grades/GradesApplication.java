package grades;

import java.util.HashMap;
import java.util.Scanner;

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

        System.out.println(students.get("JosephSOrtega"));
        System.out.println(students.get("JohnDoe"));
        System.out.println(students.get("JaneDoe"));
        System.out.println(students.get("DaveDudeman"));


//        Ex 3 v Ex 2 ^

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!\n+" +
                "Here are the GitHub usernames of our students:\n " +
                "|JosephSOrtega| |JohnDoe| |JaneDoe| |DaveDudeman|");

        String cont = "y";
        do {
            System.out.println("What student would you like to see more information on?");
            String answer = scanner.nextLine();

            if (students.containsKey(answer)) {
                System.out.println("Name: " + students.get(answer) + " - GitHub Username: " + students.get(answer).getName());
                System.out.println("Current Average: " + students.get(answer).getGradeAverage() + "\n");
                System.out.println("Would you like to see another student? [y/n]");
                cont = scanner.nextLine();
            } else {
                System.out.println("Sorry, no student found with the GitHub username of \"" + answer + "\".");
            }

        } while (cont.equalsIgnoreCase("y"));
        System.out.println("Goodbye, and have a wonderful day!");

    }

//Loop through hashmap to see info:
//    for (Integer ssn : people.keyset()) {
//        System.out.println("ssn = " + ssn);
//        System.out.println("ssn = " + people.get(ssn).toUpperCase());
//}
}
