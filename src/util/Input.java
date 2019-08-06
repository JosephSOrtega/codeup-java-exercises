package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }
    public String getString(String prompt) {
        System.out.println(prompt);
        return this.getString();
    }

    public boolean yesNo() {
        String answer = this.scanner.nextLine();
        if (answer.equalsIgnoreCase("y")
                || answer.equalsIgnoreCase("yes")) {
            return true;
        } else return false;
    }
    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        return this.yesNo();
    }

    public int getInt(int min, int max) {
        do {
            System.out.printf("Please enter a number between %d and %d : ", min, max);
            int answer = this.scanner.nextInt();
            if (answer >= min && answer <= max) {
                return answer;
            }
        } while (true);
    }

    public int getInt() {
        return this.scanner.nextInt();
    }
    public int getInt(String prompt) {
        System.out.println(prompt);
        return this.getInt();
    }

    public double getDouble(double min, double max) {
        do {
            System.out.printf("Please enter a number between %d and %d : ", min, max);
            double answer = this.scanner.nextDouble();
            if (answer >= min && answer <= max) {
                return answer;
            }
        } while (true);

    }
    public double getDouble() {
        return this.scanner.nextDouble();
    }
    public double getDouble(String prompt) {
        System.out.println(prompt);
        return this.getDouble();
    }

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Enter your answer (y|n)?");
        System.out.println(input.yesNo());
        System.out.println(input.getInt(1,10));
    }
}





//Old Shit V

//package util;
//
//import java.util.Scanner;
//
//public class Input {
//    private Scanner scanner = new Scanner(System.in);
////    private Scanner scanner;
//
////    private Input() {
////        this.scanner = new Scanner(System.in);
////    }
//
//    public String getString() {
//        System.out.println("String Here");
//        return ("String Here");
//    }
//
//    public boolean yesNo() {
//        System.out.println("enter [y/n]");
//        String a = scanner.nextLine();
//        if (a.startsWith("y")) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public int getInt(int min, int max) {
//        System.out.println("enter a num btw " + min + "-" + max);
//        int num = scanner.nextInt();
//        if (num > min && num < max) {
//            return num;
//        } else {
//            return getInt(min, max);
//        }
//
//    }
//
//    public int getInt() {
//        System.out.println("enter a num btw 1-10:");
//        int num = scanner.nextInt();
//        if (num > 1 && num < 10) {
//            return num;
//        } else {
//            return getInt();
//        }
////        return this.scanner.nextInt();
//    }
//
//    public double getDouble(double min, double max) {
//        System.out.println("enter a num btw " + min + "-" + max);
//        int num = scanner.nextInt();
//        if (num > min && num < max) {
//            return num;
//        } else {
//            return getDouble(min, max);
//        }
//
//    }
//
//    public double getDouble() {
//        System.out.println("enter a num btw 1-10:");
//        int num = scanner.nextInt();
//        if (num > 1 && num < 10) {
//            return num;
//        } else {
//            return getDouble();
//        }
////        System.out.println("enter a num btw 1-10:");
////        int num = scanner.nextInt();
////        if (num > 1 && num < 10) {
////            return num;
////        } else {
////            return getDouble(prompt);
////        }
//////        return this.scanner.getDouble();
////    }
//
//    }
////    public double getDouble() {
////        return this.scanner.nextDouble();
////    }
////    public double getDouble(String prompt) {
////
////    }
//
//}
