import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import java.util.ArrayList;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class Game extends Application
{
    private int dieTotal;
    private int selectedCardTotal = 0;
    private BorderPane mainPane = new BorderPane();
    private VBox dicePane = new VBox(5);
    private Deck deck = new Deck();
    private Die die1 = new Die();
    private Die die2 = new Die();
    private ArrayList<Card> cards = new ArrayList<Card>();
    private FlowPane cardPane = new FlowPane();
    private HBox butPane = new HBox();
    private FlowPane textPane = new FlowPane();
    private String status;
    private int numCards = 10;
    private int flippedCards = 0;
    public void start(Stage primaryStage)
    {
        dicePane.getChildren().add(die1.getDieImage());
        dicePane.getChildren().add(die2.getDieImage());
        dieTotal = die1.getValue() + die2.getValue();
        for(int i = 0; i < 10; i++)
        {
            cards.add(deck.getCard());
            cardPane.getChildren().add(cards.get(i).getCardImage());
        }
        mainPane.setLeft(dicePane);
        mainPane.setCenter(cardPane);
        Button confBut = new Button("Confirm");
        Button quitBut = new Button("Resign");
        butPane.getChildren().add(confBut);
        butPane.getChildren().add(quitBut);
        mainPane.setBottom(butPane);
        status = "Current Die Total: " + dieTotal +"\n";
        Text statText = new Text(status);
        textPane.getChildren().add(statText);
        mainPane.setRight(textPane);
        
        
        cards.get(0).getCardImage().setOnMouseClicked(e -> 
        {     
            if(cards.get(0).isSelected())
            {
                status = status.replaceFirst("Card value: " + cards.get(0).getCardVal() + "\n", "");
                statText.setText(status);
                
                
                (cards).get(0).select();
                selectedCardTotal -= cards.get(0).getCardVal();
            }
            else if(!((cards.get(0)).isSelected()) && !(cards.get(0).isFlipped()))
            {
                status += "Card value: " + cards.get(0).getCardVal() + "\n";
                statText.setText(status);
                
                (cards).get(0).select();
                selectedCardTotal += cards.get(0).getCardVal();
            }
        });
        cards.get(1).getCardImage().setOnMouseClicked(e -> 
        {     
            if(cards.get(1).isSelected())
            {
                status = status.replaceFirst("Card value: " + cards.get(1).getCardVal() + "\n", "");
                statText.setText(status);
                
                (cards).get(1).select();
                selectedCardTotal -= cards.get(1).getCardVal();
            }
            else if(!((cards.get(1)).isSelected()) && !(cards.get(1).isFlipped()))
            {
                status += "Card value: " + cards.get(1).getCardVal() + "\n";
                statText.setText(status);
                
                (cards).get(1).select();
                selectedCardTotal += cards.get(1).getCardVal();
            }
        });
        cards.get(2).getCardImage().setOnMouseClicked(e -> 
        {     
            if(cards.get(2).isSelected())
            {
                status = status.replaceFirst("Card value: " + cards.get(2).getCardVal() + "\n", "");
                statText.setText(status);
                
                (cards).get(2).select();
                selectedCardTotal -= cards.get(2).getCardVal();
            }
            else if(!((cards.get(2)).isSelected()) && !(cards.get(2).isFlipped()))
            {
                status += "Card value: " + cards.get(2).getCardVal() + "\n";
                statText.setText(status);
                
                (cards).get(2).select();
                selectedCardTotal += cards.get(2).getCardVal();
            }
        });
        cards.get(3).getCardImage().setOnMouseClicked(e -> 
        {     
            if(cards.get(3).isSelected())
            {
                status = status.replaceFirst("Card value: " + cards.get(3).getCardVal() + "\n", "");
                statText.setText(status);
                
                (cards).get(3).select();
                selectedCardTotal -= cards.get(3).getCardVal();
            }
            else if(!((cards.get(3)).isSelected()) && !(cards.get(3).isFlipped()))
            {
                status += "Card value: " + cards.get(3).getCardVal() + "\n";
                statText.setText(status);
                
                
                (cards).get(3).select();
                selectedCardTotal += cards.get(3).getCardVal();
            }
        });
        cards.get(4).getCardImage().setOnMouseClicked(e -> 
        {     
            if(cards.get(4).isSelected())
            {
                status = status.replaceFirst("Card value: " + cards.get(4).getCardVal() + "\n", "");
                statText.setText(status);
                
                (cards).get(4).select();
                selectedCardTotal -= cards.get(4).getCardVal();
            }
            else if(!((cards.get(4)).isSelected()) && !(cards.get(4).isFlipped()))
            {
                status += "Card value: " + cards.get(4).getCardVal() + "\n";
                statText.setText(status);
                
                (cards).get(4).select();
                selectedCardTotal += cards.get(4).getCardVal();
            }
        });
        cards.get(5).getCardImage().setOnMouseClicked(e -> 
        {     
            if(cards.get(5).isSelected())
            {
                status = status.replaceFirst("Card value: " + cards.get(5).getCardVal() + "\n", "");
                statText.setText(status);
                
                (cards).get(5).select();
                selectedCardTotal -= cards.get(5).getCardVal();
            }
            else if(!((cards.get(5)).isSelected()) && !(cards.get(5).isFlipped()))
            {
                status += "Card value: " + cards.get(5).getCardVal() + "\n";
                statText.setText(status);
                
                
                (cards).get(5).select();
                selectedCardTotal += cards.get(5).getCardVal();
            }
        });
        cards.get(6).getCardImage().setOnMouseClicked(e -> 
        {     
            if(cards.get(6).isSelected())
            {
                status = status.replaceFirst("Card value: " + cards.get(6).getCardVal() + "\n", "");
                statText.setText(status);
                
                (cards).get(6).select();
                selectedCardTotal -= cards.get(6).getCardVal();
            }
            else if(!((cards.get(6)).isSelected()) && !(cards.get(6).isFlipped()))
            {
                status += "Card value: " + cards.get(6).getCardVal() + "\n";
                statText.setText(status);
                
                
                (cards).get(6).select();
                selectedCardTotal += cards.get(6).getCardVal();
            }
        });
        cards.get(7).getCardImage().setOnMouseClicked(e -> 
        {     
            if(cards.get(7).isSelected())
            {
                status = status.replaceFirst("Card value: " + cards.get(7).getCardVal() + "\n", "");
                statText.setText(status);
                
                (cards).get(7).select();
                selectedCardTotal -= cards.get(7).getCardVal();
            }
            else if(!((cards.get(7)).isSelected()) && !(cards.get(7).isFlipped()))
            {
                status += "Card value: " + cards.get(7).getCardVal() + "\n";
                statText.setText(status);
                
                (cards).get(7).select();
                selectedCardTotal += cards.get(7).getCardVal();
            }
        });
        cards.get(8).getCardImage().setOnMouseClicked(e -> 
        {     
            if(cards.get(8).isSelected())
            {
                status = status.replaceFirst("Card value: " + cards.get(8).getCardVal() + "\n", "");
                statText.setText(status);
                
                (cards).get(8).select();
                selectedCardTotal -= cards.get(8).getCardVal();
            }
            else if(!((cards.get(8)).isSelected()) && !(cards.get(8).isFlipped()))
            {
                status += "Card value: " + cards.get(8).getCardVal() + "\n";
                statText.setText(status);
                
                (cards).get(8).select();
                selectedCardTotal += cards.get(8).getCardVal();
            }
        });
        cards.get(9).getCardImage().setOnMouseClicked(e -> 
        {     
            if(cards.get(9).isSelected())
            {
                status = status.replaceFirst("Card value: " + cards.get(9).getCardVal() + "\n", "");
                statText.setText(status);
                
                (cards).get(9).select();
                selectedCardTotal -= cards.get(9).getCardVal();
            }
            else if(!((cards.get(9)).isSelected()) && !(cards.get(9).isFlipped()))
            {
                status += "Card value: " + cards.get(9).getCardVal() + "\n";
                statText.setText(status);
                
                (cards).get(9).select();
                selectedCardTotal += cards.get(9).getCardVal();
            }
        });
            
        confBut.setOnAction(e -> {
            if(dieTotal != selectedCardTotal)
            {
                status = "Current Die Total: " + dieTotal +"\n";
                statText.setText(status);
                
                for(int i = 0; i < cards.size(); i++)
                {
                    if(cards.get(i).isSelected())
                    {
                        cards.get(i).select();
                    }
                }
                selectedCardTotal = 0;
            }
            else
            {
                for(int i = 0; i < cards.size(); i++)
                {
                    if(cards.get(i).isSelected())
                    {
                        cardPane.getChildren().remove(cards.get(i).getCardImage());
                        cards.get(i).select();
                        cards.get(i).flip();
                        flippedCards++;
                        cardPane.getChildren().add(cards.get(i).getCardImage());
                    }
                }
                selectedCardTotal = 0;
                dicePane.getChildren().clear();
                die1.rollDie();
                die2.rollDie();
                dicePane.getChildren().add(die1.getDieImage());
                dicePane.getChildren().add(die2.getDieImage());
                dieTotal = die1.getValue() + die2.getValue();
                status = "Current Die Total: " + dieTotal +"\n";
                statText.setText(status);
                if(flippedCards == numCards)
                {
                    statText.setText("Congratulations, you win");
                }
            }
        });
        
        quitBut.setOnAction(e -> {
            int totalRemain = 0;
            for(int i = 0; i < cards.size(); i++)
            {
                if(!(cards.get(i).isFlipped()))
                {
                    cards.get(i).flip();
                    totalRemain += cards.get(i).getCardVal();
                }
            }
            statText.setText("You gave up! Your final score is: " + totalRemain);
        });
        Scene scene = new Scene(mainPane);
        primaryStage.setTitle("ShowImage"); 
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
