import java.util.Scanner;

public class Rager {

    static int partyBonus;
    static int allNighter;
    static int kickedOut = 0;

    public static void rager() {
        int result = game_story.twoDice(6) + game_story.character.presence + partyBonus;

        if (result <= 6) {
            System.out.println("You rolled a miss! Oh no! " +
                    "\nThat village grog got the best of you as you did something so shameful and wild, the townies kicked you out of town!" +
                    "\nBetter move on to the next scene then...");
            game_story.character.misses += 1;
            kickedOut += 1;
        } else if (result >= 7 && result <= 9) {
            System.out.println(("You rolled a mixed success!"));
            System.out.println("You're drinking way too much and are going to feel it later. " +
                    "\nYou take a -1 to your next roll, but the party was a huge success! Lets see what happened...");
            Items.negForward += 1;


        } else if (result >= 10) {
            System.out.println("You rolled a success with little consequence!");
            System.out.println("The party was a huge success! Lets see what happened...");
        }




        if (kickedOut >= 1) {
            kickedOut = 0;
            //Next scene

        } else if (allNighter >= 1) {
            System.out.println("You lost count of how many meads you had. Better start counting again!");
            game_shop.party();
        } else {
            game_shop.town();
        }


//Party Results
        int partyTime = game_story.dice(6) + partyBonus;


        switch (partyTime) {
            case 1:

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;


            case 5:

                break;

            case 6:

                break;

            default:

        }

    }

}
