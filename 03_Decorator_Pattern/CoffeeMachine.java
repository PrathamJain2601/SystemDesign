public class CoffeeMachine {
    public static void main(String[] args) {
        Beverage b = new Espresso();
        b = new Mocha(b);
        System.out.println(b.getDescription() + " " + b.cost());
        b = new Whip(b);
        System.out.println(b.getDescription() + " " + b.cost());
        Beverage b2 = new DarkRoast();
        b2 = new Mocha(b2);
        b2 = new Mocha(b2);
        System.out.println(b2.getDescription() + " " + b2.cost());
    }
}

// OO Principle
//     Classes should be open for extension but closed for modification (Open close principle)
// OO Patterns
//     Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.