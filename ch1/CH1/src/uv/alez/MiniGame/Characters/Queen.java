package uv.alez.MiniGame.Characters;

import uv.alez.MiniGame.Behaviours.BowAndArrowBehaviour;

public class Queen extends Character {
    public Queen() {
        this.weaponBehaviour = new BowAndArrowBehaviour();
    }
}
