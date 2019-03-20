import java.util.ArrayList;
import java.util.Random;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Die
{
    ArrayList<String> dieImag = new ArrayList<String>();
    Random r = new Random();
    int curNum;
    Image die;
    ImageView dieView;
    
    public Die()
    {
        for(int i = 1; i < 7; i++)
        {
            dieImag.add("dice/die" + i + ".png");
        }
        
        curNum = r.nextInt(6) + 1;
        die = new Image(dieImag.get(curNum - 1));
        dieView = new ImageView(die);
    }

    public ImageView getDieImage()
    {
        return dieView;
    }
    
    public void rollDie()
    {
        curNum = r.nextInt(6) + 1;
        die = new Image(dieImag.get(curNum - 1));
        dieView = new ImageView(die);
    }
    
    public int getValue()
    {
        return curNum;
    }
}
