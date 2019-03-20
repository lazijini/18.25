import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Card
{
    int cardVal; 
    Image cardImage;
    ImageView cardImageView;
    Boolean flipped = false;
    Boolean selected = false;
    
    public Card(int index)
    {
        if(index < 11 || (index > 13 && index < 24) || (index > 26 && index < 37) || (index > 39 && index < 50))
        {
            cardVal = index % 13;;
        }
        else
        {
            cardVal = 10;
        }
        
        cardImage = new Image("card/" + index + ".png");
        cardImageView = new ImageView(cardImage);
    }

    public ImageView getCardImage()
    {
        return cardImageView;
    }
    
    public int getCardVal()
    {
        return cardVal;
    }
    
    public Boolean isFlipped()
    {
        return flipped;
    }
    
    public Boolean isSelected()
    {
        return selected;
    }
    
    public void select()
    {
        selected = !selected;
    }
    
    public void flip()
    {
        cardImageView = new ImageView(new Image("card/b1fv.png"));
        flipped = true;
    }
}
