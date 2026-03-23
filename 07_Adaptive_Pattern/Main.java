public class Main {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapterToDuck = new TurkeyAdapterToDuck(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("The Duck says...");
        duck.quack();
        duck.fly();

        System.out.println("The TurkeyAdapterToDuck says...");
        turkeyAdapterToDuck.quack();
        turkeyAdapterToDuck.fly();

    }
}

// Converts the interface of a class into another interface the clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

// this is an example of object adapters
// object adapters - composes adaptee class and implements target interface.
// class adapters - inherits both adaptee and target classes. multi inheritance not possible in java so we can do multiple composition

// real world example is enumerators and iterators. legacy systems exposes enumerator interface and internally use iterators so they need a enumeratorToIterator adapter.