package potionbrew;

import java.util.HashMap;

public class Kitchen {
//ATTRIBUTES
	HashMap<String, Pair<Integer, String>> ingredients = new HashMap<>();

//METHODS
	// Method to add ingredients to the kitchen
    public void addIngredient(String name, int ranking, String type) {
        ingredients.put(name, new Pair<>(ranking, type));
    }

    // Method to get an ingredient by name
    public Pair<Integer, String> getIngredient(String name) {
        return ingredients.get(name);
    }

    // Method to display all ingredients (for testing)
    public void displayIngredients() {
        for (String ingredientName : ingredients.keySet()) {
            Pair<Integer, String> info = ingredients.get(ingredientName);
            System.out.println(ingredientName + " <Ranking: " + info.getFirst() + ", Type: " + info.getSecond() + ">");
        }
    }
}
