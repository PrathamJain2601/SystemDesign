public abstract class Duck {
    FlyBehavior flybehavior;
    QuackBehavior quackbehavior;

    public Duck() {}

    public void setFlyBehavior(FlyBehavior fb){
        flybehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackbehavior = qb;
    }

    public abstract void display();

    public void performFly() {
        flybehavior.fly();
    }

    public void performQuack() {
        quackbehavior.quack();
    }

    public void swim() {
        System.out.println("swimming");
    }
}