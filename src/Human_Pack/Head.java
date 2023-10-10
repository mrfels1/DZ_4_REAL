package Human_Pack;

public class Head {
    private int health;

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
    public Head(){
        health = 60;
    }

    @Override
    public String toString() {
        return "Head{" +
                "health=" + health +
                '}';
    }
}
