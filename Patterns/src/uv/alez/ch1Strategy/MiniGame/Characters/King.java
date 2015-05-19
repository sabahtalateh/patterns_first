package uv.alez.ch1Strategy.MiniGame.Characters;

import uv.alez.ch1Strategy.MiniGame.Behaviours.SwordBehaviour;

public class King extends Character {
    public King() {
        this.weaponBehaviour = new SwordBehaviour();
    }
}
