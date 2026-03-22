class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public String createDough() {
        return "Thin Crust Dough";
    }

    public String createSauce() {
        return "Marinara Sauce";
    }
}

class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    public String createDough() {
        return "Thick Crust Dough";
    }

    public String createSauce() {
        return "Plum Tomato Sauce";
    }
}