
// GardenPlanner.java
public class GardenPlanner {
    public static void main(String[] args) {
        double gardenSize = 20.0; // square meters
        double spacingPerPlant = 0.25; // in square meters
        int numberOfPlants = (int)(gardenSize / spacingPerPlant);
        System.out.println("Garden Size: " + gardenSize + " sqm");
        System.out.println("Spacing Per Plant: " + spacingPerPlant + " sqm");
        System.out.println("Number of Plants that can be grown: " + numberOfPlants);
    }
}
