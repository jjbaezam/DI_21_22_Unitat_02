package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Button btn1 = new Button("Botó 1"); 
			Button btn2 = new Button("Botó 2");
			
			AnchorPane root = new AnchorPane(btn1, btn2);
			
			root.setTopAnchor(btn2, 10.0);
	        root.setRightAnchor(btn2, 10.0);

			Scene scene = new Scene(root,400,400);
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
