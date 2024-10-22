package potionbrew;
import java.util.*;

public class Potions extends TreeHub{
//ATTRIBUTES
	String potionName;
	String potionEffect;
	double potionValue;
	private final List<Pair<Integer, String>> ingredientsUsed = new ArrayList<>(); // Use Pair for ingredients
	
//CONSTRUCTOR
	public Potions(String potionName, String potionEffect, double potionValue) {
		this.potionName = potionName;
		this.potionEffect = potionEffect;
		this.potionValue = potionValue;
	}

//METHODS
	
	public double calculatePotionValue(double potionValue) {
		return potionValue;
	}
	// Add an ingredient to the potion
    public void addIngredient(Pair<Integer, String> ingredientInfo) {
        ingredientsUsed.add(ingredientInfo);
    }

    // Calculate wellness based on ingredient rankings
    public int calculateWellness() {
        int totalWellness = 0;
        for (Pair<Integer, String> ingredient : ingredientsUsed) {
            totalWellness += ingredient.getFirst(); // Use getFirst() to access the ranking
        }
        return totalWellness;
    }
	
	
	//--setters
	public void setPotionName(String potionName) {
		this.potionName = potionName;
	}
	public void setPotionEffect(String potionEffect) {
		this.potionEffect = potionEffect;
	}
	public void setPotionValue(double potionValue) {
		this.potionValue = potionValue;
	}
	
}
