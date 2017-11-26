package examples;

public class ExampleEarthRotation {
//	package application;
//	
//	import java.util.Random;
//
//	import javafx.animation.AnimationTimer;
//	import javafx.application.Application;
//	import javafx.stage.Stage;
//	import javafx.scene.Group;
//	import javafx.scene.Scene;
//	import javafx.scene.canvas.Canvas;
//	import javafx.scene.canvas.GraphicsContext;
//	import javafx.scene.image.Image;
//	import javafx.scene.layout.BorderPane;
//	import javafx.scene.paint.Color;
//	import javafx.scene.text.Font;
//	import javafx.scene.text.FontWeight;
//
//
//
//	public class Main extends Application {
//		//classe interna per usarla devo prima creare un oggetto della classe ext oPPURE la uso nella stessa classe
//		class X {
//		
//		}
//		
//		
//		@Override
//		public void start(Stage theStage) {
//			X interna = new X();
//			theStage.setTitle( "Timeline Example" );
//			 
//		    Group root = new Group();
//		    Scene theScene = new Scene( root );
//		    theStage.setScene( theScene );//metti la scena dentro lo stage
//		 
//		    Canvas canvas = new Canvas( 512, 512 );
//		    root.getChildren().add( canvas );
//		 
//		    GraphicsContext gc = canvas.getGraphicsContext2D();//creo un oggetto graficcontex
//		 
//		    //per caricare immagini oltre all' inserimento in source
//		    Image earth = new Imagec;
//		    Image sun   = new Image( getClass().getResource("sun.png").toExternalForm());
//		    Image space = new Image( getClass().getResource("space.png").toExternalForm());
//		 
//		    final long startNanoTime = System.nanoTime();//è un num che rappresenta l'ora in nanosecondi in cui avvio l'applicazione
//		 
//		    //def classe anonima, implemento metodo astratto
//		    new AnimationTimer()
//		    {//current segue start 10 11 12
//		        public void handle(long currentNanoTime)
//		        {//per modificare velocità cambio num diviso
//		            double t = (currentNanoTime - startNanoTime) / 3000000000.0; 
//		 
//		            double x = 232 + 128 * Math.cos(t);
//		            double y = 232 + 128 * Math.sin(t);
//		 
//		            // background image clears canvas
//		            gc.drawImage( space, 0, 0 );
//		            gc.drawImage( earth, x, y );
//		            gc.drawImage( sun, 196, 196 );
//		        }
//		    }.start();
//		    
////		    try {
////				Thread.sleep(5000);
////			} catch (InterruptedException e) {
////				// TODO Auto-generated catch block
////				e.printStackTrace();
////			}
//
//		    theStage.show();
//		
//		 
//		
//		}
//			
//		
//		
//		public static void main(String[] args) {
//			launch(args);
//		}
//	}

}
