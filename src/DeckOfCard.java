class Cards {
    //declare an Array
    int[] deckOfCards;
    //Instance Variables
    int value_on_Card;
    String suits;
    //Constructor
    Cards() {
        // Used to store all 52 cards
        this.deckOfCards = new int[52];
    }
}
public class DeckOfCard {
    public static void main(String[] args) {
        System.out.println("Welcome to play Deck of Cards");
//        UC1 : Setup the initial game with deck of cards and make sure we have unique cards, The numbe
//        The number of cards are 52. Should be able to make unique deck. Maintain the ranks to further compare

        String [] suits={"Ace","King", "Queen", "Jack"};
        int [] cardNumber ={2,3,4,5,6,7,8,9,10};
        //Create an Object
        Cards dCards = new Cards();

    }
}
