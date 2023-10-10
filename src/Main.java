import Human_Pack.Human;

public class Main {
    public static void main(String[] args) {
        System.out.println("----book class test----");
        Book d1 = new Book("Lord of the rings", "Bilbo Baggins & Frodo Baggins", 1191);
        System.out.println(d1);

        System.out.println("----human class test----");
        Human h1 = new Human();
        System.out.println(h1);
        h1.doDamage(1);
        System.out.println(h1);
        h1.doDamage(2);
        h1.doDamage(2);
        h1.doDamage(2);
        h1.doDamage(2);
        h1.doDamage(2);
        h1.doDamage(2);
        h1.doDamage(2);
        System.out.println(h1);
        h1.doDamage(1);
        h1.doDamage(1);
        h1.doDamage(1);
        h1.doDamage(1);
        h1.doDamage(1);
        System.out.println(h1);

        System.out.println("----circle class test----");
        Circle c1 = new Circle(10, "red", false);
        System.out.println(c1);
    }

}