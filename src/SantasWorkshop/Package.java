package SantasWorkshop;

import java.util.ArrayList;

public class Package {
    private final ArrayList<Gift> gifts = new ArrayList<>();

    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    public int totalWeight() {
        int weight_sum = 0;
        for (Gift gift: gifts) {
            weight_sum += gift.getWeight();
        }

        return weight_sum;
    }

    public static void main(String[] args) {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        Package gifts = new Package();
        gifts.addGift(book);
        System.out.println(gifts.totalWeight());
    }
}
