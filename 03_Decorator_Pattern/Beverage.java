public abstract class Beverage {
    public String description = "unknown Beverage";
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
