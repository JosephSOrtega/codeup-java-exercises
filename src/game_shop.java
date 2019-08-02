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

                "\nYou currently have " + Items.gold + "Gold.\n" +
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
                if (1 > Items.gold) {
                    System.out.println("Hey! You don't have enough gold! Pick something else.");
                    shop();
                } else {
                    Items.gold -= 1;
                    Items.molotov += 1;
                }
                break;
            case "blade":
                if (2 > Items.gold) {
                    System.out.println("Hey! You don't have enough gold! Pick something else.");
                    shop();
                } else {
                    Items.gold -= 2;
                    Items.blade += 1;
                }

                break;
            case "charm":
                if (3 > Items.gold) {
                    System.out.println("Hey! You don't have enough gold! Pick something else.");
                    shop();
                } else {
                    Items.gold -= 3;
                    Items.charm += 1;
                }
                break;
            case "shield":
                if (2 > Items.gold) {
                    System.out.println("Hey! You don't have enough gold! Pick something else.");
                    shop();
                } else {
                    Items.gold -= 2;
                    Items.shield += 1;
                }
                break;
            case "mail":
                if (3 > Items.gold) {
                    System.out.println("Hey! You don't have enough gold! Pick something else.");
                    shop();
                } else {
                    Items.gold -= 3;
                    Items.plate += 1;
                }
                break;
            case "powder":
                if (1 > Items.gold) {
                    System.out.println("Hey! You don't have enough gold! Pick something else.");
                    shop();
                } else {
                    Items.gold -= 1;
                    Items.powder += 1;
                }

                break;
            case "potion":
                if (1 > Items.gold) {
                    System.out.println("Hey! You don't have enough gold! Pick something else.");
                    shop();
                } else {
                    Items.gold -= 1;
                    Items.potion += 1;
                }

                break;
            case "stone":
                if (2 > Items.gold) {
                    System.out.println("Hey! You don't have enough gold! Pick something else.");
                    shop();
                } else {
                    Items.gold -= 2;
                    Items.stone += 1;
                }

                break;
            case "scroll":
                if (2 > Items.gold) {
                    System.out.println("Hey! You don't have enough gold! Pick something else.");
                    shop();
                } else {
                    Items.gold -= 2;
                    Items.scroll += 1;
                }

                break;
            case "hat":
                if (1 > Items.gold) {
                    System.out.println("Hey! You don't have enough gold! Pick something else.");
                    shop();
                } else {
                    Items.gold -= 1;
                    Items.hat += 1;
                }

                break;
            case "bar":
                if (1 > Items.gold) {
                    System.out.println("Hey! You don't have enough gold! Pick something else.");
                    shop();
                } else {
                    Items.gold -= 1;
                    Items.bar += 1;
                }

                break;
            default:
                System.out.println("Hey! Pick an actual option.");
                buy();
        }

    }

    public static void level() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You enter the musty gym and spend some time training. Pick one of the following to train by spending XP:\n" +
                "\nLevel up Strength. Increase your STR by 1. (2 XP) [str]\n" +
                "Level up Agility. Increase your STR by 1. (2 XP) [agi]\n" +
                "Level up Sharp. Increase your STR by 1. (2 XP)[shp]\n" +
                "Level up Presence. Increase your STR by 1. (2 XP) [pre]\n" +
                "Increase your max HP by 3 and gain 3 HP. (2 XP) [hp]\n" +
                "Increase your max Energy by 1 and gain 1 Energy. (2 XP) [energy]\n" +
                "Learn a new class special move. (3 XP) [move]\n" +
                "Gain a +1 to your next roll. (1 XP) [roll]\n" +
                "\n* Note: Your stats cap at +2 maximum.\n");
        String spendXP = scanner.nextLine().toLowerCase();
        switch (spendXP) {
            case "str":
                if (2 > Items.xp) {
                    System.out.println("Hey! You don't have enough XP! Pick something else.");
                    level();
                } else if (2 >= game_story.character.strength) {
                    System.out.println("Hey! You don't have enough XP! Pick something else.");
                    level();
                } else {
                    Items.xp -= 2;
                    game_story.character.strength += 1;
                }
                break;
            case "agi":
                if (2 > Items.xp) {
                    System.out.println("Hey! You don't have enough XP! Pick something else.");
                    level();
                } else if (2 >= game_story.character.agility) {
                    System.out.println("Hey! You don't have enough XP! Pick something else.");
                    level();
                } else {
                    Items.xp -= 2;
                    game_story.character.agility += 1;
                }
                break;
            case "shp":
                if (2 > Items.xp) {
                    System.out.println("Hey! You don't have enough XP! Pick something else.");
                    level();
                } else if (2 >= game_story.character.sharp) {
                    System.out.println("Hey! You don't have enough XP! Pick something else.");
                    level();
                } else {
                    Items.xp -= 2;
                    game_story.character.sharp += 1;
                }
                break;
            case "pre":
                if (2 > Items.xp) {
                    System.out.println("Hey! Your stat is already capped out! Pick something else.");
                    level();
                } else if (2 >= game_story.character.presence) {
                    System.out.println("Hey! You don't have enough XP! Pick something else.");
                    level();
                } else {
                    Items.xp -= 2;
                    game_story.character.presence += 1;
                }
                break;
//
            case "hp":
                if (2 > Items.xp) {
                    System.out.println("Hey! Your stat is already capped out! Pick something else.");
                    level();
                } else {
                    Items.xp -= 2;
                    game_story.character.maxHP += 3;
                    game_story.character.hp += 3;
                }
                break;
            case "energy":
                if (2 > Items.xp) {
                    System.out.println("Hey! Your stat is already capped out! Pick something else.");
                    level();
                } else {
                    Items.xp -= 2;
                    Items.energy += 1;
                    Items.maxEnergy += 1;
                }
                break;

            case "move":
                if (3 > Items.xp) {
                    System.out.println("Hey! Your stat is already capped out! Pick something else.");
                    level();
                } else if (3 >= Items.moveLevel) {
                    System.out.println("Hey! You don't have enough XP! Pick something else.");
                    level();
                } else {
                    Items.xp -= 3;
                    Items.moveLevel += 1;
                }
                break;

            case "roll":
                if (1 > Items.xp) {
                    System.out.println("Hey! Your stat is already capped out! Pick something else.");
                    level();
                } else {
                    Items.xp -= 1;
                    Items.bonusForward += 1;
                }
                break;
            default:
                System.out.println("Hey! Pick an actual option.");
                buy();

        }
    }

    public static void party() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What better way is there to spend coin than to throw a wild party!" +

                "\nYou currently have " + Items.gold + "Gold.\n" +
                "\nWhenever you throw a wicked rager in town, it costs Gold. The more Gold you spend, the better the party!\n" +
                "Whenever you throw a party, you roll +PRE +Gold spent.\n " +
                "Since the townies are all lightweights, you can only throw one party per visit to town.\n" +
                "What type of party will you throw?:\n" +
                "\nBarroom Blitz (Costs 1 Gold, +1 to Party roll) [blitz]" +
                "\nStreet-wide Mosh Pit (Costs 2 Gold, +1 to Party roll) [street]" +
                "\nParty Rockin in the Big House (Costs 3 Gold, +3 to Party roll) [rock]" +
                "\nA Rager of a Lifetime (Costs 4 Gold, +4 to Party roll) [rager]" +
                "All-nighter (Costs  2 Gold, +1 to this Party roll & roll for a second Party) [night]");
        String wOoOo = scanner.nextLine().toLowerCase();
        switch (wOoOo) {
            case "blitz":
                if (1 > Items.gold) {
                    System.out.println("Hey! You don't have enough gold! Pick something else.");
                    shop();
                } else {
                    Items.gold -= 1;
                    Items.molotov += 1;
                }
                break;
            case "street":
                if (2 > Items.gold) {
                    System.out.println("Hey! You don't have enough gold! Pick something else.");
                    shop();
                } else {
                    Items.gold -= 2;
                    Items.blade += 1;
                }

                break;
            case "rock":
                if (3 > Items.gold) {
                    System.out.println("Hey! You don't have enough gold! Pick something else.");
                    shop();
                } else {
                    Items.gold -= 3;
                    Items.charm += 1;
                }
                break;
            case "rager":
                if (2 > Items.gold) {
                    System.out.println("Hey! You don't have enough gold! Pick something else.");
                    shop();
                } else {
                    Items.gold -= 2;
                    Items.shield += 1;
                }
                break;
            case "night":
                if (3 > Items.gold) {
                    System.out.println("Hey! You don't have enough gold! Pick something else.");
                    shop();
                } else {
                    Items.gold -= 3;
                    Items.plate += 1;
                }
                break;

            default:
                System.out.println("Hey! Pick an actual option.");
                buy();
        }

    }
}