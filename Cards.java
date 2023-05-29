package class25Hw;

import java.util.Iterator;
import java.util.LinkedList;

public class Cards {
    /*
Create a Card class that will have interest rate field and card type
  and a constructor that will initialize the fields.
  Create 3 objects of different card and store them into LinkedList.
  Using for loop/advanced for loop/ iterator access all methods of the class.
     */

    private double interestRate;
    private String cardType;

    public Cards(double interestRate, String cardType) {
        this.interestRate = interestRate;
        this.cardType = cardType;
    }

    public static void add(Cards credit) {
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String getCardType() {
        return cardType;
    }
}
 class Main {
    public static void main(String[] args) {
        LinkedList<Cards> cards = new LinkedList<>();

        Cards card1 = new Cards(0.15, "Credit");
        Cards card2 = new Cards(0.12, "Debit");
        Cards card3 = new Cards(0.18, "Prepaid");

        cards.add(card1);
        cards.add(card2);
        cards.add(card3);

        System.out.println("Using for loop:");
        for (int i = 0; i < cards.size(); i++) {
            Cards card = cards.get(i);
            System.out.println("Card Type: " + card.getCardType());
            System.out.println("Interest Rate: " + card.getInterestRate());
            System.out.println("--------------------------");
        }

        System.out.println("\nUsing enhanced for loop:");
        for (Cards card : cards) {
            System.out.println("Card Type: " + card.getCardType());
            System.out.println("Interest Rate: " + card.getInterestRate());
            System.out.println("--------------------------");
        }

        System.out.println("\nUsing iterator:");
        Iterator<Cards> iterator = cards.iterator();
        while (iterator.hasNext()) {
            Cards card = iterator.next();
            System.out.println("Card Type: " + card.getCardType());
            System.out.println("Interest Rate: " + card.getInterestRate());
            System.out.println("--------------------------");
        }
    }
}
