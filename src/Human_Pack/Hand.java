package Human_Pack;

public class Hand {
    private int health;

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
    public Hand(){
        health = 60;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "health=" + health +
                '}';
    }
}