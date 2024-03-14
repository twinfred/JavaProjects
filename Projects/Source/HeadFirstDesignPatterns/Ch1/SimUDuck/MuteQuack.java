package HeadFirstDesignPatterns.Ch1.SimUDuck;

public class MuteQuack extends QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
