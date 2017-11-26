package examples;

import java.util.HashSet;

import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ExampleKeyEvents {

	static Scene mainScene;
	static GraphicsContext graphicsContext;
	static int WIDTH = 512;
	static int HEIGHT = 256;

	static Image left;
	static Image leftGreen;

	static Image right;
	static Image rightGreen;

	// oggetti non ripetuti
	static HashSet<String> currentlyActiveKeys;

	public ExampleKeyEvents(Stage mainStage) {
		mainStage.setTitle("Event Handling");

		Group root = new Group();
		mainScene = new Scene(root);
		mainStage.setScene(mainScene);

		Canvas canvas = new Canvas(WIDTH, HEIGHT);
		root.getChildren().add(canvas);

		prepareActionHandlers();

		graphicsContext = canvas.getGraphicsContext2D();

		loadGraphics();

		graphicsContext.setFill(Color.BLUE);
		Font theFont = Font.font("Times New Roman", FontWeight.BOLD, 25);
		graphicsContext.setFont(theFont);
		/**
		 * Main "game" loop
		 */
		new AnimationTimer() {
			public void handle(long currentNanoTime) {
				tickAndRender();
			}
		}.start();

		mainStage.show();

	}

	private static void prepareActionHandlers() {
		// use a set so duplicates are not possible
		currentlyActiveKeys = new HashSet<String>();
	
		// key pressed tasto tastiera
		mainScene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				currentlyActiveKeys.add(event.getCode().toString());
			}
		});
		mainScene.setOnKeyReleased(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				currentlyActiveKeys.remove(event.getCode().toString());
			}
		});
	}

	private static void loadGraphics() {
		left = new Image(getResource("left.png"));
		leftGreen = new Image(getResource("leftG.png"));

		right = new Image(getResource("right.png"));
		rightGreen = new Image(getResource("rightG.png"));
	}

	// METODO PER percorso immagine, prima non avevamo il metodo
	private static String getResource(String filename) {
		return ExampleKeyEvents.class.getResource("../resources/" + filename).toExternalForm();
	}

	private static void tickAndRender() {
		// clear canvas
		graphicsContext.clearRect(0, 0, WIDTH, HEIGHT);

		if (currentlyActiveKeys.contains("LEFT")) {
			graphicsContext.drawImage(leftGreen, 64, 64);
		} else {
			graphicsContext.drawImage(left, 64, 64);
		}

		if (currentlyActiveKeys.contains("RIGHT")) {
			graphicsContext.drawImage(rightGreen, 320, 64);
		} else {
			graphicsContext.drawImage(right, 320, 64);
		}
		if (!currentlyActiveKeys.isEmpty()) {
			graphicsContext.fillText(currentlyActiveKeys.toArray()[0].toString(), 10, 25);
		}
	}
}