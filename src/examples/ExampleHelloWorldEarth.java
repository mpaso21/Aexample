package examples;



public class ExampleHelloWorldEarth {
	
//	package application;
//	
//	import java.util.Random;
//
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
//	public class Main extends Application {
//			
//		@Override
//		public void start(Stage theStage) {
//			theStage.setTitle( "Canvas Example" );
//	        
//		    Group root = new Group();
//		    Scene theScene = new Scene( root, 200, 200 );
//		    theStage.setScene( theScene );
//		         
//		    Canvas canvas = new Canvas( 400, 200 );
//		    root.getChildren().add( canvas );
//		         
//		    GraphicsContext gc = canvas.getGraphicsContext2D();
//		         
//		    gc.setFill( Color.RED );
//		    gc.setStroke( Color.LIGHTSLATEGRAY );
//		    gc.setLineWidth(2);
//		    Font theFont = Font.font( "Times New Roman", FontWeight.BOLD, 48 );
//		    gc.setFont( theFont );
//		    gc.fillText( "Hello, World!", 60, 50 );//colorato
//		    gc.strokeText( "Hello, World!", 60, 50 );//contonro 
//		 
//		   // gc.fillRect(0, 0, 10, 10);
//		    System.out.println(getClass().getResource("earth.png").toExternalForm()); //per inserire immagini salva in application + questa riga
//		    Image earth = new Image( getClass().getResource("earth.png").toExternalForm());
//		    gc.drawImage( earth, 180, 100 );
//		    //MOUSE CLICK PIXEL
//		    canvas.setOnMouseClicked(event -> {
//		    	Color c = new Color(Math.random(), Math.random(), Math.random(), 1d);
//		    	gc.setFill(c);
//		    	gc.fillRect(event.getX(), event.getY(), 10, 10);
//			});
//			//LINEA IMMAGINE
//		    gc.strokeLine(0, 0, 400, 200);
//			theStage.show();
//			
//		}
//		
//		public static void main(String[] args) {
//			launch(args);
//		}
//	}
}
