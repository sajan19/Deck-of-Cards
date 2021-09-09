import java.util.ArrayList;
import java.util.Random;

class Cards {
    //declare an Array
//    int[] deckOfCards;

    //define an arraylist
    ArrayList<Cards> packOfCards;
    int rank;
    //Constructor for Arraylist
    public Cards(int capacity) {
        this.packOfCards = new ArrayList<>(capacity);
        this.rank =rank;
    }
    //Method to check numbers
    void checkCard(int rank){
        if(rank < 52){
            System.out.println("Card is Valid");
        }
        else if( rank > 52){
            System.out.println("Card is Invalid");
        }
    }
//    //Instance Variables
//    int value_on_Card;
//    String suits;
//    //Constructor
//    Cards() {
//        // Used to store all 52 cards
//        this.deckOfCards = new int[52];
//    }
}
public class DeckOfCard {
    public static void main(String[] args) {
        System.out.println("Welcome to play Deck of Cards");
/       String [] suits={"Daimond","Hearts", "Spade", "Clubs"};
        String [] cardNumber ={"2","3","4","5","6","7","8","9","10","Ace","King", "Queen", "Jack"};
        //Create an Object
        Cards dCards = new Cards(52);
        //Calling an ArrayList
        


    }
}

