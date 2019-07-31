import java.util.Scanner;


public class game_story {
    public static void main(String[] args) {
        intro();
    }

    private static int dice(int side) {
        double roll = Math.ceil(Math.random() * side);
        return (int) roll;
    }

    private static int twoDice(int side) {
        int rollOne = (int) Math.ceil(Math.random() * side);
        int rollTwo = (int) Math.ceil(Math.random() * side);
        System.out.println("\nYour first roll was " + rollOne + " & your second roll was " + rollTwo);
        return rollOne + rollTwo;
    }


    //    Intro Section //////////////////////////////////////////////
    private static void intro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        character.name = scanner.nextLine();
        System.out.println("Hey there, " + character.name + "! Want to go on an adventure? [y/n]");
        String introAnswer = scanner.nextLine();
        if (introAnswer.contentEquals("n")) {
            System.out.println("Okay! Have a great day!");
        } else if (introAnswer.contentEquals("y")) {
            System.out.println("Let's get going, then!");
            classPicker();

        } else {
            System.out.println("I didnt understand. Please submit your answer again.");
            intro();
        }
    }

    private static class character {
        private static String name;
        private static int misses = 0;

        private static String yourClass;
        private static int hp;
        private static int strength;
        private static int agility;
        private static int sharp;
        private static int presence;
        private static int damageDie;
        private static String spell;
        private static int scenes = 0;
//        for later use
    }

    private static class baddie {
        private static int hp;
        private static int mp;
        private static int maxMp;
        private static int chase;
        private static int damageDie;
    }

    private static class rolls {
        private static int roll1;
    }

    private static class choices {
        private static String choice1;
        private static String choice2;
    }


    //    Class Selection //////////////////////////////////////////////
    private static void classPicker() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Oh shit, It's an adventurer! Quick, everyone hide! They always bring trouble. It looks like it is an....");
        System.out.println("What kind of adventurer are you? \n\nA Washed Up Knight? [knight] \nAn Incredibly Inept Wizard? [wizard] \nOr a Noisy Thief? [thief]");

        String yourChoice = scanner.nextLine();

        switch (yourChoice.toLowerCase()) {
            case "knight":
                character.yourClass = "Washed-up Knight";
                System.out.println("Dope! You are a " + character.yourClass + ", sworn to defend the real from all manner of thing. Too bad married life caught up with you.");
                character.hp = 24;
                character.strength = 2;
                character.agility = -1;
                character.sharp = 0;
                character.presence = 1;
                character.damageDie = 10;

                System.out.println("Your stats are: Strength = " + character.strength + ", Agility = " + character.agility + ", Sharp = " + character.sharp + ", and Presence = " + character.presence + "\n");
                break;

            case "wizard":
                character.yourClass = "Incredibly Inept Wizard";
                System.out.println("Rad! You are a " + character.yourClass + " of the high order! Too bad you have never actually casted a spell before...");
                character.hp = 16;
                character.strength = -1;
                character.agility = 0;
                character.sharp = 2;
                character.presence = 1;
                character.damageDie = 4;

                System.out.println("Your stats are: Strength = " + character.strength + ", Agility = " + character.agility + ", Sharp = " + character.sharp + ", and Presence = " + character.presence + "\n");
                break;

            case "thief":
                character.yourClass = "Noisy Thief";
                System.out.println("Sweet! Your steps as a " + character.yourClass + " might not be as quiet as a cat on the prowl, but you sure can use your claws!.");
                character.hp = 20;
                character.strength = 1;
                character.agility = 2;
                character.sharp = 0;
                character.presence = -1;
                character.damageDie = 8;

                System.out.println("Your stats are: Strength = " + character.strength + ", Agility = " + character.agility + ", Sharp = " + character.sharp + ", and Presence = " + character.presence + "\n");
                break;

            default:
                character.yourClass = "Mischievous";
                System.out.println("Hey, that wasn't an answer listed. Lets make you a " + character.yourClass + " instead.");
                character.hp = 18;
                character.strength = 0;
                character.agility = 1;
                character.sharp = -1;
                character.presence = 2;
                character.damageDie = 6;

                System.out.println("Your stats are: Strength = " + character.strength + ", Agility = " + character.agility + ", Sharp = " + character.sharp + ", and Presence = " + character.presence + "\n");
                break;
        }
        sceneOne();
    }

