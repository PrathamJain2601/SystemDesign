abstract class Pizza {
    String name;
    String dough;
    String sauce;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes");
    }

    void cut() {
        System.out.println("Cutting pizza");
    }

    void box() {
        System.out.println("Boxing pizza");
    }

    public String getName() {
        return name;
    }
}