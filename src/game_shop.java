import java.util.Scanner;


public class game_shop {

    private int sceneCounter = 0;

    public static void shop() {
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
                sleep();
                break;
            case "buy":
                buy();
                break;
            case "level":
                level();
                break;
            case "party":
                party();
                break;
            default:
                shop();
        }
    }

    public static void sleep() {
        int healed = game_story.character.maxHP / 2;
        game_story.character.hp += healed;
        if (game_story.character.hp > game_story.character.maxHP) {
            game_story.character.hp = game_story.character.maxHP;
        }
        System.out.println("You get some much needed rest. You heal " + healed + "HP before you head on out to the next stop on your journey!");
    }

    public static void buy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You waltz into a dusty shop, pockets jingling with coin. What do you buy?:" +

// uncomment when gold is added to character
//                "\nYou currently have " + game_story.character.gold + "Gold.\n" +
                "\nMolotov: 1d4 damage & -2 mp every round over 1d2+AGI rounds (1 Gold) [molotov]\n" +
                "Extra Sharp Blade: -2 enemy armor (2 Gold) [blade]\n" +
                "Lucky Charm: next time you die, you instead come back to life with 5 HP as the charm breaks. (3 Gold) [charm]\n" +
                "Shield: +1 armor (2 Gold) [shield]\n" +
                "Plate Mail: +2 armor, -1 AGI (+2 STR required) (3 Gold) [mail]\n" +
                "Flash Powder: enemy stun for d3 rounds. (1 Gold) [powder]\n" +
                "Drunken Adventurer’s Healing “potion”:  +10 HP, -1 forward to next roll. (1 Gold) [potion]\n" +
                "Vampiric Stone: 10% of all damage dealt heals you. (2 Gold) [stone]\n" +
                "Spell Scroll - Plague: deals 1d6 damage and enemies deal 1/2 damage for 1d3 rounds. (+2 SHP required). (2 Gold) [scroll]\n" +
                "Cool Hat: +1 PRE for a Scene. (1 Gold) [hat]\n" +
                "Cliff Bar: +1 energy (1 Gold) [bar]\n");
        String buying = scanner.nextLine().toLowerCase();
        switch (buying) {
            case "molotov":
                if (1 > game_story.character.gold) {
                    System.out.println("Hey! You dont have enough gold! Pick something else.");
                    shop();
                } else {
                    game_story.character.gold -= 1;
                    game_story.character.molotov += 1;
                }
                break;
            case "blade":
                if (2 > game_story.character.gold) {
                    System.out.println("Hey! You dont have enough gold! Pick something else.");
                    shop();
                } else {
                    game_story.character.gold -= 2;
                    game_story.character.blade += 1;
                }

                break;
            case "charm":
                if (3 > game_story.character.gold) {
                    System.out.println("Hey! You dont have enough gold! Pick something else.");
                    shop();
                } else {
                    game_story.character.gold -= 3;
                    game_story.character.charm += 1;
                }
                break;
            case "shield":
                if (2 > game_story.character.gold) {
                    System.out.println("Hey! You dont have enough gold! Pick something else.");
                    shop();
                } else {
                    game_story.character.gold -= 2;
                    game_story.character.shield += 1;
                }
                break;
            case "mail":
                if (3 > game_story.character.gold) {
                    System.out.println("Hey! You dont have enough gold! Pick something else.");
                    shop();
                } else {
                    game_story.character.gold -= 3;
                    game_story.character.mail += 1;
                }
                break;
            case "powder":
                if (1 > game_story.character.gold) {
                    System.out.println("Hey! You dont have enough gold! Pick something else.");
                    shop();
                } else {
                    game_story.character.gold -= 1;
                    game_story.character.powder += 1;
                }

                break;
            case "potion":
                if (1 > game_story.character.gold) {
                    System.out.println("Hey! You dont have enough gold! Pick something else.");
                    shop();
                } else {
                    game_story.character.gold -= 1;
                    game_story.character.potion += 1;
                }

                break;
            case "stone":
                if (2 > game_story.character.gold) {
                    System.out.println("Hey! You dont have enough gold! Pick something else.");
                    shop();
                } else {
                    game_story.character.gold -= 2;
                    game_story.character.stone += 1;
                }

                break;
            case "scroll":
                if (2 > game_story.character.gold) {
                    System.out.println("Hey! You dont have enough gold! Pick something else.");
                    shop();
                } else {
                    game_story.character.gold -= 2;
                    game_story.character.scroll += 1;
                }

                break;
            case "hat":
                if (1 > game_story.character.gold) {
                    System.out.println("Hey! You dont have enough gold! Pick something else.");
                    shop();
                } else {
                    game_story.character.gold -= 1;
                    game_story.character.hat += 1;
                }

                break;
            case "bar":
                if (1 > game_story.character.gold) {
                    System.out.println("Hey! You dont have enough gold! Pick something else.");
                    shop();
                } else {
                    game_story.character.gold -= 1;
                    game_story.character.bar += 1;
                }

                break;
            default:
                System.out.println("Hey! Pick an actual option.");
                buy();
        }

    }
}
