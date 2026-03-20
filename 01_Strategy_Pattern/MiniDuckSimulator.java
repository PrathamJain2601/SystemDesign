public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyWithWings());
        modelDuck.performFly();
    }
}

// OO Principles
//     Encapsulate what varies
//     Favor composition over inheritance
//     program to interfaces not implementations
// OO Patterns
//     Strategy - defines a family of algorithms, encapsulates each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it 