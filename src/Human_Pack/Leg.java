package Human_Pack;

public class Leg {
    private int health;

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
    public Leg(){
        health = 60;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "health=" + health +
                '}';
    }
}