//    Scenario 1: Bandit trap /////////////////////////////////////////


    private static void sceneOne() {
        Scanner scanner = new Scanner(System.in);

//            Bandit stats declared/////////////////////////////////////////
        baddie.hp = 12;
        baddie.mp = 6;
        baddie.maxMp = 6;
        baddie.chase = -1;
        baddie.damageDie = 6;
//        End stats/////////////////////////////////////////

        System.out.println("After the town of friendly chased you out with torches and pitchforks, you continue on your way through the woods \nto get to the city of Whoknowsville.");
        System.out.println("*snap!* What was that? Hello? What do you do? \n\nWill you try to sneak past whatever is there? Type: AGI. \nWill you try to spot the danger before it strikes? Type: SHP. \nOr will you bellow out a challenge and rush into combat? Type: #bravebutfoolish.");

        choices.choice1 = scanner.nextLine().toLowerCase();
        switch (choices.choice1) {
            case "agi":
                System.out.println("As you try to be sneaky, we will roll to see what happens.");
                rolls.roll1 = twoDice(6) + character.agility;
                System.out.println("You rolled a total of " + rolls.roll1 + ". Lets see what they means for our adventurer...");
                agiSceneOne();
                break;
            case "shp":
                System.out.println("As you try spot the danger before it has the jump on you, we will roll to see what happens.");
                rolls.roll1 = twoDice(6) + character.sharp;
                System.out.println("You rolled a total of " + rolls.roll1 + ". Lets see what they means for our adventurer...");
                shpSceneOne();
                break;
            default:
                System.out.println("Shit, you made a lot of noise! Here they come....");
                shitHitsFanSceneOne();
                break;
        }
    }

    ///////////////////////////////////////////////////////Scene 1 specific results
