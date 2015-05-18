package uv.alez.MiniGame.Characters;

import uv.alez.MiniGame.Behaviours.KnifeBehaviour;

public class Knight extends Character {
    public Knight() {
        this.weaponBehaviour = new KnifeBehaviour();
    }
}
