package view;

import java.util.logging.Level;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main  extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene;

		try {
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("homePage.fxml"));
			scene = new Scene(root);
			primaryStage.setTitle("Benvenuto nella homePage");
			primaryStage.setScene(scene);
			primaryStage.show();
		} 
		catch (Exception e)
		{
			java.util.logging.Logger.getLogger("main page").log(Level.SEVERE,"\n eccezione ottenuta .",e);

			
		}
		
	}

}