//Scene 1 agi approach
    private static void agiSceneOne() {
        if (rolls.roll1 <= 6) {
            System.out.println("You rolled a miss! Oh no! \nThe twig you stepped on makes a loud snap that is almost drowned out by the proceeding wet crack as your @$$hole snaps shut. \nThere is no way they didnt hear you. At least you didn't step on a trap or anything...");
            character.misses += 1;
            shitHitsFanSceneOne();
        } else if (rolls.roll1 >= 7 && rolls.roll1 <= 9) {
            System.out.println(("You rolled a mixed success!"));
            sceneOneBut();
        } else if (rolls.roll1 >= 10) {
            System.out.println("You rolled a success with little consequence!");
            System.out.println("You managed to sneak around their ambush. You can sneak away or get the jump on them. [fight/run]");
            Scanner scanner = new Scanner(System.in);
            choices.choice2 = scanner.nextLine();
            if (choices.choice2.equalsIgnoreCase("fight")) {
                Ambush();
            } else if (choices.choice2.equalsIgnoreCase("run")) {
                sceneOneOutro();
            } else {
                System.out.println("I didn't understand what you meant. Let's try again.");
                agiSceneOne();
            }
        }
    }

    //Scene 1 shp approach
    private static void shpSceneOne() {
        if (rolls.roll1 <= 6) {
            System.out.println("You rolled a miss! Oh no! \nYou see something moving in the woods and go investigate it because it couldn't possibly be a distraction or trap, right?");
            character.misses += 1;
            shitHitsFanSceneOne();
        } else if (rolls.roll1 >= 7 && rolls.roll1 <= 9) {
            System.out.println("You rolled a mixed success!");
            sceneOneBut();
        } else if (rolls.roll1 >= 10) {
            System.out.println("You rolled a success with little consequence!");
            System.out.println("You managed to spot them before they spotted you. You can sneak away or get the jump on them. [fight/run]");
            Scanner scanner = new Scanner(System.in);
            choices.choice2 = (scanner.nextLine());
            if (choices.choice2.equalsIgnoreCase("fight")) {
                Ambush();
            } else if (choices.choice2.equalsIgnoreCase("run")) {
                sceneOneOutro();
            } else {
                System.out.println("I didn't understand what you meant. Let's try again.");
                shpSceneOne();
            }
        }
    }

    //Scene 1 results
    private static void sceneOneBut() {
        int dam = dice(baddie.damageDie);
        System.out.println("\nFuuuuuuck. That hurt. You managed to get ahead of them with enough time to make a hasty decision, \nbut their trap was tripped, hitting you for " + dam + " damage. Oh, and to make things worse, they are coming right for you!");
        character.hp -= dam;
        System.out.println("Will you stand tall and fight? Or run like a coward? [fight/run]");
        Scanner scanner = new Scanner(System.in);
        choices.choice2 = scanner.nextLine().toLowerCase();
        if (choices.choice2.equalsIgnoreCase("fight")) {
            fight();
        } else if (choices.choice2.equalsIgnoreCase("run")) {
            sceneOneOutro();
        } else {
            System.out.println("I didn't understand what you meant. Let's try again.");
            sceneOneBut();
        }
    }

    private static void shitHitsFanSceneOne() {
        int dam = dice(baddie.damageDie);
        System.out.println("\nFuuuuuuck. That hurt. Their trap was tripped, hitting you for " + dam + " damage and they are coming right for you!");
        character.hp -= dam;
        System.out.println("Oh no, here they come! You have no choice but to fight!");
        fight();
    }


    private static void sceneOneOutro() {
        System.out.println("As you walk into the sunset, the screen fades to black. Thanks for trying the demo!\nYou rolled " + character.misses + " misses and got through " + character.scenes + " scenes.");
        System.exit(0);
    }


//////Add:
////// level up from misses total, make it XP
////// add +1 scene per scene traversed


    ////////////////////////////////////////////////////////////////////////////////////////////////
//Combat
    ////////////////////////////////////////////////////////////////////////////////////////////////

    private static void youDied() {
        System.out.println("Though your journey has come to an end, lets see how far you got! You rolled " + character.misses + " misses and got through " + character.scenes + " scenes. Better luck next time!");
        System.exit(0);
    }

//////////////////////////////////////////////////////////
// TODO: 2019-07-30 - Below is how we will traverse scenes maybe:

