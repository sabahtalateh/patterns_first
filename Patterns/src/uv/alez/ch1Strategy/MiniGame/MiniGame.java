package uv.alez.ch1Strategy.MiniGame;


import uv.alez.ch1Strategy.MiniGame.Behaviours.BowAndArrowBehaviour;
import uv.alez.ch1Strategy.MiniGame.Behaviours.SwordBehaviour;
import uv.alez.ch1Strategy.MiniGame.Characters.*;
import uv.alez.ch1Strategy.MiniGame.Characters.Character;

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
