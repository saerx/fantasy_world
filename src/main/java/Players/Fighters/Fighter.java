package Players.Fighters;

import Players.Player;
import Weapons.IWeapon;


public abstract class Fighter extends Player {

    private IWeapon weapon;

    public Fighter(String name, int healthPoints, IWeapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void changeWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }
}
