package Weapons;

import Enemies.Enemy;
import Weapons.IWeapon;

public class Sword implements IWeapon {


    public void attack(Enemy enemy) {
        enemy.takeDamage(5);
    }
}
