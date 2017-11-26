package examples;

public class ExampleTimelineTwoEarth {
//	package application;
//	
//	import java.util.Random;
//
//	import javafx.animation.AnimationTimer;
//	import javafx.animation.KeyFrame;
//	import javafx.animation.Timeline;
//	import javafx.application.Application;
//	import javafx.event.ActionEvent;
//	import javafx.event.EventHandler;
//	import javafx.stage.Stage;
//	import javafx.util.Duration;
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
//		
//		@Override
//		public void start(Stage theStage) {
//			 
//			        theStage.setTitle( "Timeline Example" );
//			        
//			        Group root = new Group();
//			        Scene theScene = new Scene( root );
//			        theStage.setScene( theScene );
//			        
//			        Canvas canvas = new Canvas( 512, 512 );
//			        root.getChildren().add( canvas );
//			        
//			        GraphicsContext gc = canvas.getGraphicsContext2D();
//			        
//			        Image earth = new Image(getClass().getResource("earth.png").toExternalForm());
//			        Image earth2 = new Image(getClass().getResource("earth.png").toExternalForm());
//			        Image sun   = new Image(getClass().getResource("sun.png").toExternalForm());
//			        Image space = new Image(getClass().getResource("space.png").toExternalForm());
//			        
//			        Timeline gameLoop = new Timeline();
//			        gameLoop.setCycleCount( Timeline.INDEFINITE );//indefinita non si ferma oppure numero predefinito dopo 10 sec si ferma animazione 
//			        
//			        final long timeStart = System.currentTimeMillis();//millisecondi tempo corrente
//			        
//			        KeyFrame kf = new KeyFrame(
//			            Duration.seconds(0.017),                // 60 FPS
//			            new EventHandler<ActionEvent>()
//			            {
//			                public void handle(ActionEvent ae)
//			                {
//			                    double t = (System.currentTimeMillis() - timeStart) / 1000.0; 
//			                                
//			                    double x = 232 + 128 * Math.cos(t);
//			                    double y = 232 + 128 * Math.sin(t);
//			                    
//			                    // Clear the canvas
//			                    gc.clearRect(0, 0, 512,512);
//			                    
//			                    // background image clears canvas
//			                    gc.drawImage( space, 0, 0 );
//			                    gc.drawImage( earth, x, y );
//			                    gc.drawImage( sun, 196, 196 );
//			                  
//			                }
//			            });
//			        
//			        
//			        KeyFrame kf2 = new KeyFrame(
//				            Duration.seconds(0.017),                // 60 FPS
//				            new EventHandler<ActionEvent>()
//				            {
//				                public void handle(ActionEvent ae)
//				                {
//				                    double t = (System.currentTimeMillis() - timeStart) / 1000.0; 
//
//				                    double x2 = 232 + 128 * Math.cos(t);
//				                    double y2 = 232 + 128 * Math.cos(t);          
//				                
//				                    
//				                    // background image clears canvas
//				                    gc.drawImage( earth2, x2, y2 );
//				                
//				                }
//				            });
//				        	        
//			        gameLoop.getKeyFrames().addAll( kf, kf2);
//			        gameLoop.play();
//			        
//			        theStage.show();
//			    }
//
//		public static void main(String[] args) {
//			launch(args);
//		}
//	}

}
