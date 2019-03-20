import java.util.ArrayList;
import java.util.Random;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Deck
{
    ArrayList<Card> cards = new ArrayList<Card>();
    Random r =new Random();
    
    public Deck()
    {
        for(int i = 1; i < 53; i++)
        {
            cards.add(new Card(i));
        }
    }
    
    public Card getCard()
    {
        int randomInt = r.nextInt(cards.size());
        Card card = cards.get(randomInt);
        cards.remove(cards.get(randomInt));
        return card;
    }
    
    public void returnCard(Card c)
    {
        cards.add(c);
    }
    
    public ImageView getBackOfCard()
    {
        return new ImageView(new Image("card/b1fv.png"));
    }
}
