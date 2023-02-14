package view;

import java.util.logging.Level;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class BoundaryHomePage {

	@FXML
	private Pane pane;
	@FXML
	private Label header;
	@FXML
	private Button catalogo;
	
	@FXML
	public void catalogo()
	{
		Stage primaryStage = null;
		Scene scene;

		try {
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("catalogo.fxml"));
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