//    public static void nextScene() {
//        if (userClass.scenes === 0){
//            userClass.scenes += 1;
//            System.out.println("You continue on through the woods and to the next encounter!");
//            sceneTwo();
//        } else if (userClass.scenes === 1){
//            System.out.println("You continue on through the woods and to the next encounter!");
//            sceneThree();
//        } else if (userClass.scenes === 2){
//            System.out.println("You continue on through the woods and to the next encounter!");
//            sceneFour();
//        }
//    }
////////////////////////////////////////////////////////

    private static void combatTurnAttack(double a) {
        if (a <= 6) {
            System.out.println("You rolled a miss! Oh no!");
            character.misses = character.misses + 1;
            int badDam = dice(baddie.damageDie);
            character.hp -= badDam;
            System.out.println("You take " + badDam + " damage from their blow!");
            fight();
        } else if (a >= 7 && a <= 9) {
            System.out.println("You rolled a mixed success!");
            int badDam = dice(baddie.damageDie);
            int dam = character.damageDie;
            character.hp -= badDam;
            baddie.hp -= dam;
            baddie.mp -= 1;
            System.out.println("You dealt " + dam + " damage, but you opened yourself up to an attack! Take " + badDam + " damage from their blow!");
            fight();
        } else if (a >= 10) {
            System.out.println("You rolled a success with little consequence!");
            int dam = dice(character.damageDie);
            baddie.hp -= dam;
            baddie.mp -= 1;
            System.out.println("You dealt " + dam + " damage!");
            fight();
        }
    }


    private static void spellDamage() {
        if (character.spell.equalsIgnoreCase("bolt")) {
            double dam = twoDice(4);
            baddie.hp -= dam;
            System.out.println("Your magical attack hit the foe for " + dam + " damage!");
        } else {
            double dam = twoDice(6) + character.sharp;
            baddie.hp -= dam;
            System.out.println("Your magical attack hit the foe for " + dam + " damage!");
            int damself = (int) (dam / (dice(4)));
            System.out.println("You hit your target, but that blast was brutal. You take " + damself + " damage from the blast.");
            character.hp -= damself;
        }
    }

    private static void combatTurnSpell(double a) {
        if (a <= 6) {
            System.out.println("You rolled a miss! Oh no!");
            character.misses += 1;
            int badDam = dice(baddie.damageDie);
            character.hp -= badDam;
            System.out.println("You take " + badDam + " damage from their blow!");
            fight();
        } else if (a >= 7 && a <= 9) {
            System.out.println("You rolled a mixed success!");
            int badDam = dice(baddie.damageDie);
            character.hp -= (badDam);
            System.out.println("You take " + badDam + " damage from their blow!");
            spellDamage();
            baddie.mp -= 1;
            fight();
        } else if (a >= 10) {
            System.out.println("You rolled a success with little consequence!");
            spellDamage();
            baddie.mp -= 1;
            fight();
        }
    }


    //Running
    private static void combatTurnRun(double a) {
        Scanner scanner = new Scanner(System.in);
        if ((a - baddie.chase) <= 6) {
            System.out.println("You rolled a miss! Oh no!");
            character.misses += 1;
            int badDam = dice(baddie.damageDie);
            character.hp -= (badDam);
            System.out.println("You take " + badDam + " damage from their blow! and couldn't escape!");
            fight();
        } else if ((a - baddie.chase) >= 7 && (a - baddie.chase) <= 9) {
            System.out.println("You rolled a mixed success!");
            int badDam = dice(baddie.damageDie);
            character.hp -= (badDam);
            System.out.println("You only can do one: Make it away, but take a hit in the escape,  or stay in the fight and avoid the damage. Run or stay?");
            String runChoice = scanner.nextLine().toLowerCase();
            if (runChoice.equalsIgnoreCase("run")) {
                badDam = dice(baddie.damageDie);
                character.hp -= (badDam * 2);
                System.out.println("You got away, but took " + badDam + " damage in the escape!");
            } else {
                badDam = dice(baddie.damageDie);
                character.hp -= (badDam - character.agility);
                System.out.println("You got away, but took " + badDam + " damage in the escape!");
                fight();
            }
        } else if ((a - baddie.chase) >= 10) {
            System.out.println("You rolled a success with little consequence!");
            System.out.println("You managed to escape the fight!");
            sceneOneOutro();
//            change to nextScene in future
        }
    }

    private static void combatTurnTalk(double a) {
        if (a <= 6) {
            System.out.println("You rolled a miss! Oh no!");
            character.misses = character.misses + 1;
            int badDam = dice(baddie.damageDie);
            character.hp -= badDam;
            System.out.println("You take " + badDam + " damage from their blow!");
            fight();
        } else if (a >= 7 && a <= 9) {
            System.out.println("You rolled a mixed success!");
            int badDam = dice(baddie.damageDie);
            int dam = dice(character.damageDie) + character.sharp;
            character.hp -= badDam;
            baddie.mp -= dam;
            System.out.println("Your words are getting to them! You dealt " + dam + " damage to their moral but you opened yourself up to an attack! \nTake " + badDam + " damage from their blow!");
            fight();
        } else if (a >= 10) {
            System.out.println("You rolled a success with little consequence!");
            int dam = dice(character.damageDie) + character.sharp;
            baddie.mp -= dam;
            System.out.println("Your words are getting to them! You dealt " + dam + " damage to their moral!");
            fight();
        }
    }

    private static void BaddieRunAway() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your foe cowers from your onslaught and decides to make a break for it! Do you spare them and let them run or chase them down and finish the job? [spare/chase]");
        String resp = scanner.nextLine();
        switch (resp) {
            case "spare":
                System.out.println("\nYou let them run away with their lives and continue on your way.\n");
                sceneOneOutro();
            case "chase":
                System.out.println("\nYou run to chase them down like the animal they are.\n");
                int rolled = twoDice(6) + character.agility;
                if (rolled <= 6) {
                    System.out.println("\nOof, you rolled a miss.\n");
                    int dam = dice(baddie.damageDie);
                    character.hp -= dam;
                    System.out.println("You try to chase them down, but you run into a trap during the pursuit! You take " + dam + " damage as they get away.\n");
                } else if (rolled <= 10 && rolled >= 7) {
                    System.out.println("\nNot bad, you rolled a mixed success.\n");
                    int dam = dice(baddie.damageDie);
                    character.hp -= dam;
                    System.out.println("You try to chase them down, but you run into a trap during the pursuit! You take " + dam + " damage.\n");
                    if (character.hp == 0) {
                        youDied();
                    }
                    System.out.println("Injured, you still manage to chase them down and finish them off.\n");
                } else if (rolled >= 10) {
                    System.out.println("\nNice job, you rolled a complete success.\n");
                    int healz = dice(10);
                    character.hp += healz;
                    System.out.println("You try to chase them down and finish them off! While searching the body, you find a healing potion! you heal " + healz + " HP!\nYour new current HP is " + character.hp);
                    sceneOneOutro();
                }
            default:
                System.out.println("\nI didn't understand, please try again.\n");
                BaddieRunAway();

        }
    }


    //fighting
    private static void fight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(baddie.mp);
        //Dead
        if (character.hp <= 0) {
            System.out.println("\nShit, you died!");
            youDied();
        } else if (baddie.mp <= (baddie.maxMp / 2)) {
            if (dice(baddie.mp) == baddie.mp) {
                BaddieRunAway();
            }
        } else if (baddie.hp <= 0 || baddie.mp <= 0) {
            System.out.println("\nYou defeated the baddie! Congrats!");
            sceneOneOutro();
        }
        System.out.printf("\nYour current HP is %d.\n", character.hp);
