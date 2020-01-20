// Card shuffling and dealing
// video https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson07_08
public class Card {

    private final String face;
    private final String suit; 

    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }

    public String toString(){
        return face + " of " + suit;
    }
}