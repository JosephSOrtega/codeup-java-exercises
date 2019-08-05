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
            game_shop.partiesHad = 1;
            game_shop.town();
        }


//Party Results
        int partyTime = game_story.dice(6);


        switch (partyTime) {
            case 1:
//                Lost an item instead?
                int dam = game_story.dice(6);
                game_story.character.hp -= dam;
                System.out.println("Oh shit. " +
                        "\nYou're sore as hell and must have started a fight last night." +
                        "\nYou're really feeling it today, you take " + dam + "damage.");
                game_shop.town();
                break;
            case 2:
                System.out.println("Upon awaking in the morning, you realize your backpack is heavier than it used to be." +
                        "\n When you open the bag to investigate, you find...");
                int rando = game_story.dice(6);

                int killIt2 = 1;
                do {
                    if (rando == 1 && Items.molotov >= 1 ||
                            rando == 2 && Items.charm >= 1 ||
                            rando == 3 && Items.shield >= 1) {
                        rando += 1;
                    } else if (rando == 4 && Items.hat >= 1){
                        rando = 1;
                    } else {
                        killIt2 = 0;
                    }
                } while (killIt2 == 1);

                switch (rando) {
                    case 1:
                        int gold = game_story.twoDice(6) + game_story.character.presence;
                        Items.gold += gold;
                        System.out.println(gold + " gold!");
                        break;
                    case 2:
                        Items.gold += game_story.character.presence + 1;
                        Items.molotov += 1;
                        System.out.println(game_story.character.presence + 1 + " gold and a Molotov!");

                        break;
                    case 3:
                        Items.gold += game_story.character.presence + 1;
                        Items.charm += 1;
                        System.out.println(game_story.character.presence + 1 + " gold and a Lucky Charm!");

                        break;
                    case 4:
                        Items.gold += game_story.character.presence + 1;
                        Items.potion += 1;
                        System.out.println(game_story.character.presence + 1 + " gold and a \"healing\" potion!");

                        break;
                    case 5:
                        Items.gold += game_story.character.presence + 1;
                        Items.shield += 1;
                        System.out.println(game_story.character.presence + 1 + " gold and a Shield!");

                        break;
                    default:
                        Items.gold += game_story.character.presence + 1;
                        Items.hat += 1;
                        System.out.println(game_story.character.presence + 1 + " gold and a Cool Hat!");
                }
                game_shop.town();
                break;
////////////
            case 3:
                System.out.println("You wake up in the town gym with sore muscles and vague memories of a workout montage." +
                        "\n you gain...");
                int gains = game_story.dice(6);
                int killIt = 1;

                do {
                    if (gains == 1 && game_story.character.strength >= 2 ||
                            gains == 2 && game_story.character.agility >= 2 ||
                            gains == 3 && game_story.character.sharp >= 2 ||
                            gains == 4 && game_story.character.presence >= 2) {
                        gains += 1;
                    } else {
                        killIt = 0;
                    }
                } while (killIt == 1);


                switch (gains) {
                    case 1:
                        game_story.character.presence += 1;
                        System.out.println(" +1 to Strength!");
                        break;
                    case 2:
                        game_story.character.presence += 1;
                        System.out.println(" +1 to Agility!");

                        break;
                    case 3:
                        game_story.character.presence += 1;
                        System.out.println(" +1 to Sharp!");

                        break;
                    case 4:
                        game_story.character.presence += 1;
                        System.out.println(" +1 to Presence!");

                        break;
                    default:
                        game_story.character.presence += 1;
                        System.out.println(" +1 to Energy!");
                }
                game_shop.town();
                break;
////////////
            case 4:

                break;

////////////
            case 5:

                break;
////////////
            case 6:

                break;

            default:

////////////
        }

    }

}
