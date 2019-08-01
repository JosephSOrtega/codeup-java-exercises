package movies;

import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;

        for (int i = 1; counter > 0; i++) {
            System.out.println("What would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n");
            String res = scanner.nextLine();


            if (res.equalsIgnoreCase("0")) {
                System.out.println("\nThanks for using Movies-R-Us!");
                System.exit(0);

            } else if (res.equalsIgnoreCase("1")) {
                MoviesArray.findAll();
                for (Movie n : MoviesArray.findAll())
                    System.out.println(n.getName() + " -- " + n.getCat());

            } else if (res.equalsIgnoreCase("2")) {
                MoviesArray.findAll();
                for (Movie n : MoviesArray.findAll())
                    if (n.getCat().equalsIgnoreCase("animated")) {
                        System.out.println(n.getName() + " -- " + n.getCat());
                    }


            } else if (res.equalsIgnoreCase("3")) {
                MoviesArray.findAll();
                for (Movie n : MoviesArray.findAll())
                    if (n.getCat().equalsIgnoreCase("drama")) {
                        System.out.println(n.getName() + " -- " + n.getCat());
                    }

            } else if (res.equalsIgnoreCase("4")) {
                MoviesArray.findAll();
                for (Movie n : MoviesArray.findAll())
                    if (n.getCat().equalsIgnoreCase("horror")) {
                        System.out.println(n.getName() + " -- " + n.getCat());
                    }

            } else if (res.equalsIgnoreCase("5")) {
                MoviesArray.findAll();
                for (Movie n : MoviesArray.findAll())
                    if (n.getCat().equalsIgnoreCase("scifi")) {
                        System.out.println(n.getName() + " -- " + n.getCat());
                    }

            } else {
                System.out.println("I didn't understand. Try again.");
            }
            System.out.println("\nWant to go back to the main menu? [y/n]\n");
            String answ = scanner.nextLine();
            if (answ.equalsIgnoreCase("y")) {
                counter = 1;
            } else if (answ.equalsIgnoreCase("n")){
                System.out.println("\nThanks for using Movies-R-Us!");
                counter = -1;
            } else {
                System.out.println("I didn't understand. Try again.");
            }

        }

    }

}
