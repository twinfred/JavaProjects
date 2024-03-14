package HeadFirstDesignPatterns.Ch1.WeaponSimulator;

public class BowAndArrow extends Weapon {
    public BowAndArrow() {
        attackBehavior = new BasicArrowAttack();
    }

    public void display() {
        System.out.println("A simple wooden bow and arrow");
    }
}
