package uv.alez.ch1Strategy.MiniGame.Characters;

import uv.alez.ch1Strategy.MiniGame.Behaviours.BowAndArrowBehaviour;

public class Queen extends Character {
    public Queen() {
        this.weaponBehaviour = new BowAndArrowBehaviour();
    }
}
