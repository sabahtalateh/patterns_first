package uv.alez.ch1Strategy.MiniGame.Characters;

import uv.alez.ch1Strategy.MiniGame.Behaviours.KnifeBehaviour;

public class Knight extends Character {
    public Knight() {
        this.weaponBehaviour = new KnifeBehaviour();
    }
}
