public class Rager {

    static int kickedOut = 0;

    public static void rager(){
        int result = game_story.twoDice(6) + game_story.character.presence + Items.partyBonus;

        if (Items.allNighter >= 1) {
            game_shop.party();
        } else if (kickedOut >= 1) {

        } else {
            game_shop.town();
        }
    }

}
