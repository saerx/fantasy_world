package Weapons;

import Enemies.Enemy;
import Weapons.IWeapon;

public class Axe implements IWeapon {
    public void attack(Enemy enemy) {
        enemy.takeDamage(3);
    }

}
