package Enemies;

import Enemies.Enemy;
import Players.Player;

public class Troll extends Enemy {


    public Troll(int healthPoints) {
        super(healthPoints);
    }


    public void postMeanTweet(Player player){
        player.takeDamage(3);
    }
}
