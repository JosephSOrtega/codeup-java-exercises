package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);
//    private Scanner scanner;

//    private Input() {
//        this.scanner = new Scanner(System.in);
//    }

    public String getString() {
        System.out.println("String Here");
        return ("String Here");
    }

    public  boolean yesNo() {
        System.out.println("enter [y/n]");
        String a = scanner.nextLine();
        if (a.startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.println("enter a num btw " +min+"-" +max);
        int num = scanner.nextInt();
        if (num > min && num < max) {
            return num;
        } else {
            return getInt(min, max);
        }

    }

    public int getInt() {
        System.out.println("enter a num btw 1-10:");
        int num = scanner.nextInt();
        if (num > 1 && num < 10) {
            return num;
        } else {
            return getInt();
        }
//        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.println("enter a num btw " +min+"-" +max);
        int num = scanner.nextInt();
        if (num > min && num < max) {
            return num;
        } else {
            return getDouble(min, max);
        }

    }

    public double getDouble() {
        System.out.println("enter a num btw 1-10:");
        int num = scanner.nextInt();
        if (num > 1 && num < 10) {
            return num;
        } else {
            return getDouble();
        }
    }
}
