public class Main {
    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza p1 = nyStore.orderPizza("cheese");
        System.out.println(p1.getName());
        System.out.println();

        Pizza p2 = chicagoStore.orderPizza("cheese");
        System.out.println(p2.getName());
    }
}

// OO Principles 
//     Depend on abstractions. Do not Depend on concrete classes
// OO Patterns
//     factory method - define an interface for creating an object, but let subclasses decide which class to instantiate. factory method lets a class defer instantiation to the subclass.
//     abstract factory method - provide an interface for creating families of related or dependent objects without specifying the concrete objects.

