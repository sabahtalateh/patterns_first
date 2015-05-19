package uv.alez.ch1Strategy.MiniGame.Characters;

import uv.alez.ch1Strategy.MiniGame.Behaviours.AxeBehaviour;

public class Troll extends Character {
    public Troll() {
        this.weaponBehaviour = new AxeBehaviour();
    }
}
