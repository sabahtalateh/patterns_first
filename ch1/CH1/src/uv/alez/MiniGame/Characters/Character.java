package uv.alez.MiniGame.Characters;

import uv.alez.MiniGame.Behaviours.WeaponBehaviour;

public abstract class Character {
    WeaponBehaviour weaponBehaviour;

    public void fight(){
        weaponBehaviour.useWeapon();
    }

    public void setWeapon(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }
}
