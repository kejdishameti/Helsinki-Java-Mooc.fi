import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int weight) {
        this.maximumWeight = weight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int weight = this.totalWeight() + suitcase.totalWeight();
        if (weight <= maximumWeight) {
            suitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }

    public String toString() {
        return suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
}
