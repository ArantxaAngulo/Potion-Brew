package potionbrew;

public class Main {
	public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();

        // Populate kitchen with ingredients
        kitchen.addIngredient("Dragon's Blood", 2, "Fiery");
        kitchen.addIngredient("Mandrake Root", 1, "Earthly");
        kitchen.addIngredient("Algae", 0, "Watery");
        kitchen.addIngredient("Moon Dust", 3, "Mana Infused");
        
        // testing
        System.out.println("Available Ingredients:");
        kitchen.displayIngredients();
	}
}
