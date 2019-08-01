import java.util.Scanner;


public class game_shop {

    public static void shop(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("You stumble into town after a long trek though the bandit filled forrest. " +
                "\nTime to spend your hard earned coin!" +
                "\nWhat would you like to do in town?:\n" +
                "\nSleep = Sleep at an Inn. [heal back to half your max HP and move to next scene]" +
                "\nBuy = Buy some stuff! [use coin to buy new items]" +
                "\nLevel = Go to the gym and learn something new. [improve a stat, gain a special move, and more!]" +
                "\nParty = Start a wild rager and get wrecked. Who knows what'll happen? [random town event occurs]");
        String resp = scanner.nextLine().toLowerCase();
        switch (resp) {
            case "sleep":

                break;
            case "buy":

                break;
            case "level":

                break;
            case "party":

                break;
            default:

        }
    }
}
