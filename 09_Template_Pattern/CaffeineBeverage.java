abstract class CaffeineBeverage {

    // TEMPLATE METHOD (final so subclasses don't change flow)
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();

        // HOOK usage
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // ABSTRACT METHODS (must be implemented)
    abstract void brew();
    abstract void addCondiments();

    // HOOK (default implementation)
    boolean customerWantsCondiments() {
        return true;
    }
}