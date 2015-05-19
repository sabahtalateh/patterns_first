package uv.alez.MiniGame;

import uv.alez.MiniGame.Behaviours.BowAndArrowBehaviour;
import uv.alez.MiniGame.Behaviours.SwordBehaviour;
import uv.alez.MiniGame.Characters.*;
import uv.alez.MiniGame.Characters.Character;

public class MiniGame {
    public static void main(String[] args) {
        Character king = new King();
        Character troll = new Troll();

        king.fight();
        troll.fight();

        Character queen = new Queen();
        queen.fight();

        Character knight = new Knight();
        knight.fight();

        knight.setWeapon(new SwordBehaviour());
        knight.fight();

        troll.setWeapon(new BowAndArrowBehaviour());
        troll.fight();
    }
}
