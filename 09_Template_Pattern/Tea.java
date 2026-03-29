class Tea extends CaffeineBeverage {

    void brew() {
        System.out.println("Steeping the tea");
    }

    void addCondiments() {
        System.out.println("Adding lemon");
    }

    // override hook
    boolean customerWantsCondiments() {
        return true; // always yes
    }
}