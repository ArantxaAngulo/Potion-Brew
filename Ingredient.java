package potionbrew;

public class Ingredient implements Ranking {
    private final String name;
    private final int ranking; // A numeric value representing the ingredient's effectiveness
    private final String type; // Type of ingredient (e.g., fiery, watery)

    public Ingredient(String name, int ranking, String type) {
        this.name = name;
        this.ranking = ranking;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getRanking() {
        return ranking;
    }

    public String getType() {
        return type;
    }

}

