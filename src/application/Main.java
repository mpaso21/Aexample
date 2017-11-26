package application;

import examples.ExampleGameMoney;
import examples.ExampleKeyEvents;
import examples.ExampleMouseEvents;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		launch(args);
	}
//ciao questo è il mio pogetto
	@Override
	public void start(Stage primaryStage) throws Exception {
		new ExampleGameMoney(primaryStage);
	}
}
