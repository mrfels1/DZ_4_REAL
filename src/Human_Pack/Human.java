package Human_Pack;

public class Human {
    private Head head;
    private Leg leftLeg;private Leg rightLeg;
    private Hand leftHand;private Hand rightHand;
    private boolean isAlive = false;
    public Human(){
        this.head = new Head();
        this.leftHand = new Hand();
        this.rightHand = new Hand();
        this.leftLeg = new Leg();
        this.rightLeg = new Leg();
        isAlive = true;
    }
    public void doDamage(int bodyPart){
        if(isAlive){
            switch (bodyPart){
                case 1:
                    head.setHealth(head.getHealth() - 10);
                    if (head.getHealth() <= 0){
                        isAlive = false;
                        System.out.println("Human got killed");
                        return;
                    }
                    break;
                case 2:
                    if (leftLeg.getHealth() <= 0){
                        System.out.println("left leg is destroyed");
                    }
                    else {
                        leftLeg.setHealth(leftLeg.getHealth() - 10);
                    }
                    break;
                case 3:
                    if (rightLeg.getHealth() <= 0){
                        System.out.println("right leg is destroyed");
                    }
                    else {
                        rightLeg.setHealth(rightLeg.getHealth() - 10);
                    }
                    break;
                case 4:
                    if (rightHand.getHealth() <= 0){
                        System.out.println("right hand is destroyed");
                    }
                    else {
                        rightHand.setHealth(rightHand.getHealth() - 10);
                    }
                    break;
                case 5:
                    if (leftHand.getHealth() <= 0){
                        System.out.println("left hand is destroyed");
                    }
                    else {
                        leftHand.setHealth(leftHand.getHealth() - 10);
                    }
                    break;
            }
        }
        else {
            System.out.println("HE IS ALREADY DEAD STOP!");
            return;
        }
    }
    @Override
    public String toString() {
        return "Human{" +
                "head=" + head +
                ", leftLeg=" + leftLeg +
                ", rightLeg=" + rightLeg +
                ", leftHand=" + leftHand +
                ", rightHand=" + rightHand +
                ", isAlive=" + isAlive +
                '}';
    }
}
