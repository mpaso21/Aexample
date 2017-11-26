package examples;

import java.util.ArrayList;
import java.util.Iterator;

import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import utility.IntValue;
import utility.LongValue;
import utility.Sprite;

public class ExampleGameMoney {
	public ExampleGameMoney(Stage theStage){
		theStage.setTitle( "Collect the Money Bags!" );

        Group root = new Group();
        Scene theScene = new Scene( root );
        theStage.setScene( theScene );

        Canvas canvas = new Canvas( 512, 512 );
        root.getChildren().add( canvas );

        ArrayList<String> input = new ArrayList<String>();

        theScene.setOnKeyPressed(//quando clicco tasto tastiera
            new EventHandler<KeyEvent>()
            {
                public void handle(KeyEvent e)
                {
                    String code = e.getCode().toString();
                    if ( !input.contains(code) )
                        input.add( code );
                }
            });

        theScene.setOnKeyReleased(
            new EventHandler<KeyEvent>()
            {
                public void handle(KeyEvent e)
                {
                    String code = e.getCode().toString();
                    input.remove( code );
                }
            });

        GraphicsContext gc = canvas.getGraphicsContext2D();

        Font theFont = Font.font( "Helvetica", FontWeight.BOLD, 24 );//grassetto
        gc.setFont( theFont );
        gc.setFill( Color.GREEN );
        gc.setStroke( Color.BLACK );
        gc.setLineWidth(1);//spessore linea 1 
        
        Sprite briefcase = new Sprite();
        briefcase.setImage(getClass().getResource("../resources/briefcase.png" ).toExternalForm());
        briefcase.setPosition(200, 0);
        
        ArrayList<Sprite> moneybagList = new ArrayList<Sprite>();
        
        for (int i = 0; i < 15; i++)
        {
            Sprite moneybag = new Sprite(); //sprite entità di gioco
            moneybag.setImage(getClass().getResource("../resources/moneybag.png" ).toExternalForm());
            double px = 350 * Math.random() + 50;
            double py = 350 * Math.random() + 50;          
            moneybag.setPosition(px,py);
            moneybagList.add( moneybag );
        }
        
        LongValue lastNanoTime = new LongValue( System.nanoTime() );//tempo attuale in nano

        IntValue score = new IntValue(0);//punteggio

        new AnimationTimer()
        {
            public void handle(long currentNanoTime)
            {
                // calculate time since last update.tempo passato = (tempo attuale - tempo di partenza)/10^9
                double elapsedTime = (currentNanoTime - lastNanoTime.value) / 1000000000.0;
                lastNanoTime.value = currentNanoTime;
                
                // game logic
                
                briefcase.setVelocity(0,0);
                if (input.contains("LEFT"))
                    briefcase.addVelocity(-50,0);
                if (input.contains("RIGHT"))
                    briefcase.addVelocity(50,0);
                if (input.contains("UP"))
                    briefcase.addVelocity(0,-50);
                if (input.contains("DOWN"))
                    briefcase.addVelocity(0,50);
                    
                System.out.println(elapsedTime);
                briefcase.update(0.017);
                
                // collision detection
                
                Iterator<Sprite> moneybagIter = moneybagList.iterator();
                while ( moneybagIter.hasNext() )
                {
                    Sprite moneybag = moneybagIter.next();//next mi ritorna il 1 elemento
                    if ( briefcase.intersects(moneybag) )
                    {
                        moneybagIter.remove();
                        score.value++;//prendo punti soldi se collido la moneta
                    }
                }
                
                // render
                
                gc.clearRect(0, 0, 512,512);//pulisci la canvas
                briefcase.render( gc );
                
                for (Sprite moneybag : moneybagList )
                    moneybag.render( gc );//per disegnare moneybag

                String pointsText = "Cash: $" + (100 * score.value);
                gc.fillText( pointsText, 360, 36 );
                gc.strokeText( pointsText, 360, 36 );
            }
        }.start();

theStage.show();
	}
}
