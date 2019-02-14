/**
 * Created by Teacher on 1/7/2019.
 */
public class CardTester {
    public static void main(String[] args) {

    Card card1 = new Card("Jack", "Clubs", 11);
    Card card2 = new Card("Jack", "Clubs", 11);
    Card card3 = new Card("King", "Spades", 13);


    System.out.println(card1.toString());
        System.out.println(card2.toString());
        System.out.println(card3.toString());
        System.out.println("Is Card1 the same as Card2? "+ card1.matches(card2));
        System.out.println("Is Card2 the same as Card3? "+card2.matches(card3));
    }
}