//battle
        System.out.println("You're in a fight for your life! What do you do? Run, Attack, or Talk?\n");
        String everyBodyWas = scanner.nextLine().toLowerCase();
//melee
        if (everyBodyWas.equalsIgnoreCase("attack")) {
            if (character.sharp == 2) {
                System.out.println("Would you like to attack or cast a spell? [y/n]");
                String spellChoice = scanner.nextLine().toLowerCase();
                if (spellChoice.equalsIgnoreCase("y")) {
                    System.out.println("What spell would you like to cast? Bolt or Blast?");
                    character.spell = scanner.nextLine().toLowerCase();
                    System.out.println("Let's see if your spell casted successfully");
                    combatTurnSpell(twoDice(6) + character.sharp);
                } else {
                    System.out.println("I didn't understand what you meant, please try again.");
                    fight();
                }
            } else if (character.sharp < 2) {
                System.out.println("How do you fight? With dexterity and fast moves? = AGI Or do you fight with power and prowess? = STR ");
                String howAttack = scanner.nextLine().toLowerCase();
                if (howAttack.equalsIgnoreCase("agi")) {
                    combatTurnAttack(twoDice(6) + character.agility);
                } else if (howAttack.equalsIgnoreCase("str")) {
                    combatTurnAttack(twoDice(6) + character.strength);
                } else {
                    System.out.println("I didn't understand what you meant, please try again.");
                    fight();
                }
            } else {
                System.out.println("I didn't understand what you meant, please try again.");
                fight();
            }

        }
