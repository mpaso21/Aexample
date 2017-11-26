package examples;

public class ExampleAnimationFrame {
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
//	public class Main extends Application {
//
//		@Override
//		public void start(Stage theStage) {
//			theStage.setTitle("AnimatedImage Example");
//
//			Group root = new Group();
//			Scene theScene = new Scene(root);
//			theStage.setScene(theScene);
//
//			Canvas canvas = new Canvas(512, 512);
//			root.getChildren().add(canvas);
//
//			GraphicsContext gc = canvas.getGraphicsContext2D();
//
//			Image earth = new Image(getClass().getResource("../resources/earth.png").toExternalForm());;
//			Image sun = new Image(getClass().getResource("../resources/sun.png").toExternalForm());
//			Image space = new Image(getClass().getResource("../resources/space.png").toExternalForm());
//
//			AnimatedImage ufo = new AnimatedImage();
//			Image[] imageArray = new Image[6];
//			for (int i = 0; i < 6; i++)
//				imageArray[i] = new Image(getClass().getResource("../resources/ufo_" + i + ".png").toExternalForm());
//			ufo.frames = imageArray; //inizializzi l'array
//			ufo.duration = 0.100;
//
//			final long startNanoTime = System.nanoTime();
//
//			gc.setFill(Color.ANTIQUEWHITE);
//			 Font theFont = Font.font( "Times New Roman", FontWeight.BOLD, 25);
//			 gc.setFont( theFont );
//			 
//			new AnimationTimer() {
//				public void handle(long currentNanoTime) {
//					double t = (currentNanoTime - startNanoTime) / 1000000000.0;
//					double x = 232 + 128 * Math.cos(t);
//					double y = 232 + 128 * Math.sin(t);
//
//
//					gc.drawImage(space, 0, 0);
//					gc.fillText(String.valueOf(t), 10, 20);
////					gc.drawImage(earth, x, y);
//					gc.drawImage(sun, 196, 196);
//					gc.drawImage(ufo.getFrame(t), x, y);
//				}
//			}.start();
//			theStage.show();
//		}
//
//		public static void main(String[] args) {
//			launch(args);
//		}
//	}

}
