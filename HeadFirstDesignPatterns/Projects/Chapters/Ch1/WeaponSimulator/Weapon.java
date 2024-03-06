package Ch1.WeaponSimulator;

public abstract class Weapon {
    AttackBehavior attackBehavior;

    public Weapon() {}

    public abstract void display();

    public void performAttack1() {
        attackBehavior.performAttack1();
    }
}
