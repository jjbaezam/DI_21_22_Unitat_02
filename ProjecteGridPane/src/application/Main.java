package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Button button1 = new Button("Button 1");
	        Button button2 = new Button("Button 2");
	        Button button3 = new Button("Button 3");
	        Button button4 = new Button("Button 4");
	        Button button5 = new Button("Button 5");
	        Button button6 = new Button("Button 6");

	        GridPane root = new GridPane();

	        root.add(button1, 0, 0, 1, 1);
	        root.add(button2, 1, 0, 1, 1);
	        root.add(button3, 2, 0, 1, 1);
	        root.add(button4, 0, 1, 1, 1);
	        root.add(button5, 1, 1, 1, 1);
	        root.add(button6, 4, 4, 1, 1);
	        
			Scene scene = new Scene(root,400,200);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