//run
        else if (everyBodyWas.equalsIgnoreCase("run")) {
            combatTurnRun(twoDice(6) + character.agility);
        }
//talk
        else if (everyBodyWas.equalsIgnoreCase("talk")) {
            System.out.println("How do you talk them down? With quick thinking? = SHP Or with your charm and persuasion? = PRE ");
            String howAttack = scanner.nextLine().toLowerCase();
            if (howAttack.equalsIgnoreCase("shp")) {
                combatTurnTalk(twoDice(6) + character.sharp);
            } else if (howAttack.equalsIgnoreCase("pre")) {
                combatTurnTalk(twoDice(6) + character.presence);
            } else {
                System.out.println("I didn't understand what you meant, please try again.");
                fight();
            }

        } else {
            System.out.println("I didn't understand what you meant, please try again.");
            fight();
        }
// mobs have Health points, Mental points, and Chase value
    }


    //////////////Ambushing gives you a +2 to your first roll
    private static void Ambush() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(baddie.mp);
        System.out.printf("\nYour current HP is %d.\n", character.hp);
        //battle
        System.out.println("You're in a fight for your life! What do you do? Run, Attack, or Talk?");
        String everyBodyWas = scanner.nextLine().toLowerCase();
//melee
        if (everyBodyWas.equalsIgnoreCase("attack")) {
            if (character.sharp == 2) {
                System.out.println("Would you like to attack or cast a spell? [y/n]");
                String spellChoice = scanner.nextLine().toLowerCase();
                if (spellChoice.equalsIgnoreCase("y")) {
                    System.out.println("What spell would you like to cast? Bolt or Blast?");
                    character.spell = scanner.nextLine().toLowerCase();
                    System.out.println("Let's see if your spell casted successfully");
                    combatTurnSpell(twoDice(6) + character.sharp + 2);
                } else {
                    System.out.println("I didn't understand what you meant, please try again.");
                    Ambush();
                }
            } else if (character.sharp < 2) {
                System.out.println("How do you fight? With dexterity and fast moves? = AGI Or do you fight with power and prowess? = STR ");
                String howAttack = scanner.nextLine().toLowerCase();
                if (howAttack.equalsIgnoreCase("agi")) {
                    combatTurnAttack(twoDice(6) + character.agility + 2);
                } else if (howAttack.equalsIgnoreCase("str")) {
                    combatTurnAttack(twoDice(6) + character.strength + 2);
                } else {
                    System.out.println("I didn't understand what you meant, please try again.");
                    Ambush();
                }
            } else {
                System.out.println("I didn't understand what you meant, please try again.");
                Ambush();
            }

        }
//run
        else if (everyBodyWas.equalsIgnoreCase("run")) {
            combatTurnRun(twoDice(6) + character.agility + 2);
        }
//talk
        else if (everyBodyWas.equalsIgnoreCase("talk")) {
            System.out.println("How do you talk them down? With quick thinking? = SHP Or with your charm and persuasion? = PRE ");
            String howAttack = scanner.nextLine().toLowerCase();
            if (howAttack.equalsIgnoreCase("shp")) {
                combatTurnTalk(twoDice(6) + character.sharp + 2);
            } else if (howAttack.equalsIgnoreCase("pre")) {
                combatTurnTalk(twoDice(6) + character.presence + 2);
            } else {
                System.out.println("I didn't understand what you meant, please try again.");
                Ambush();
            }
        } else {
            System.out.println("I didn't understand what you meant, please try again.");
            Ambush();
        }
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////
//Combat end
////////////////////////////////////////////////////////////////////////////////////////////////


