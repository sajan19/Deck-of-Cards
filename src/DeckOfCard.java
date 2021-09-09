import java.util.ArrayList;
import java.util.Random;

class Cards {
    //declare an Array
//    int[] deckOfCards;
    //define an arraylist
    ArrayList<Cards> packOfCards;
    String suits[];
    String cardNumber[];
    int rank;
    //Constructor for Arraylist
    public Cards(int capacity) {
        this.packOfCards = new ArrayList<>(capacity);
        this.rank =rank;
    }
    //Method to Generate Randomm Number
    void randomNumberGeneration(){
        double rank = Math.floor(Math.random()*10)%52;
        System.out.println("rank: "+ rank);
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
    //Method to Show card
    void showCard(){
        for (int i=1;i<packOfCards.size(); i++){
        System.out.println(i);
        
        }
    }
}
public class DeckOfCard {
    public static void main(String[] args) {
        System.out.println("Welcome to play Deck of Cards");
         String [] suits={"Diamond","Hearts", "Spade", "Clubs"};
        String [] cardNumber ={"2","3","4","5","6","7","8","9","10","Ace","King", "Queen", "Jack"};
        //Create an Object
        Cards dCards = new Cards(52);
        //Calling an ArrayList
        dCards.randomNumberGeneration();
        //Calling Show Method
        dCards.showCard();
    }
}

