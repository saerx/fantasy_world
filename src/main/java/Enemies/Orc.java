package Enemies;

import Enemies.Enemy;
import Players.Player;

public class Orc extends Enemy {
    public Orc(int healthPoints) {
        super(healthPoints);
    }

    public void spreadFakeNews(Player player){
        player.takeDamage(5);
    }
}
