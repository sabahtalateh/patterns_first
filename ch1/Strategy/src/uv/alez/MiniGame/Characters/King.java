package uv.alez.MiniGame.Characters;

import uv.alez.MiniGame.Behaviours.SwordBehaviour;

public class King extends Character {
    public King() {
        this.weaponBehaviour = new SwordBehaviour();
    }
}
