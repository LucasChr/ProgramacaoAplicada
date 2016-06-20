package aplication;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import lombok.Getter;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
 
public class Main extends Application {
	public final static String PATH_VIEW = "../view/";

	@Getter
	private static AnchorPane rootLayout;
	@Getter
	private static Stage primaryStage; 

	@Override
	public void start(Stage primaryStage) {
		try {
			Main.primaryStage = primaryStage;
			Main.rootLayout = (AnchorPane) FXMLLoader.load(getClass().getResource(PATH_VIEW + "telefoneView.fxml"));
			
			Scene scene = new Scene(rootLayout);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setTitle("Encontra Maior");
			
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
