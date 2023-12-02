import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (items.isEmpty()) {
            if (item.getWeight() <= this.maxWeight) {
                items.add(item);
            }
        } else {
            items.add(item);
            if (this.totalWeight() >= this.maxWeight) {
                items.remove(item);
            }
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item itm : items) {
            totalWeight = totalWeight + itm.getWeight();
        }
        return totalWeight;
    }

    public String toString() {
        String zeroItem = "no items (" + this.totalWeight() + " kg)";
        String singleItem = items.size() + " item (" + this.totalWeight() + " kg)";
        String multipleItem = items.size() + " items (" + this.totalWeight() + " kg)";
        if (items.size() == 0) {
            return zeroItem;
        } else if (items.size() == 1) {
            return singleItem;
        } else {
            return multipleItem;
        }
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item heaviestItem = items.get(0);
        for (Item item : items) {
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;

    }

}
